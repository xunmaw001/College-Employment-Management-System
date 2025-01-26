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


import com.dao.BubanshenqingDao;
import com.entity.BubanshenqingEntity;
import com.service.BubanshenqingService;
import com.entity.vo.BubanshenqingVO;
import com.entity.view.BubanshenqingView;

@Service("bubanshenqingService")
public class BubanshenqingServiceImpl extends ServiceImpl<BubanshenqingDao, BubanshenqingEntity> implements BubanshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BubanshenqingEntity> page = this.selectPage(
                new Query<BubanshenqingEntity>(params).getPage(),
                new EntityWrapper<BubanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BubanshenqingEntity> wrapper) {
		  Page<BubanshenqingView> page =new Query<BubanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BubanshenqingVO> selectListVO(Wrapper<BubanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BubanshenqingVO selectVO(Wrapper<BubanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BubanshenqingView> selectListView(Wrapper<BubanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BubanshenqingView selectView(Wrapper<BubanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
