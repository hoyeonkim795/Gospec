<template>
  <div>
    <v-card-text class='p-0'>
      <v-chip-group
        v-model="amenities"
        column
        multiple
        @change='submitAmenities'
      >
        <v-chip v-for='interest in interests' :key='interest.id' filter outlined>{{ interest }}</v-chip>
      </v-chip-group>
    </v-card-text>
  </div>
</template>

<script>
export default {
  data() {
    return{
      interests: ['기획/아이디어', '광고/마케팅', '논문/리포트', '영상/UCC/사진', '디자인/캐릭터/웹툰', '웹/모바일/플래시', '게임/소프트웨어', '과학/공학', '문학/글/시나리오', '건축/건설/인테리어', '네이밍/슬로건', '예체능/미술/음악', '대외활동/서포터즈', '봉사활동', '취업/창업', '해외', '기타'],
      interestsData: ['기획-아이디어', '광고-마케팅', '논문-리포트', '영상-UCC-사진', '디자인-캐릭터-웹툰', '웹-모바일-플래시', '게임-소프트웨어', '과학-공학', '문학-글-시나리오', '건축-건설-인테리어', '네이밍-슬로건', '예체능-미술-음악', '대외활동-서포터즈', '봉사활동', '취업-창업', '해외', '기타'],
      amenities: null,
    }
  },
  watch: {
    interestFieldList() {
      this.setAmenities()
    }
  },
  props: {
    interestFieldList: Array
  },
  methods: {
    submitAmenities() {
      const interestList = []
      for(let i=0; i<this.amenities.length; i++) {
        interestList.push(this.interestsData[this.amenities[i]])
        }
      this.$emit('submit-amenities', interestList)
    },
    setAmenities() {
      this.amenities = []
        for(let i=0; i<this.interestFieldList.length; i++) {
          this.amenities.push(this.interestsData.indexOf(this.interestFieldList[i]))
      }
    }
  },
}
</script>

<style>

</style>