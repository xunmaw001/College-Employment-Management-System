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

import com.entity.BiyeshengEntity;
import com.entity.view.BiyeshengView;

import com.service.BiyeshengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 毕业生
 * 后端接口
 * @author 
 * @email 
 * @date 2022-11-07 11:44:31
 */
@RestController
@RequestMapping("/biyesheng")
public class BiyeshengController {
    @Autowired
    private BiyeshengService biyeshengService;



    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		BiyeshengEntity u = biyeshengService.selectOne(new EntityWrapper<BiyeshengEntity>().eq("xuehao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(u.getId(), username,"biyesheng",  "毕业生" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody BiyeshengEntity biyesheng){
    	//ValidatorUtils.validateEntity(biyesheng);
    	BiyeshengEntity u = biyeshengService.selectOne(new EntityWrapper<BiyeshengEntity>().eq("xuehao", biyesheng.getXuehao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		biyesheng.setId(uId);
        biyeshengService.insert(biyesheng);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        BiyeshengEntity u = biyeshengService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	BiyeshengEntity u = biyeshengService.selectOne(new EntityWrapper<BiyeshengEntity>().eq("xuehao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
    	u.setMima("123456");
        biyeshengService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BiyeshengEntity biyesheng, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuanxijiaoshi")) {
			biyesheng.setYuanxizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BiyeshengEntity> ew = new EntityWrapper<BiyeshengEntity>();


		PageUtils page = biyeshengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biyesheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BiyeshengEntity biyesheng, 
		HttpServletRequest request){
        EntityWrapper<BiyeshengEntity> ew = new EntityWrapper<BiyeshengEntity>();

		PageUtils page = biyeshengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biyesheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BiyeshengEntity biyesheng){
       	EntityWrapper<BiyeshengEntity> ew = new EntityWrapper<BiyeshengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( biyesheng, "biyesheng")); 
        return R.ok().put("data", biyeshengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BiyeshengEntity biyesheng){
        EntityWrapper< BiyeshengEntity> ew = new EntityWrapper< BiyeshengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( biyesheng, "biyesheng")); 
		BiyeshengView biyeshengView =  biyeshengService.selectView(ew);
		return R.ok("查询毕业生成功").put("data", biyeshengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BiyeshengEntity biyesheng = biyeshengService.selectById(id);
        return R.ok().put("data", biyesheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BiyeshengEntity biyesheng = biyeshengService.selectById(id);
        return R.ok().put("data", biyesheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BiyeshengEntity biyesheng, HttpServletRequest request){
    	biyesheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(biyesheng);
    	BiyeshengEntity u = biyeshengService.selectOne(new EntityWrapper<BiyeshengEntity>().eq("xuehao", biyesheng.getXuehao()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		biyesheng.setId(new Date().getTime());
        biyeshengService.insert(biyesheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BiyeshengEntity biyesheng, HttpServletRequest request){
    	biyesheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(biyesheng);
    	BiyeshengEntity u = biyeshengService.selectOne(new EntityWrapper<BiyeshengEntity>().eq("xuehao", biyesheng.getXuehao()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		biyesheng.setId(new Date().getTime());
        biyeshengService.insert(biyesheng);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BiyeshengEntity biyesheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(biyesheng);
        biyeshengService.updateById(biyesheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        biyeshengService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BiyeshengEntity> wrapper = new EntityWrapper<BiyeshengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuanxijiaoshi")) {
			wrapper.eq("yuanxizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = biyeshengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<BiyeshengEntity> ew = new EntityWrapper<BiyeshengEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuanxijiaoshi")) {
            ew.eq("yuanxizhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = biyeshengService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<BiyeshengEntity> ew = new EntityWrapper<BiyeshengEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuanxijiaoshi")) {
            ew.eq("yuanxizhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = biyeshengService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<BiyeshengEntity> ew = new EntityWrapper<BiyeshengEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuanxijiaoshi")) {
            ew.eq("yuanxizhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = biyeshengService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }


    /**
     * 分组统计
     */
    @RequestMapping("/typeStat/jiuyezhuangtai/yuanxi")
	@IgnoreAuth
    public R yuanxijiuyezhuangtaiTypeStat(HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        EntityWrapper<BiyeshengEntity> ew = new EntityWrapper<BiyeshengEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuanxijiaoshi")) {
            ew.eq("yuanxizhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = biyeshengService.yuanxijiuyezhuangtaiTypeStat(params, ew);
        return R.ok().put("data", result);
    }


    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,BiyeshengEntity biyesheng, HttpServletRequest request){
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("yuanxijiaoshi")) {
            biyesheng.setYuanxizhanghao((String)request.getSession().getAttribute("username"));
        }
        EntityWrapper<BiyeshengEntity> ew = new EntityWrapper<BiyeshengEntity>();
        int count = biyeshengService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biyesheng), params), params));
        return R.ok().put("data", count);
    }
}
