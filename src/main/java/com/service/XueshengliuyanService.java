package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengliuyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengliuyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengliuyanView;


/**
 * 学生留言
 *
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface XueshengliuyanService extends IService<XueshengliuyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengliuyanVO> selectListVO(Wrapper<XueshengliuyanEntity> wrapper);
   	
   	XueshengliuyanVO selectVO(@Param("ew") Wrapper<XueshengliuyanEntity> wrapper);
   	
   	List<XueshengliuyanView> selectListView(Wrapper<XueshengliuyanEntity> wrapper);
   	
   	XueshengliuyanView selectView(@Param("ew") Wrapper<XueshengliuyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengliuyanEntity> wrapper);
   	
}

