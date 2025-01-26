package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XinxigenggaishenqingEntity;
import com.entity.view.XinxigenggaishenqingView;

import com.service.XinxigenggaishenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 信息更改申请
 * 后端接口
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
@RestController
@RequestMapping("/xinxigenggaishenqing")
public class XinxigenggaishenqingController {
    @Autowired
    private XinxigenggaishenqingService xinxigenggaishenqingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinxigenggaishenqingEntity xinxigenggaishenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("biyesheng")) {
			xinxigenggaishenqing.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanxijiaoshi")) {
			xinxigenggaishenqing.setYuanxizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XinxigenggaishenqingEntity> ew = new EntityWrapper<XinxigenggaishenqingEntity>();


		PageUtils page = xinxigenggaishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinxigenggaishenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinxigenggaishenqingEntity xinxigenggaishenqing, 
		HttpServletRequest request){
        EntityWrapper<XinxigenggaishenqingEntity> ew = new EntityWrapper<XinxigenggaishenqingEntity>();

		PageUtils page = xinxigenggaishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinxigenggaishenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinxigenggaishenqingEntity xinxigenggaishenqing){
       	EntityWrapper<XinxigenggaishenqingEntity> ew = new EntityWrapper<XinxigenggaishenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinxigenggaishenqing, "xinxigenggaishenqing")); 
        return R.ok().put("data", xinxigenggaishenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinxigenggaishenqingEntity xinxigenggaishenqing){
        EntityWrapper< XinxigenggaishenqingEntity> ew = new EntityWrapper< XinxigenggaishenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinxigenggaishenqing, "xinxigenggaishenqing")); 
		XinxigenggaishenqingView xinxigenggaishenqingView =  xinxigenggaishenqingService.selectView(ew);
		return R.ok("查询信息更改申请成功").put("data", xinxigenggaishenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinxigenggaishenqingEntity xinxigenggaishenqing = xinxigenggaishenqingService.selectById(id);
        return R.ok().put("data", xinxigenggaishenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinxigenggaishenqingEntity xinxigenggaishenqing = xinxigenggaishenqingService.selectById(id);
        return R.ok().put("data", xinxigenggaishenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinxigenggaishenqingEntity xinxigenggaishenqing, HttpServletRequest request){
    	xinxigenggaishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinxigenggaishenqing);

        xinxigenggaishenqingService.insert(xinxigenggaishenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinxigenggaishenqingEntity xinxigenggaishenqing, HttpServletRequest request){
    	xinxigenggaishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinxigenggaishenqing);

        xinxigenggaishenqingService.insert(xinxigenggaishenqing);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XinxigenggaishenqingEntity xinxigenggaishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinxigenggaishenqing);
        xinxigenggaishenqingService.updateById(xinxigenggaishenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinxigenggaishenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XinxigenggaishenqingEntity> wrapper = new EntityWrapper<XinxigenggaishenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("biyesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanxijiaoshi")) {
			wrapper.eq("yuanxizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xinxigenggaishenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
