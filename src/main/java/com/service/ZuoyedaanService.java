package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyedaanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyedaanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyedaanView;


/**
 * 作业答案
 *
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface ZuoyedaanService extends IService<ZuoyedaanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyedaanVO> selectListVO(Wrapper<ZuoyedaanEntity> wrapper);
   	
   	ZuoyedaanVO selectVO(@Param("ew") Wrapper<ZuoyedaanEntity> wrapper);
   	
   	List<ZuoyedaanView> selectListView(Wrapper<ZuoyedaanEntity> wrapper);
   	
   	ZuoyedaanView selectView(@Param("ew") Wrapper<ZuoyedaanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyedaanEntity> wrapper);
   	
}

