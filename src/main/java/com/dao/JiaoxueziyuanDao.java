package com.dao;

import com.entity.JiaoxueziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxueziyuanVO;
import com.entity.view.JiaoxueziyuanView;


/**
 * 教学资源
 * 
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface JiaoxueziyuanDao extends BaseMapper<JiaoxueziyuanEntity> {
	
	List<JiaoxueziyuanVO> selectListVO(@Param("ew") Wrapper<JiaoxueziyuanEntity> wrapper);
	
	JiaoxueziyuanVO selectVO(@Param("ew") Wrapper<JiaoxueziyuanEntity> wrapper);
	
	List<JiaoxueziyuanView> selectListView(@Param("ew") Wrapper<JiaoxueziyuanEntity> wrapper);

	List<JiaoxueziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxueziyuanEntity> wrapper);
	
	JiaoxueziyuanView selectView(@Param("ew") Wrapper<JiaoxueziyuanEntity> wrapper);
	
}
