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


import com.dao.ZuoyetongjiDao;
import com.entity.ZuoyetongjiEntity;
import com.service.ZuoyetongjiService;
import com.entity.vo.ZuoyetongjiVO;
import com.entity.view.ZuoyetongjiView;

@Service("zuoyetongjiService")
public class ZuoyetongjiServiceImpl extends ServiceImpl<ZuoyetongjiDao, ZuoyetongjiEntity> implements ZuoyetongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyetongjiEntity> page = this.selectPage(
                new Query<ZuoyetongjiEntity>(params).getPage(),
                new EntityWrapper<ZuoyetongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyetongjiEntity> wrapper) {
		  Page<ZuoyetongjiView> page =new Query<ZuoyetongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyetongjiVO> selectListVO(Wrapper<ZuoyetongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyetongjiVO selectVO(Wrapper<ZuoyetongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyetongjiView> selectListView(Wrapper<ZuoyetongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyetongjiView selectView(Wrapper<ZuoyetongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
