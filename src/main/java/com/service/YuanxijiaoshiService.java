package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxijiaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxijiaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxijiaoshiView;


/**
 * 院系教师
 *
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface YuanxijiaoshiService extends IService<YuanxijiaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxijiaoshiVO> selectListVO(Wrapper<YuanxijiaoshiEntity> wrapper);
   	
   	YuanxijiaoshiVO selectVO(@Param("ew") Wrapper<YuanxijiaoshiEntity> wrapper);
   	
   	List<YuanxijiaoshiView> selectListView(Wrapper<YuanxijiaoshiEntity> wrapper);
   	
   	YuanxijiaoshiView selectView(@Param("ew") Wrapper<YuanxijiaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxijiaoshiEntity> wrapper);
   	

}

