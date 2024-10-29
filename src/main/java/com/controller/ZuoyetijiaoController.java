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

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZuoyetijiaoEntity;
import com.entity.view.ZuoyetijiaoView;

import com.service.ZuoyetijiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 作业提交
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
@RestController
@RequestMapping("/zuoyetijiao")
public class ZuoyetijiaoController {
    @Autowired
    private ZuoyetijiaoService zuoyetijiaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuoyetijiaoEntity zuoyetijiao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			zuoyetijiao.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			zuoyetijiao.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuoyetijiaoEntity> ew = new EntityWrapper<ZuoyetijiaoEntity>();
		PageUtils page = zuoyetijiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyetijiao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuoyetijiaoEntity zuoyetijiao, HttpServletRequest request){
        EntityWrapper<ZuoyetijiaoEntity> ew = new EntityWrapper<ZuoyetijiaoEntity>();
		PageUtils page = zuoyetijiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyetijiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuoyetijiaoEntity zuoyetijiao){
       	EntityWrapper<ZuoyetijiaoEntity> ew = new EntityWrapper<ZuoyetijiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuoyetijiao, "zuoyetijiao")); 
        return R.ok().put("data", zuoyetijiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuoyetijiaoEntity zuoyetijiao){
        EntityWrapper< ZuoyetijiaoEntity> ew = new EntityWrapper< ZuoyetijiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuoyetijiao, "zuoyetijiao")); 
		ZuoyetijiaoView zuoyetijiaoView =  zuoyetijiaoService.selectView(ew);
		return R.ok("查询作业提交成功").put("data", zuoyetijiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuoyetijiaoEntity zuoyetijiao = zuoyetijiaoService.selectById(id);
        return R.ok().put("data", zuoyetijiao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuoyetijiaoEntity zuoyetijiao = zuoyetijiaoService.selectById(id);
        return R.ok().put("data", zuoyetijiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuoyetijiaoEntity zuoyetijiao, HttpServletRequest request){
    	zuoyetijiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoyetijiao);

        zuoyetijiaoService.insert(zuoyetijiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuoyetijiaoEntity zuoyetijiao, HttpServletRequest request){
    	zuoyetijiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoyetijiao);

        zuoyetijiaoService.insert(zuoyetijiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZuoyetijiaoEntity zuoyetijiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuoyetijiao);
        zuoyetijiaoService.updateById(zuoyetijiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuoyetijiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZuoyetijiaoEntity> wrapper = new EntityWrapper<ZuoyetijiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zuoyetijiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
