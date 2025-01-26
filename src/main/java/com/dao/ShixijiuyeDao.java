package com.dao;

import com.entity.ShixijiuyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixijiuyeVO;
import com.entity.view.ShixijiuyeView;


/**
 * 实习就业
 * 
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface ShixijiuyeDao extends BaseMapper<ShixijiuyeEntity> {
	
	List<ShixijiuyeVO> selectListVO(@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);
	
	ShixijiuyeVO selectVO(@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);
	
	List<ShixijiuyeView> selectListView(@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);

	List<ShixijiuyeView> selectListView(Pagination page,@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);
	
	ShixijiuyeView selectView(@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);



}
