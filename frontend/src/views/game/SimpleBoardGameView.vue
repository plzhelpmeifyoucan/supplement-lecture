<template>
    <div>
        <!-- 현재 누구의 차례인지 표기 -->
        <table-component
            :table-data="tableData"
            :current-turn-shape="currentTurnShape"/>
        <!-- 누가 이겼는지 출력 -->
    </div>
</template>

<script>
    

    export default {
        name: "SimpleBoardGameView",
        components: {
            TableComponent
        },
        data () {
            return {
                currentTurnShape: 'O',
                winner: '',
                tableData: [
                    ['', '', '', '', ''],
                    ['', '', '', '', ''],
                    ['', '', '', '', ''],
                    ['', '', '', '', ''],
                    ['', '', '', '', ''],
                ]
            }
        },
        methods: {

        }
    }

</script>