package com.dao;

import com.entity.ZuoyetongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyetongjiVO;
import com.entity.view.ZuoyetongjiView;


/**
 * 作业统计
 * 
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public interface ZuoyetongjiDao extends BaseMapper<ZuoyetongjiEntity> {
	
	List<ZuoyetongjiVO> selectListVO(@Param("ew") Wrapper<ZuoyetongjiEntity> wrapper);
	
	ZuoyetongjiVO selectVO(@Param("ew") Wrapper<ZuoyetongjiEntity> wrapper);
	
	List<ZuoyetongjiView> selectListView(@Param("ew") Wrapper<ZuoyetongjiEntity> wrapper);

	List<ZuoyetongjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyetongjiEntity> wrapper);
	
	ZuoyetongjiView selectView(@Param("ew") Wrapper<ZuoyetongjiEntity> wrapper);
	
}
