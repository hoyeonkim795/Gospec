<template>

<div class="contestcard">
  <v-row dense
  >
  <v-col v-for="each in contest" v-bind:key="each.contestNo">
  <v-hover v-slot:default="{ hover }">
    <v-card
      max-width="300"
      style="margin: auto;"
      class ="rounded-xl"
      :aspect-ratio="16/9"
    >
    <router-link :to="{ path: '/contest/' + each.contestNo}">
      <v-img
        class="white--text align-end rounded-lg"
        :src="'http://i3a202.p.ssafy.io:8181/api/file/download/' + each.imgSrc"
      >
        <v-expand-transition>
          <div
            v-if="hover"
            class="d-flex transition-fast-in-fast-out grey darken-4 v-card--reveal"
            style="height: 100%; font-size:20px; color:white; "
            v-text="each.title"
          >
          </div>
        </v-expand-transition>
      </v-img>
      </router-link>
      <div class="line1">
        <LikeState2 class='_bookmark' :selectedEvent="each"/>
        <div class='detailLink'>
          {{each.totalReward}}
        </div>
        <Dday class="dday" :data='each'/>
      </div>
      <div class='line2'>
        {{each.startDate + ' ~ ' +each.endDate}}
      </div>
    </v-card>
    </v-hover>
  </v-col>
</v-row>
</div>
</template>

<script>
import Dday from '@/components/contest/Dday.vue'
import LikeState2 from '@/components/common/LikeState2.vue'
  export default {
    components:{
      LikeState2,
      Dday
    },
    props:{
      contest: {
        type:Array
      }
    },
    data() {
      return {
      }
    }
  }

</script>
<style>
.card{
  display: inline-block;
  border-radius: 10px;
  

}
.v-card--reveal {
  align-items: center;
  bottom: 0;
  justify-content: center;
  opacity: .5;
  position: absolute;
  width: 100%;
  
}
.ddayhome {
  display: inline-block;
  font-size: 20px;
}
.text_detail {
  margin-top:4px;
  color:black;
  font-size: 15px;
} 
.line1 {
  padding: 10px;
  display: flex;
  align-items: center;
  font-size: 15px;
}
._bookmark {flex: 0 0 auto;}
.detailLink {flex: 1 1 0; color: gray;}
.dday {flex: 0 0 auto;}

.linkstyle {
  text-decoration: none !important;
  color: black !important;
  border-radius: 10px;
  padding: 5px 15px;
  background-color: #eeeeee;
}
.linkstyle:hover {
  background-color: #dddddd;
}
.line2 {
  font-size: 15px;
  padding-bottom: 10px;
}
</style>
