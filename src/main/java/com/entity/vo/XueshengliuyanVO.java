package com.entity.vo;

import com.entity.XueshengliuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学生留言
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-15 17:11:56
 */
public class XueshengliuyanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生
	 */
	
	private String xuesheng;
		
	/**
	 * 学生留言
	 */
	
	private String xueshengliuyan;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师
	 */
	
	private String jiaoshi;
		
	/**
	 * 教师回复
	 */
	
	private String jiaoshihuifu;
				
	
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
	 * 设置：学生留言
	 */
	 
	public void setXueshengliuyan(String xueshengliuyan) {
		this.xueshengliuyan = xueshengliuyan;
	}
	
	/**
	 * 获取：学生留言
	 */
	public String getXueshengliuyan() {
		return xueshengliuyan;
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
	 * 设置：教师回复
	 */
	 
	public void setJiaoshihuifu(String jiaoshihuifu) {
		this.jiaoshihuifu = jiaoshihuifu;
	}
	
	/**
	 * 获取：教师回复
	 */
	public String getJiaoshihuifu() {
		return jiaoshihuifu;
	}
			
}
