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


import com.dao.ZuoyedaanDao;
import com.entity.ZuoyedaanEntity;
import com.service.ZuoyedaanService;
import com.entity.vo.ZuoyedaanVO;
import com.entity.view.ZuoyedaanView;

@Service("zuoyedaanService")
public class ZuoyedaanServiceImpl extends ServiceImpl<ZuoyedaanDao, ZuoyedaanEntity> implements ZuoyedaanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyedaanEntity> page = this.selectPage(
                new Query<ZuoyedaanEntity>(params).getPage(),
                new EntityWrapper<ZuoyedaanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyedaanEntity> wrapper) {
		  Page<ZuoyedaanView> page =new Query<ZuoyedaanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyedaanVO> selectListVO(Wrapper<ZuoyedaanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyedaanVO selectVO(Wrapper<ZuoyedaanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyedaanView> selectListView(Wrapper<ZuoyedaanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyedaanView selectView(Wrapper<ZuoyedaanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
