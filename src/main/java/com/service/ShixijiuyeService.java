package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixijiuyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixijiuyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixijiuyeView;


/**
 * 实习就业
 *
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface ShixijiuyeService extends IService<ShixijiuyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixijiuyeVO> selectListVO(Wrapper<ShixijiuyeEntity> wrapper);
   	
   	ShixijiuyeVO selectVO(@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);
   	
   	List<ShixijiuyeView> selectListView(Wrapper<ShixijiuyeEntity> wrapper);
   	
   	ShixijiuyeView selectView(@Param("ew") Wrapper<ShixijiuyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixijiuyeEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShixijiuyeEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShixijiuyeEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShixijiuyeEntity> wrapper);



}

