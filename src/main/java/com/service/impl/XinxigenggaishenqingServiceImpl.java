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


import com.dao.XinxigenggaishenqingDao;
import com.entity.XinxigenggaishenqingEntity;
import com.service.XinxigenggaishenqingService;
import com.entity.vo.XinxigenggaishenqingVO;
import com.entity.view.XinxigenggaishenqingView;

@Service("xinxigenggaishenqingService")
public class XinxigenggaishenqingServiceImpl extends ServiceImpl<XinxigenggaishenqingDao, XinxigenggaishenqingEntity> implements XinxigenggaishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinxigenggaishenqingEntity> page = this.selectPage(
                new Query<XinxigenggaishenqingEntity>(params).getPage(),
                new EntityWrapper<XinxigenggaishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinxigenggaishenqingEntity> wrapper) {
		  Page<XinxigenggaishenqingView> page =new Query<XinxigenggaishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinxigenggaishenqingVO> selectListVO(Wrapper<XinxigenggaishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinxigenggaishenqingVO selectVO(Wrapper<XinxigenggaishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinxigenggaishenqingView> selectListView(Wrapper<XinxigenggaishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinxigenggaishenqingView selectView(Wrapper<XinxigenggaishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
