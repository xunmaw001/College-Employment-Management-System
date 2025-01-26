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
 * 实习就业
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
@TableName("shixijiuye")
public class ShixijiuyeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShixijiuyeEntity() {
		
	}
	
	public ShixijiuyeEntity(T t) {
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
	 * 实习合同
	 */
					
	private String shixihetong;
	
	/**
	 * 实习岗位
	 */
					
	private String shixigangwei;
	
	/**
	 * 实习公司
	 */
					
	private String shixigongsi;
	
	/**
	 * 实习薪资
	 */
					
	private Float shixixinzi;
	
	/**
	 * 实习开始
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shixikaishi;
	
	/**
	 * 实习结束
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shixijieshu;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
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
	 * 设置：实习合同
	 */
	public void setShixihetong(String shixihetong) {
		this.shixihetong = shixihetong;
	}
	/**
	 * 获取：实习合同
	 */
	public String getShixihetong() {
		return shixihetong;
	}
	/**
	 * 设置：实习岗位
	 */
	public void setShixigangwei(String shixigangwei) {
		this.shixigangwei = shixigangwei;
	}
	/**
	 * 获取：实习岗位
	 */
	public String getShixigangwei() {
		return shixigangwei;
	}
	/**
	 * 设置：实习公司
	 */
	public void setShixigongsi(String shixigongsi) {
		this.shixigongsi = shixigongsi;
	}
	/**
	 * 获取：实习公司
	 */
	public String getShixigongsi() {
		return shixigongsi;
	}
	/**
	 * 设置：实习薪资
	 */
	public void setShixixinzi(Float shixixinzi) {
		this.shixixinzi = shixixinzi;
	}
	/**
	 * 获取：实习薪资
	 */
	public Float getShixixinzi() {
		return shixixinzi;
	}
	/**
	 * 设置：实习开始
	 */
	public void setShixikaishi(Date shixikaishi) {
		this.shixikaishi = shixikaishi;
	}
	/**
	 * 获取：实习开始
	 */
	public Date getShixikaishi() {
		return shixikaishi;
	}
	/**
	 * 设置：实习结束
	 */
	public void setShixijieshu(Date shixijieshu) {
		this.shixijieshu = shixijieshu;
	}
	/**
	 * 获取：实习结束
	 */
	public Date getShixijieshu() {
		return shixijieshu;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
