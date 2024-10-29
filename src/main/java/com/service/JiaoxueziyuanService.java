package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxueziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxueziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxueziyuanView;


/**
 * 教学资源
 *
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface JiaoxueziyuanService extends IService<JiaoxueziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxueziyuanVO> selectListVO(Wrapper<JiaoxueziyuanEntity> wrapper);
   	
   	JiaoxueziyuanVO selectVO(@Param("ew") Wrapper<JiaoxueziyuanEntity> wrapper);
   	
   	List<JiaoxueziyuanView> selectListView(Wrapper<JiaoxueziyuanEntity> wrapper);
   	
   	JiaoxueziyuanView selectView(@Param("ew") Wrapper<JiaoxueziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxueziyuanEntity> wrapper);
   	
}

