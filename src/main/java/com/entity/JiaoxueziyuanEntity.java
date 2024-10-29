package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教学资源
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
@TableName("jiaoxueziyuan")
public class JiaoxueziyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoxueziyuanEntity() {
		
	}
	
	public JiaoxueziyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
