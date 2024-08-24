package com.cl.entity;

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
 * 作业批改
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-07 23:47:46
 */
@TableName("zuoyepigai")
public class ZuoyepigaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoyepigaiEntity() {
		
	}
	
	public ZuoyepigaiEntity(T t) {
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
	 * 作业名称
	 */
					
	private String zuoyemingcheng;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 提交作业内容
	 */
					
	private String tijiaozuoyeneirong;
	
	/**
	 * 评分
	 */
					
	private Integer pingfen;
	
	/**
	 * 建议
	 */
					
	private String jianyi;
	
	/**
	 * 批改时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date pigaishijian;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	
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
	 * 设置：作业名称
	 */
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
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
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：提交作业内容
	 */
	public void setTijiaozuoyeneirong(String tijiaozuoyeneirong) {
		this.tijiaozuoyeneirong = tijiaozuoyeneirong;
	}
	/**
	 * 获取：提交作业内容
	 */
	public String getTijiaozuoyeneirong() {
		return tijiaozuoyeneirong;
	}
	/**
	 * 设置：评分
	 */
	public void setPingfen(Integer pingfen) {
		this.pingfen = pingfen;
	}
	/**
	 * 获取：评分
	 */
	public Integer getPingfen() {
		return pingfen;
	}
	/**
	 * 设置：建议
	 */
	public void setJianyi(String jianyi) {
		this.jianyi = jianyi;
	}
	/**
	 * 获取：建议
	 */
	public String getJianyi() {
		return jianyi;
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
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}

}
