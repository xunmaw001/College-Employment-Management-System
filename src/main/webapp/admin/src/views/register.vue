<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","backgroundAttachment":"fixed","alignItems":"center","background":"url(http://codegen.caihongy.cn/20220806/957ba09956674a01965e34ddbeb4e52a.gif)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
			<el-form v-if="pageFlag=='register'" :style='{"padding":"6% 0 20px","boxShadow":"0 0px 0px rgba(64, 158, 255, .8)","margin":"0","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20220729/84a222ad60694a858f31f8d1083e7803.png) center center/cover","width":"800px","height":"100vh"}' ref="rgsForm" class="rgs-form" :model="rgsForm">
				<div v-if="true" :style='{"margin":"0 0 10px 0","color":"#000","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"24px","fontWeight":"bold"}' class="title">基于ssm的高校就业管理系统的设计和实现注册</div>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='yuanxijiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">院系账号</div>
					<el-input  v-model="ruleForm.yuanxizhanghao"  autocomplete="off" placeholder="院系账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='yuanxijiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='yuanxijiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='yuanxijiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">教师姓名</div>
					<el-input  v-model="ruleForm.jiaoshixingming"  autocomplete="off" placeholder="教师姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='yuanxijiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">院系</div>
                    <el-select v-model="ruleForm.yuanxi" placeholder="请选择院系">
                        <el-option
                            v-for="(item,index) in yuanxijiaoshiyuanxiOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='yuanxijiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
                        <el-option
                            v-for="(item,index) in yuanxijiaoshixingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='yuanxijiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">照片</div>
                    <file-upload
                        tip="点击上传照片"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
                        @change="yuanxijiaoshizhaopianUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='yuanxijiaoshi'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">联系电话</div>
					<el-input  v-model="ruleForm.lianxidianhua"  autocomplete="off" placeholder="联系电话"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">学号</div>
					<el-input  v-model="ruleForm.xuehao"  autocomplete="off" placeholder="学号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">密码</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">确认密码</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">学生姓名</div>
					<el-input  v-model="ruleForm.xueshengxingming"  autocomplete="off" placeholder="学生姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">性别</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
                        <el-option
                            v-for="(item,index) in biyeshengxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">头像</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="biyeshengtouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">学生手机</div>
					<el-input  v-model="ruleForm.xueshengshouji"  autocomplete="off" placeholder="学生手机"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">院系账号</div>
                    <el-select @change="biyeshengyuanxizhanghaoChange" v-model="ruleForm.yuanxizhanghao" placeholder="请选择院系账号">
                        <el-option
                            v-for="(item,index) in biyeshengyuanxizhanghaoOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">院系</div>
					<el-input  v-model="ruleForm.yuanxi" readonly autocomplete="off" placeholder="院系"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">班级</div>
					<el-input  v-model="ruleForm.banji"  autocomplete="off" placeholder="班级"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"width":"70%","padding":"0","margin":"20px auto","height":"auto"}' class="list-item" v-if="tableName=='biyesheng'">
					<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}' class="lable">就业状态</div>
                    <el-select v-model="ruleForm.jiuyezhuangtai" placeholder="请选择就业状态">
                        <el-option
                            v-for="(item,index) in biyeshengjiuyezhuangtaiOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<button :style='{"border":"0","cursor":"pointer","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","margin":"20px auto 5px","color":"#fff","display":"block","outline":"none","borderRadius":"0","background":"linear-gradient(137deg, #04AAE4 0%, #A3E7FF 100%)","width":"70%","fontSize":"16px","fontWeight":"bold","height":"60px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0 10%","color":"rgba(159, 159, 159, 1)","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"12px","textDecoration":"underline"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
			
		</div>
	</div>
</template>

<script>

export default {
	data() {
		return {
			ruleForm: {
                yuanxi: '',
                xingbie: '',
                xingbie: '',
                yuanxi: '',
                jiuyezhuangtai: '',
			},

            pageFlag : '',
			tableName:"",
			rules: {},
            yuanxijiaoshiyuanxiOptions: [],
            yuanxijiaoshixingbieOptions: [],
            biyeshengxingbieOptions: [],
            biyeshengyuanxizhanghaoOptions: [],
            biyeshengjiuyezhuangtaiOptions: [],
		};
	},
	mounted(){
        this.pageFlag = this.$storage.get("pageFlag");
		let table = this.$storage.get("loginTable");
		this.tableName = table;
        this.$http({
            url: `option/yuanxi/yuanxi`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code === 0) {
                this.yuanxijiaoshiyuanxiOptions = data.data;
            } else {
                this.$message.error(data.msg);
            }
        });
        this.yuanxijiaoshixingbieOptions = "男,女".split(',')
        this.biyeshengxingbieOptions = "男,女".split(',')
        this.$http({
            url: `option/yuanxijiaoshi/yuanxizhanghao`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code === 0) {
                this.biyeshengyuanxizhanghaoOptions = data.data;
            } else {
                this.$message.error(data.msg);
            }
        });
        this.biyeshengjiuyezhuangtaiOptions = "已就业,待就业".split(',')
	},
	created() {
    
	},
	destroyed() {
		  	},
	methods: {
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        yuanxijiaoshizhaopianUploadChange(fileUrls) {
            this.ruleForm.zhaopian = fileUrls;
        },
        biyeshengtouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        // 下二随
        biyeshengyuanxizhanghaoChange () {
            this.$http({
                url: `follow/yuanxijiaoshi/yuanxizhanghao?columnValue=`+ this.ruleForm.yuanxizhanghao,
                method: "get"
            }).then(({ data }) => {
                if (data && data.code === 0) {
                    if(data.data.yuanxi){
                        this.ruleForm.yuanxi = data.data.yuanxi
                    }
                } else {
                    this.$message.error(data.msg);
                }
            });
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.yuanxizhanghao) && `yuanxijiaoshi` == this.tableName){
						this.$message.error(`院系账号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `yuanxijiaoshi` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `yuanxijiaoshi` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if((!this.ruleForm.jiaoshixingming) && `yuanxijiaoshi` == this.tableName){
						this.$message.error(`教师姓名不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.yuanxi) && `yuanxijiaoshi` == this.tableName){
						this.$message.error(`院系不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
            if(this.ruleForm.zhaopian!=null) {
                this.ruleForm.zhaopian = this.ruleForm.zhaopian.replace(new RegExp(this.$base.url,"g"),"");
            }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`yuanxijiaoshi` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
						this.$message.error(`联系电话应输入手机格式`);
						return
					}
					
					
					
					
				
					if((!this.ruleForm.xuehao) && `biyesheng` == this.tableName){
						this.$message.error(`学号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.mima) && `biyesheng` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `biyesheng` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					if(`biyesheng` == this.tableName && this.ruleForm.xueshengshouji&&(!this.$validate.isMobile(this.ruleForm.xueshengshouji))){
						this.$message.error(`学生手机应输入手机格式`);
						return
					}
					
					
					
					
					if((!this.ruleForm.yuanxizhanghao) && `biyesheng` == this.tableName){
						this.$message.error(`院系账号不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.yuanxi) && `biyesheng` == this.tableName){
						this.$message.error(`院系不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.banji) && `biyesheng` == this.tableName){
						this.$message.error(`班级不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
					if((!this.ruleForm.jiuyezhuangtai) && `biyesheng` == this.tableName){
						this.$message.error(`就业状态不能为空`);
						return
					}
					
					
					
					
					
					
					
					
					
					
				
			
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
						}
					});
				} else {
					this.$message.error(data.msg);
				}
			});
		}
	}
};
</script>

<style lang="scss" scoped>
	.container {
	  position: relative;
	  background: url(http://codegen.caihongy.cn/20220806/957ba09956674a01965e34ddbeb4e52a.gif);

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px;
						box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3020);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px;
						box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3020);
						outline: none;
						color: #000;
						width: 560px;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px 0 30px;
						box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3020);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 0;
						border-radius: 0;
						padding: 0 10px 0 30px;
						box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3020);
						outline: none;
						color: #000;
						width: 100%;
						font-size: 14px;
						height: 44px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px dashed #666;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #666;
		  		  background: #fff;
		  		  width: 100px;
		  		  font-size: 32px;
		  		  line-height: 100px;
		  		  text-align: center;
		  		  height: 100px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px dashed #666;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #666;
		  		  background: #fff;
		  		  width: 100px;
		  		  font-size: 32px;
		  		  line-height: 100px;
		  		  text-align: center;
		  		  height: 100px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px dashed #666;
		  		  cursor: pointer;
		  		  border-radius: 8px;
		  		  color: #666;
		  		  background: #fff;
		  		  width: 100px;
		  		  font-size: 32px;
		  		  line-height: 100px;
		  		  text-align: center;
		  		  height: 100px;
		  		}
	}
</style>
