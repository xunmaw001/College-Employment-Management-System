package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShixijiuyeDao;
import com.entity.ShixijiuyeEntity;
import com.service.ShixijiuyeService;
import com.entity.vo.ShixijiuyeVO;
import com.entity.view.ShixijiuyeView;

@Service("shixijiuyeService")
public class ShixijiuyeServiceImpl extends ServiceImpl<ShixijiuyeDao, ShixijiuyeEntity> implements ShixijiuyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixijiuyeEntity> page = this.selectPage(
                new Query<ShixijiuyeEntity>(params).getPage(),
                new EntityWrapper<ShixijiuyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixijiuyeEntity> wrapper) {
		  Page<ShixijiuyeView> page =new Query<ShixijiuyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixijiuyeVO> selectListVO(Wrapper<ShixijiuyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixijiuyeVO selectVO(Wrapper<ShixijiuyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixijiuyeView> selectListView(Wrapper<ShixijiuyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixijiuyeView selectView(Wrapper<ShixijiuyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShixijiuyeEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShixijiuyeEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShixijiuyeEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
