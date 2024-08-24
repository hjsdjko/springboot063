package com.cl.dao;

import com.cl.entity.ZuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZuoyeView;


/**
 * 作业
 * 
 * @author 
 * @email 
 * @date 2024-04-07 23:47:46
 */
public interface ZuoyeDao extends BaseMapper<ZuoyeEntity> {
	
	List<ZuoyeView> selectListView(@Param("ew") Wrapper<ZuoyeEntity> wrapper);

	List<ZuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyeEntity> wrapper);
	
	ZuoyeView selectView(@Param("ew") Wrapper<ZuoyeEntity> wrapper);
	

}
