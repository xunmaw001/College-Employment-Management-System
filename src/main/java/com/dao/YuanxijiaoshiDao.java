package com.dao;

import com.entity.YuanxijiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxijiaoshiVO;
import com.entity.view.YuanxijiaoshiView;


/**
 * 院系教师
 * 
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface YuanxijiaoshiDao extends BaseMapper<YuanxijiaoshiEntity> {
	
	List<YuanxijiaoshiVO> selectListVO(@Param("ew") Wrapper<YuanxijiaoshiEntity> wrapper);
	
	YuanxijiaoshiVO selectVO(@Param("ew") Wrapper<YuanxijiaoshiEntity> wrapper);
	
	List<YuanxijiaoshiView> selectListView(@Param("ew") Wrapper<YuanxijiaoshiEntity> wrapper);

	List<YuanxijiaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxijiaoshiEntity> wrapper);
	
	YuanxijiaoshiView selectView(@Param("ew") Wrapper<YuanxijiaoshiEntity> wrapper);
	

}
