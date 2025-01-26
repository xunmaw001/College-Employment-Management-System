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


import com.dao.YuanxijiaoshiDao;
import com.entity.YuanxijiaoshiEntity;
import com.service.YuanxijiaoshiService;
import com.entity.vo.YuanxijiaoshiVO;
import com.entity.view.YuanxijiaoshiView;

@Service("yuanxijiaoshiService")
public class YuanxijiaoshiServiceImpl extends ServiceImpl<YuanxijiaoshiDao, YuanxijiaoshiEntity> implements YuanxijiaoshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxijiaoshiEntity> page = this.selectPage(
                new Query<YuanxijiaoshiEntity>(params).getPage(),
                new EntityWrapper<YuanxijiaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxijiaoshiEntity> wrapper) {
		  Page<YuanxijiaoshiView> page =new Query<YuanxijiaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxijiaoshiVO> selectListVO(Wrapper<YuanxijiaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxijiaoshiVO selectVO(Wrapper<YuanxijiaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxijiaoshiView> selectListView(Wrapper<YuanxijiaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxijiaoshiView selectView(Wrapper<YuanxijiaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
