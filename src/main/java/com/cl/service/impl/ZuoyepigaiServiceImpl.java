package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ZuoyepigaiDao;
import com.cl.entity.ZuoyepigaiEntity;
import com.cl.service.ZuoyepigaiService;
import com.cl.entity.view.ZuoyepigaiView;

@Service("zuoyepigaiService")
public class ZuoyepigaiServiceImpl extends ServiceImpl<ZuoyepigaiDao, ZuoyepigaiEntity> implements ZuoyepigaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyepigaiEntity> page = this.selectPage(
                new Query<ZuoyepigaiEntity>(params).getPage(),
                new EntityWrapper<ZuoyepigaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyepigaiEntity> wrapper) {
		  Page<ZuoyepigaiView> page =new Query<ZuoyepigaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZuoyepigaiView> selectListView(Wrapper<ZuoyepigaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyepigaiView selectView(Wrapper<ZuoyepigaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
