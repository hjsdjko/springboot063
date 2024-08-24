package com.cl.dao;

import com.cl.entity.ZuoyepigaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZuoyepigaiView;


/**
 * 作业批改
 * 
 * @author 
 * @email 
 * @date 2024-04-07 23:47:46
 */
public interface ZuoyepigaiDao extends BaseMapper<ZuoyepigaiEntity> {
	
	List<ZuoyepigaiView> selectListView(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);

	List<ZuoyepigaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
	
	ZuoyepigaiView selectView(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
	

}
