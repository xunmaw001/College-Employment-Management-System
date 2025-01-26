<template>
<div class="content">
	<div class="text" :style='{"margin":"50px auto","fontSize":"24px","color":"rgb(51, 51, 51)","textAlign":"center","fontWeight":"bold"}'>欢迎使用 {{this.$project.projectName}}</div>
    <div class="cardView">
        <div class="cards" :style='{"margin":"0 0 20px 0","alignItems":"center","justifyContent":"center","display":"flex"}'>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"4px","display":"flex"}' v-if="isAuth('biyesheng','首页总数')">
				<div :style='{"width":"80px","background":"#4BB6D0","height":"80px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{biyeshengCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>毕业生总数</div>
				</div>
			</div>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"4px","display":"flex"}' v-if="isAuth('zhengshijiuye','首页总数')">
				<div :style='{"width":"80px","background":"#4BB6D0","height":"80px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{zhengshijiuyeCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>正式就业总数</div>
				</div>
			</div>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"4px","display":"flex"}' v-if="isAuth('shixijiuye','首页总数')">
				<div :style='{"width":"80px","background":"#4BB6D0","height":"80px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{shixijiuyeCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>实习就业总数</div>
				</div>
			</div>
        </div>
        <div style="display: flex;align-items: center;width: 100%;margin-bottom: 10px;">
            <el-card style="width: 50%;margin: 0 10px;" v-if="isAuth('biyesheng','首页统计')">
                <div id="biyeshengChart1" style="width:100%;height:400px;"></div>
            </el-card>
            <el-card style="width: 50%;margin: 0 10px;" v-if="isAuth('shixijiuye','首页统计')">
                <div id="shixijiuyeChart1" style="width:100%;height:400px;"></div>
            </el-card>
        </div>
    </div>
</div>
</template>
<script>
//2
import router from '@/router/router-static'
export default {
	data() {
		return {
            biyeshengCount: 0,
            zhengshijiuyeCount: 0,
            shixijiuyeCount: 0,
		};
	},
  mounted(){
    this.init();
    this.getbiyeshengCount();
    this.biyeshengChat1();
    this.getzhengshijiuyeCount();
    this.getshixijiuyeCount();
    this.shixijiuyeChat1();
  },
  methods:{
    init(){
        if(this.$storage.get('Token')){
        this.$http({
            url: `${this.$storage.get('sessionTable')}/session`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code != 0) {
            router.push({ name: 'login' })
            }
        });
        }else{
            router.push({ name: 'login' })
        }
    },
    getbiyeshengCount() {
        this.$http({
            url: `biyesheng/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.biyeshengCount = data.data
            }
        })
    },

    biyeshengChat1() {
      this.$nextTick(()=>{

        var biyeshengChart1 = this.$echarts.init(document.getElementById("biyeshengChart1"),'cool');
        this.$http({
            url: "biyesheng/typeStat/jiuyezhuangtai/yuanxi",
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis1 = [];
                let yAxis2 = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].yuanxi);
                    yAxis1.push(parseFloat((res[i].待就业)));
                    yAxis2.push(parseFloat((res[i].已就业)));
                    pArray.push({
                        name: res[i].jiuyezhuangtai
                    })
                }
                var option = {};
                option = {
                    title: {
                        text: '院系就业人数统计',
                    },
                    legend: {
                      data: [
                        '待就业',
                        '已就业',
                        ]
                    },
                    tooltip: {
                      trigger: 'axis'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [
                    {
                        name: '待就业',
                        data: yAxis1,
                        type: 'bar'
                    },
                    {
                        name: '已就业',
                        data: yAxis2,
                        type: 'bar'
                    },
                    ],
                };
                // 使用刚指定的配置项和数据显示图表。
                biyeshengChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    biyeshengChart1.resize();
                };
            }
        });
      })
    },






    getzhengshijiuyeCount() {
        this.$http({
            url: `zhengshijiuye/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.zhengshijiuyeCount = data.data
            }
        })
    },
    getshixijiuyeCount() {
        this.$http({
            url: `shixijiuye/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.shixijiuyeCount = data.data
            }
        })
    },

    shixijiuyeChat1() {
      this.$nextTick(()=>{
        // shixigangwei shixigangwei
        //  shixixinzi

        var shixijiuyeChart1 = this.$echarts.init(document.getElementById("shixijiuyeChart1"),'macarons');
        this.$http({
            url: `shixijiuye/value/shixigangwei/shixixinzi`,
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].shixigangwei);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].shixigangwei
                    })
                }
                var option = {};
                option = {
                    title: {
                        text: '实习岗位薪资统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                shixijiuyeChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    shixijiuyeChart1.resize();
                };
            }
        });
      })
    },






  }
};
</script>
<style lang="scss" scoped>
    .cardView {
        display: flex;
        flex-wrap: wrap;
        width: 100%;

        .cards {
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 10px;
            justify-content: center;
            .card {
                width: calc(25% - 20px);
                margin: 0 10px;
                /deep/.el-card__body{
                    padding: 0;
                }
            }
        }
    }
</style>
