package com.dao;

import com.entity.ZhengshijiuyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhengshijiuyeVO;
import com.entity.view.ZhengshijiuyeView;


/**
 * 正式就业
 * 
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface ZhengshijiuyeDao extends BaseMapper<ZhengshijiuyeEntity> {
	
	List<ZhengshijiuyeVO> selectListVO(@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);
	
	ZhengshijiuyeVO selectVO(@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);
	
	List<ZhengshijiuyeView> selectListView(@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);

	List<ZhengshijiuyeView> selectListView(Pagination page,@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);
	
	ZhengshijiuyeView selectView(@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);



}
