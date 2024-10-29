package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyepiyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyepiyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyepiyueView;


/**
 * 作业批阅
 *
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface ZuoyepiyueService extends IService<ZuoyepiyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyepiyueVO> selectListVO(Wrapper<ZuoyepiyueEntity> wrapper);
   	
   	ZuoyepiyueVO selectVO(@Param("ew") Wrapper<ZuoyepiyueEntity> wrapper);
   	
   	List<ZuoyepiyueView> selectListView(Wrapper<ZuoyepiyueEntity> wrapper);
   	
   	ZuoyepiyueView selectView(@Param("ew") Wrapper<ZuoyepiyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyepiyueEntity> wrapper);
   	
}

