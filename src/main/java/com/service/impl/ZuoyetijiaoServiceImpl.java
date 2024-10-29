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


import com.dao.ZuoyetijiaoDao;
import com.entity.ZuoyetijiaoEntity;
import com.service.ZuoyetijiaoService;
import com.entity.vo.ZuoyetijiaoVO;
import com.entity.view.ZuoyetijiaoView;

@Service("zuoyetijiaoService")
public class ZuoyetijiaoServiceImpl extends ServiceImpl<ZuoyetijiaoDao, ZuoyetijiaoEntity> implements ZuoyetijiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyetijiaoEntity> page = this.selectPage(
                new Query<ZuoyetijiaoEntity>(params).getPage(),
                new EntityWrapper<ZuoyetijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyetijiaoEntity> wrapper) {
		  Page<ZuoyetijiaoView> page =new Query<ZuoyetijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoyetijiaoVO> selectListVO(Wrapper<ZuoyetijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyetijiaoVO selectVO(Wrapper<ZuoyetijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyetijiaoView> selectListView(Wrapper<ZuoyetijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyetijiaoView selectView(Wrapper<ZuoyetijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
