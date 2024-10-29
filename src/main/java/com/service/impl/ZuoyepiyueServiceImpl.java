package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuoyepiyueDao;
import com.entity.ZuoyepiyueEntity;
import com.service.ZuoyepiyueService;
import com.entity.vo.ZuoyepiyueVO;
import com.entity.view.ZuoyepiyueView;

@Service("zuoyepiyueService")
public class ZuoyepiyueServiceImpl extends ServiceImpl<ZuoyepiyueDao, ZuoyepiyueEntity> implements ZuoyepiyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyepiyueEntity> page = this.selectPage(
                new Query<ZuoyepiyueEntity>(params).getPage(),
                new EntityWrapper<ZuoyepiyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyepiyueEntity> wrapper) {
		  Page<ZuoyepiyueView> page =new Query<ZuoyepiyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyepiyueVO> selectListVO(Wrapper<ZuoyepiyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyepiyueVO selectVO(Wrapper<ZuoyepiyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyepiyueView> selectListView(Wrapper<ZuoyepiyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyepiyueView selectView(Wrapper<ZuoyepiyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
