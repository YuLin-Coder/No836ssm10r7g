package com.entity.model;

import com.entity.ZuoyetongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 作业统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public class ZuoyetongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 提交人数
	 */
	
	private Integer tijiaorenshu;
		
	/**
	 * 合格人数
	 */
	
	private Integer hegerenshu;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：提交人数
	 */
	 
	public void setTijiaorenshu(Integer tijiaorenshu) {
		this.tijiaorenshu = tijiaorenshu;
	}
	
	/**
	 * 获取：提交人数
	 */
	public Integer getTijiaorenshu() {
		return tijiaorenshu;
	}
				
	
	/**
	 * 设置：合格人数
	 */
	 
	public void setHegerenshu(Integer hegerenshu) {
		this.hegerenshu = hegerenshu;
	}
	
	/**
	 * 获取：合格人数
	 */
	public Integer getHegerenshu() {
		return hegerenshu;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
