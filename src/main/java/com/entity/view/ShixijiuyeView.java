package com.entity.view;

import com.entity.ShixijiuyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习就业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
@TableName("shixijiuye")
public class ShixijiuyeView  extends ShixijiuyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixijiuyeView(){
	}
 
 	public ShixijiuyeView(ShixijiuyeEntity shixijiuyeEntity){
 	try {
			BeanUtils.copyProperties(this, shixijiuyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
