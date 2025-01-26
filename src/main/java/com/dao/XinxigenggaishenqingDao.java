package com.dao;

import com.entity.XinxigenggaishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinxigenggaishenqingVO;
import com.entity.view.XinxigenggaishenqingView;


/**
 * 信息更改申请
 * 
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface XinxigenggaishenqingDao extends BaseMapper<XinxigenggaishenqingEntity> {
	
	List<XinxigenggaishenqingVO> selectListVO(@Param("ew") Wrapper<XinxigenggaishenqingEntity> wrapper);
	
	XinxigenggaishenqingVO selectVO(@Param("ew") Wrapper<XinxigenggaishenqingEntity> wrapper);
	
	List<XinxigenggaishenqingView> selectListView(@Param("ew") Wrapper<XinxigenggaishenqingEntity> wrapper);

	List<XinxigenggaishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<XinxigenggaishenqingEntity> wrapper);
	
	XinxigenggaishenqingView selectView(@Param("ew") Wrapper<XinxigenggaishenqingEntity> wrapper);
	

}
