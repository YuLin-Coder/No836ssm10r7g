package com.entity.model;

import com.entity.JiaoxueziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教学资源
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public class JiaoxueziyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 配图
	 */
	
	private String peitu;
		
	/**
	 * 视频资源
	 */
	
	private String shipinziyuan;
		
	/**
	 * 资源分享
	 */
	
	private String ziyuanfenxiang;
		
	/**
	 * 资源介绍
	 */
	
	private String ziyuanjieshao;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：配图
	 */
	 
	public void setPeitu(String peitu) {
		this.peitu = peitu;
	}
	
	/**
	 * 获取：配图
	 */
	public String getPeitu() {
		return peitu;
	}
				
	
	/**
	 * 设置：视频资源
	 */
	 
	public void setShipinziyuan(String shipinziyuan) {
		this.shipinziyuan = shipinziyuan;
	}
	
	/**
	 * 获取：视频资源
	 */
	public String getShipinziyuan() {
		return shipinziyuan;
	}
				
	
	/**
	 * 设置：资源分享
	 */
	 
	public void setZiyuanfenxiang(String ziyuanfenxiang) {
		this.ziyuanfenxiang = ziyuanfenxiang;
	}
	
	/**
	 * 获取：资源分享
	 */
	public String getZiyuanfenxiang() {
		return ziyuanfenxiang;
	}
				
	
	/**
	 * 设置：资源介绍
	 */
	 
	public void setZiyuanjieshao(String ziyuanjieshao) {
		this.ziyuanjieshao = ziyuanjieshao;
	}
	
	/**
	 * 获取：资源介绍
	 */
	public String getZiyuanjieshao() {
		return ziyuanjieshao;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
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
