package com.entity.view;

import com.entity.ZuoyetongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
@TableName("zuoyetongji")
public class ZuoyetongjiView  extends ZuoyetongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyetongjiView(){
	}
 
 	public ZuoyetongjiView(ZuoyetongjiEntity zuoyetongjiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyetongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
