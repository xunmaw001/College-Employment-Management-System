package com.entity.view;

import com.entity.YuanxijiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院系教师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
@TableName("yuanxijiaoshi")
public class YuanxijiaoshiView  extends YuanxijiaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxijiaoshiView(){
	}
 
 	public YuanxijiaoshiView(YuanxijiaoshiEntity yuanxijiaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxijiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
