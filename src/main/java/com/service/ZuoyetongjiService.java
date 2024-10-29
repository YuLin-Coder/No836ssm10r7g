package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyetongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyetongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyetongjiView;


/**
 * 作业统计
 *
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface ZuoyetongjiService extends IService<ZuoyetongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyetongjiVO> selectListVO(Wrapper<ZuoyetongjiEntity> wrapper);
   	
   	ZuoyetongjiVO selectVO(@Param("ew") Wrapper<ZuoyetongjiEntity> wrapper);
   	
   	List<ZuoyetongjiView> selectListView(Wrapper<ZuoyetongjiEntity> wrapper);
   	
   	ZuoyetongjiView selectView(@Param("ew") Wrapper<ZuoyetongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyetongjiEntity> wrapper);
   	
}

