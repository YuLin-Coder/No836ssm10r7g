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


import com.dao.XueshengliuyanDao;
import com.entity.XueshengliuyanEntity;
import com.service.XueshengliuyanService;
import com.entity.vo.XueshengliuyanVO;
import com.entity.view.XueshengliuyanView;

@Service("xueshengliuyanService")
public class XueshengliuyanServiceImpl extends ServiceImpl<XueshengliuyanDao, XueshengliuyanEntity> implements XueshengliuyanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengliuyanEntity> page = this.selectPage(
                new Query<XueshengliuyanEntity>(params).getPage(),
                new EntityWrapper<XueshengliuyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengliuyanEntity> wrapper) {
		  Page<XueshengliuyanView> page =new Query<XueshengliuyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengliuyanVO> selectListVO(Wrapper<XueshengliuyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengliuyanVO selectVO(Wrapper<XueshengliuyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengliuyanView> selectListView(Wrapper<XueshengliuyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengliuyanView selectView(Wrapper<XueshengliuyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
