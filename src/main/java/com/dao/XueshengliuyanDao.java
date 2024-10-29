package com.dao;

import com.entity.XueshengliuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengliuyanVO;
import com.entity.view.XueshengliuyanView;


/**
 * 学生留言
 * 
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface XueshengliuyanDao extends BaseMapper<XueshengliuyanEntity> {
	
	List<XueshengliuyanVO> selectListVO(@Param("ew") Wrapper<XueshengliuyanEntity> wrapper);
	
	XueshengliuyanVO selectVO(@Param("ew") Wrapper<XueshengliuyanEntity> wrapper);
	
	List<XueshengliuyanView> selectListView(@Param("ew") Wrapper<XueshengliuyanEntity> wrapper);

	List<XueshengliuyanView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengliuyanEntity> wrapper);
	
	XueshengliuyanView selectView(@Param("ew") Wrapper<XueshengliuyanEntity> wrapper);
	
}
