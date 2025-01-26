package com.dao;

import com.entity.BiyeshengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiyeshengVO;
import com.entity.view.BiyeshengView;


/**
 * 毕业生
 * 
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface BiyeshengDao extends BaseMapper<BiyeshengEntity> {
	
	List<BiyeshengVO> selectListVO(@Param("ew") Wrapper<BiyeshengEntity> wrapper);
	
	BiyeshengVO selectVO(@Param("ew") Wrapper<BiyeshengEntity> wrapper);
	
	List<BiyeshengView> selectListView(@Param("ew") Wrapper<BiyeshengEntity> wrapper);

	List<BiyeshengView> selectListView(Pagination page,@Param("ew") Wrapper<BiyeshengEntity> wrapper);
	
	BiyeshengView selectView(@Param("ew") Wrapper<BiyeshengEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<BiyeshengEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BiyeshengEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BiyeshengEntity> wrapper);


    List<Map<String, Object>> yuanxijiuyezhuangtaiTypeStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BiyeshengEntity> wrapper);

}
