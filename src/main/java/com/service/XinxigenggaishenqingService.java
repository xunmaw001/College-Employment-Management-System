package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinxigenggaishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinxigenggaishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinxigenggaishenqingView;


/**
 * 信息更改申请
 *
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface XinxigenggaishenqingService extends IService<XinxigenggaishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinxigenggaishenqingVO> selectListVO(Wrapper<XinxigenggaishenqingEntity> wrapper);
   	
   	XinxigenggaishenqingVO selectVO(@Param("ew") Wrapper<XinxigenggaishenqingEntity> wrapper);
   	
   	List<XinxigenggaishenqingView> selectListView(Wrapper<XinxigenggaishenqingEntity> wrapper);
   	
   	XinxigenggaishenqingView selectView(@Param("ew") Wrapper<XinxigenggaishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinxigenggaishenqingEntity> wrapper);
   	

}

