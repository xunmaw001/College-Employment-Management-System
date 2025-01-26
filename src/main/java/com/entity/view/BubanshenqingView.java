package com.entity.view;

import com.entity.BubanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 补办申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
@TableName("bubanshenqing")
public class BubanshenqingView  extends BubanshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BubanshenqingView(){
	}
 
 	public BubanshenqingView(BubanshenqingEntity bubanshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, bubanshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
