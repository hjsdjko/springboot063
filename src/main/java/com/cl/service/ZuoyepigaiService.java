package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZuoyepigaiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZuoyepigaiView;


/**
 * 作业批改
 *
 * @author 
 * @email 
 * @date 2024-04-07 23:47:46
 */
public interface ZuoyepigaiService extends IService<ZuoyepigaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyepigaiView> selectListView(Wrapper<ZuoyepigaiEntity> wrapper);
   	
   	ZuoyepigaiView selectView(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyepigaiEntity> wrapper);
   	

}

