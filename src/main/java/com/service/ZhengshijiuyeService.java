package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengshijiuyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhengshijiuyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengshijiuyeView;


/**
 * 正式就业
 *
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
public interface ZhengshijiuyeService extends IService<ZhengshijiuyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhengshijiuyeVO> selectListVO(Wrapper<ZhengshijiuyeEntity> wrapper);
   	
   	ZhengshijiuyeVO selectVO(@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);
   	
   	List<ZhengshijiuyeView> selectListView(Wrapper<ZhengshijiuyeEntity> wrapper);
   	
   	ZhengshijiuyeView selectView(@Param("ew") Wrapper<ZhengshijiuyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhengshijiuyeEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhengshijiuyeEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhengshijiuyeEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhengshijiuyeEntity> wrapper);



}

