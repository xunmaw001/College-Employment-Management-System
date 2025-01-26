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


import com.dao.ZhengshijiuyeDao;
import com.entity.ZhengshijiuyeEntity;
import com.service.ZhengshijiuyeService;
import com.entity.vo.ZhengshijiuyeVO;
import com.entity.view.ZhengshijiuyeView;

@Service("zhengshijiuyeService")
public class ZhengshijiuyeServiceImpl extends ServiceImpl<ZhengshijiuyeDao, ZhengshijiuyeEntity> implements ZhengshijiuyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhengshijiuyeEntity> page = this.selectPage(
                new Query<ZhengshijiuyeEntity>(params).getPage(),
                new EntityWrapper<ZhengshijiuyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhengshijiuyeEntity> wrapper) {
		  Page<ZhengshijiuyeView> page =new Query<ZhengshijiuyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhengshijiuyeVO> selectListVO(Wrapper<ZhengshijiuyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhengshijiuyeVO selectVO(Wrapper<ZhengshijiuyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhengshijiuyeView> selectListView(Wrapper<ZhengshijiuyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhengshijiuyeView selectView(Wrapper<ZhengshijiuyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhengshijiuyeEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhengshijiuyeEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhengshijiuyeEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
