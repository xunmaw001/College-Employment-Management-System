package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BubanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BubanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BubanshenqingView;


/**
 * 补办申请
 *
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface BubanshenqingService extends IService<BubanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BubanshenqingVO> selectListVO(Wrapper<BubanshenqingEntity> wrapper);
   	
   	BubanshenqingVO selectVO(@Param("ew") Wrapper<BubanshenqingEntity> wrapper);
   	
   	List<BubanshenqingView> selectListView(Wrapper<BubanshenqingEntity> wrapper);
   	
   	BubanshenqingView selectView(@Param("ew") Wrapper<BubanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BubanshenqingEntity> wrapper);
   	

}

