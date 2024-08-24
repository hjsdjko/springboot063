package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZuoyeEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZuoyeView;


/**
 * 作业
 *
 * @author 
 * @email 
 * @date 2024-04-07 23:47:46
 */
public interface ZuoyeService extends IService<ZuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyeView> selectListView(Wrapper<ZuoyeEntity> wrapper);
   	
   	ZuoyeView selectView(@Param("ew") Wrapper<ZuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyeEntity> wrapper);
   	

}

