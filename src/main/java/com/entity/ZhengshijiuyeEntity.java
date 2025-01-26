package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 正式就业
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
@TableName("zhengshijiuye")
public class ZhengshijiuyeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhengshijiuyeEntity() {
		
	}
	
	public ZhengshijiuyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 院系账号
	 */
					
	private String yuanxizhanghao;
	
	/**
	 * 院系
	 */
					
	private String yuanxi;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 签约类型
	 */
					
	private String qianyueleixing;
	
	/**
	 * 签约公司
	 */
					
	private String qianyuegongsi;
	
	/**
	 * 签约岗位
	 */
					
	private String qianyuegangwei;
	
	/**
	 * 签约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date qianyueshijian;
	
	/**
	 * 签约合同
	 */
					
	private String qianyuehetong;
	
	/**
	 * 正式薪资
	 */
					
	private Float zhengshixinzi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：院系账号
	 */
	public void setYuanxizhanghao(String yuanxizhanghao) {
		this.yuanxizhanghao = yuanxizhanghao;
	}
	/**
	 * 获取：院系账号
	 */
	public String getYuanxizhanghao() {
		return yuanxizhanghao;
	}
	/**
	 * 设置：院系
	 */
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：签约类型
	 */
	public void setQianyueleixing(String qianyueleixing) {
		this.qianyueleixing = qianyueleixing;
	}
	/**
	 * 获取：签约类型
	 */
	public String getQianyueleixing() {
		return qianyueleixing;
	}
	/**
	 * 设置：签约公司
	 */
	public void setQianyuegongsi(String qianyuegongsi) {
		this.qianyuegongsi = qianyuegongsi;
	}
	/**
	 * 获取：签约公司
	 */
	public String getQianyuegongsi() {
		return qianyuegongsi;
	}
	/**
	 * 设置：签约岗位
	 */
	public void setQianyuegangwei(String qianyuegangwei) {
		this.qianyuegangwei = qianyuegangwei;
	}
	/**
	 * 获取：签约岗位
	 */
	public String getQianyuegangwei() {
		return qianyuegangwei;
	}
	/**
	 * 设置：签约时间
	 */
	public void setQianyueshijian(Date qianyueshijian) {
		this.qianyueshijian = qianyueshijian;
	}
	/**
	 * 获取：签约时间
	 */
	public Date getQianyueshijian() {
		return qianyueshijian;
	}
	/**
	 * 设置：签约合同
	 */
	public void setQianyuehetong(String qianyuehetong) {
		this.qianyuehetong = qianyuehetong;
	}
	/**
	 * 获取：签约合同
	 */
	public String getQianyuehetong() {
		return qianyuehetong;
	}
	/**
	 * 设置：正式薪资
	 */
	public void setZhengshixinzi(Float zhengshixinzi) {
		this.zhengshixinzi = zhengshixinzi;
	}
	/**
	 * 获取：正式薪资
	 */
	public Float getZhengshixinzi() {
		return zhengshixinzi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
