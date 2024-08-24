package com.cl.dao;

import com.cl.entity.TijiaozuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TijiaozuoyeView;


/**
 * 提交作业
 * 
 * @author 
 * @email 
 * @date 2024-04-07 23:47:46
 */
public interface TijiaozuoyeDao extends BaseMapper<TijiaozuoyeEntity> {
	
	List<TijiaozuoyeView> selectListView(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);

	List<TijiaozuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);
	
	TijiaozuoyeView selectView(@Param("ew") Wrapper<TijiaozuoyeEntity> wrapper);
	

}
