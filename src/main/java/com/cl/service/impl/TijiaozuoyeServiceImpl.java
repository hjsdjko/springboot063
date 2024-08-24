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


import com.cl.dao.TijiaozuoyeDao;
import com.cl.entity.TijiaozuoyeEntity;
import com.cl.service.TijiaozuoyeService;
import com.cl.entity.view.TijiaozuoyeView;

@Service("tijiaozuoyeService")
public class TijiaozuoyeServiceImpl extends ServiceImpl<TijiaozuoyeDao, TijiaozuoyeEntity> implements TijiaozuoyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijiaozuoyeEntity> page = this.selectPage(
                new Query<TijiaozuoyeEntity>(params).getPage(),
                new EntityWrapper<TijiaozuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijiaozuoyeEntity> wrapper) {
		  Page<TijiaozuoyeView> page =new Query<TijiaozuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TijiaozuoyeView> selectListView(Wrapper<TijiaozuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijiaozuoyeView selectView(Wrapper<TijiaozuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
