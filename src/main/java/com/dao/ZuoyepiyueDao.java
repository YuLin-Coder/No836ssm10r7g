package com.dao;

import com.entity.ZuoyepiyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyepiyueVO;
import com.entity.view.ZuoyepiyueView;


/**
 * 作业批阅
 * 
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface ZuoyepiyueDao extends BaseMapper<ZuoyepiyueEntity> {
	
	List<ZuoyepiyueVO> selectListVO(@Param("ew") Wrapper<ZuoyepiyueEntity> wrapper);
	
	ZuoyepiyueVO selectVO(@Param("ew") Wrapper<ZuoyepiyueEntity> wrapper);
	
	List<ZuoyepiyueView> selectListView(@Param("ew") Wrapper<ZuoyepiyueEntity> wrapper);

	List<ZuoyepiyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyepiyueEntity> wrapper);
	
	ZuoyepiyueView selectView(@Param("ew") Wrapper<ZuoyepiyueEntity> wrapper);
	
}
