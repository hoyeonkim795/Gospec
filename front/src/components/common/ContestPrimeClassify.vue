<template>
<div class="middle">
    <div class="horizontal">
        <v-card outlined>
            <v-tabs color="error" center-active centered show-arrows>

            <v-tabs-slider color="error"></v-tabs-slider>
                <v-tab v-for="type in TYPES" :key="type"
                    @click='pageChange(type)'>
                    {{ typeToTextFilter(type) }}
                </v-tab>
            </v-tabs>
        </v-card>
    </div>
</div>
</template>

<script> 
export default {
    name: 'ContestTypeNavBar',
    computed: {
        typeNow() {
            return this.$store.state.ContestList.params.type;
        },
    },
    methods : {
        pageChange(type) {
            this.$store.commit('setType', type);
            this.$store.commit('setMode', 'all');
            this.$store.commit('setPage', 1);
            this.$store.dispatch('getContestList');
            this.$store.dispatch('getTopContestList');
        },
        typeToTextFilter(string) {
            return string == 'all' ? '전체' : string.replace(/-/g,'/');
        }
    },
    data() {
        return {
            TYPES: ['all','기획-아이디어','광고-마케팅','논문-리포트','영상-UCC-사진',
                '디자인-캐릭터-웹툰','웹-모바일-플래시','게임-소프트웨어','과학-공학',
                '문학-글-시나리오','건축-건설-인테리어','네이밍-슬로건','예체능-미술-음악',
                '대외활동-서포터즈','봉사활동','취업-창업','해외','기타'
            ],
        }
    },
}
</script>

<style scoped>
.middle {
    display: block;
    margin: auto;
}

.horizontal li {
    display: inline-block;
    margin: 10px;
}

.selected {
    background-color: #dddddd;
}
</style>>