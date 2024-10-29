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
 * 作业统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
@TableName("zuoyetongji")
public class ZuoyetongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoyetongjiEntity() {
		
	}
	
	public ZuoyetongjiEntity(T t) {
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
	 * 作业编号
	 */
					
	private String zuoyebianhao;
	
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
	 * 设置：作业编号
	 */
	public void setZuoyebianhao(String zuoyebianhao) {
		this.zuoyebianhao = zuoyebianhao;
	}
	/**
	 * 获取：作业编号
	 */
	public String getZuoyebianhao() {
		return zuoyebianhao;
	}
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
