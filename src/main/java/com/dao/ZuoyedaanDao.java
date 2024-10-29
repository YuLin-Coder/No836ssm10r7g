package com.dao;

import com.entity.ZuoyedaanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyedaanVO;
import com.entity.view.ZuoyedaanView;


/**
 * 作业答案
 * 
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface ZuoyedaanDao extends BaseMapper<ZuoyedaanEntity> {
	
	List<ZuoyedaanVO> selectListVO(@Param("ew") Wrapper<ZuoyedaanEntity> wrapper);
	
	ZuoyedaanVO selectVO(@Param("ew") Wrapper<ZuoyedaanEntity> wrapper);
	
	List<ZuoyedaanView> selectListView(@Param("ew") Wrapper<ZuoyedaanEntity> wrapper);

	List<ZuoyedaanView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyedaanEntity> wrapper);
	
	ZuoyedaanView selectView(@Param("ew") Wrapper<ZuoyedaanEntity> wrapper);
	
}
