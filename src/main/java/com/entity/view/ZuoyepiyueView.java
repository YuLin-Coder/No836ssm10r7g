package com.entity.view;

import com.entity.ZuoyepiyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业批阅
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
@TableName("zuoyepiyue")
public class ZuoyepiyueView  extends ZuoyepiyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyepiyueView(){
	}
 
 	public ZuoyepiyueView(ZuoyepiyueEntity zuoyepiyueEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyepiyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
