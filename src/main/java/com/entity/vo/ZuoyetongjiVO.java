package com.entity.vo;

import com.entity.ZuoyetongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 作业统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public class ZuoyetongjiVO  implements Serializable {
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
