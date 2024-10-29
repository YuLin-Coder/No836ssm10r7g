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


import com.dao.JiaoxueziyuanDao;
import com.entity.JiaoxueziyuanEntity;
import com.service.JiaoxueziyuanService;
import com.entity.vo.JiaoxueziyuanVO;
import com.entity.view.JiaoxueziyuanView;

@Service("jiaoxueziyuanService")
public class JiaoxueziyuanServiceImpl extends ServiceImpl<JiaoxueziyuanDao, JiaoxueziyuanEntity> implements JiaoxueziyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxueziyuanEntity> page = this.selectPage(
                new Query<JiaoxueziyuanEntity>(params).getPage(),
                new EntityWrapper<JiaoxueziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxueziyuanEntity> wrapper) {
		  Page<JiaoxueziyuanView> page =new Query<JiaoxueziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxueziyuanVO> selectListVO(Wrapper<JiaoxueziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxueziyuanVO selectVO(Wrapper<JiaoxueziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxueziyuanView> selectListView(Wrapper<JiaoxueziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxueziyuanView selectView(Wrapper<JiaoxueziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
