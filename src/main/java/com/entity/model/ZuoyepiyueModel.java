package com.entity.model;

import com.entity.ZuoyepiyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 作业批阅
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public class ZuoyepiyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生
	 */
	
	private String xuesheng;
		
	/**
	 * 作业批阅
	 */
	
	private String zuoyepiyue;
		
	/**
	 * 作业成绩
	 */
	
	private Integer zuoyechengji;
		
	/**
	 * 是否及格
	 */
	
	private String shifoujige;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师
	 */
	
	private String jiaoshi;
		
	/**
	 * 批改时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pigaishijian;
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生
	 */
	 
	public void setXuesheng(String xuesheng) {
		this.xuesheng = xuesheng;
	}
	
	/**
	 * 获取：学生
	 */
	public String getXuesheng() {
		return xuesheng;
	}
				
	
	/**
	 * 设置：作业批阅
	 */
	 
	public void setZuoyepiyue(String zuoyepiyue) {
		this.zuoyepiyue = zuoyepiyue;
	}
	
	/**
	 * 获取：作业批阅
	 */
	public String getZuoyepiyue() {
		return zuoyepiyue;
	}
				
	
	/**
	 * 设置：作业成绩
	 */
	 
	public void setZuoyechengji(Integer zuoyechengji) {
		this.zuoyechengji = zuoyechengji;
	}
	
	/**
	 * 获取：作业成绩
	 */
	public Integer getZuoyechengji() {
		return zuoyechengji;
	}
				
	
	/**
	 * 设置：是否及格
	 */
	 
	public void setShifoujige(String shifoujige) {
		this.shifoujige = shifoujige;
	}
	
	/**
	 * 获取：是否及格
	 */
	public String getShifoujige() {
		return shifoujige;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师
	 */
	 
	public void setJiaoshi(String jiaoshi) {
		this.jiaoshi = jiaoshi;
	}
	
	/**
	 * 获取：教师
	 */
	public String getJiaoshi() {
		return jiaoshi;
	}
				
	
	/**
	 * 设置：批改时间
	 */
	 
	public void setPigaishijian(Date pigaishijian) {
		this.pigaishijian = pigaishijian;
	}
	
	/**
	 * 获取：批改时间
	 */
	public Date getPigaishijian() {
		return pigaishijian;
	}
			
}
