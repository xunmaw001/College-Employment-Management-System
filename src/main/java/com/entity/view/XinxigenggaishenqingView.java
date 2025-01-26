package com.entity.view;

import com.entity.XinxigenggaishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 信息更改申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
@TableName("xinxigenggaishenqing")
public class XinxigenggaishenqingView  extends XinxigenggaishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinxigenggaishenqingView(){
	}
 
 	public XinxigenggaishenqingView(XinxigenggaishenqingEntity xinxigenggaishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, xinxigenggaishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
