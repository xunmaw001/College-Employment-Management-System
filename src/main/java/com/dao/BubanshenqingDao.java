package com.dao;

import com.entity.BubanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BubanshenqingVO;
import com.entity.view.BubanshenqingView;


/**
 * 补办申请
 * 
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface BubanshenqingDao extends BaseMapper<BubanshenqingEntity> {
	
	List<BubanshenqingVO> selectListVO(@Param("ew") Wrapper<BubanshenqingEntity> wrapper);
	
	BubanshenqingVO selectVO(@Param("ew") Wrapper<BubanshenqingEntity> wrapper);
	
	List<BubanshenqingView> selectListView(@Param("ew") Wrapper<BubanshenqingEntity> wrapper);

	List<BubanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<BubanshenqingEntity> wrapper);
	
	BubanshenqingView selectView(@Param("ew") Wrapper<BubanshenqingEntity> wrapper);
	

}
