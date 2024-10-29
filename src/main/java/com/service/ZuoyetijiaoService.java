package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyetijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyetijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyetijiaoView;


/**
 * 作业提交
 *
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface ZuoyetijiaoService extends IService<ZuoyetijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyetijiaoVO> selectListVO(Wrapper<ZuoyetijiaoEntity> wrapper);
   	
   	ZuoyetijiaoVO selectVO(@Param("ew") Wrapper<ZuoyetijiaoEntity> wrapper);
   	
   	List<ZuoyetijiaoView> selectListView(Wrapper<ZuoyetijiaoEntity> wrapper);
   	
   	ZuoyetijiaoView selectView(@Param("ew") Wrapper<ZuoyetijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyetijiaoEntity> wrapper);
   	
}

