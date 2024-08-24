package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
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
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ZuoyeEntity;
import com.cl.entity.view.ZuoyeView;

import com.cl.service.ZuoyeService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 作业
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-07 23:47:46
 */
@RestController
@RequestMapping("/zuoye")
public class ZuoyeController {
    @Autowired
    private ZuoyeService zuoyeService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuoyeEntity zuoye,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			zuoye.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuoyeEntity> ew = new EntityWrapper<ZuoyeEntity>();

		PageUtils page = zuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoye), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuoyeEntity zuoye, 
		HttpServletRequest request){
        EntityWrapper<ZuoyeEntity> ew = new EntityWrapper<ZuoyeEntity>();

		PageUtils page = zuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoye), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuoyeEntity zuoye){
       	EntityWrapper<ZuoyeEntity> ew = new EntityWrapper<ZuoyeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuoye, "zuoye")); 
        return R.ok().put("data", zuoyeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuoyeEntity zuoye){
        EntityWrapper< ZuoyeEntity> ew = new EntityWrapper< ZuoyeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuoye, "zuoye")); 
		ZuoyeView zuoyeView =  zuoyeService.selectView(ew);
		return R.ok("查询作业成功").put("data", zuoyeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuoyeEntity zuoye = zuoyeService.selectById(id);
		zuoye = zuoyeService.selectView(new EntityWrapper<ZuoyeEntity>().eq("id", id));
        return R.ok().put("data", zuoye);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuoyeEntity zuoye = zuoyeService.selectById(id);
		zuoye = zuoyeService.selectView(new EntityWrapper<ZuoyeEntity>().eq("id", id));
        return R.ok().put("data", zuoye);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuoyeEntity zuoye, HttpServletRequest request){
    	zuoye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoye);
        zuoyeService.insert(zuoye);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuoyeEntity zuoye, HttpServletRequest request){
    	zuoye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoye);
        zuoyeService.insert(zuoye);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZuoyeEntity zuoye, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuoye);
        zuoyeService.updateById(zuoye);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuoyeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
