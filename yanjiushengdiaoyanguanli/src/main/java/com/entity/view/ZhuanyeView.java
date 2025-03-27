package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZhuanyeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 专业信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("zhuanye")
public class ZhuanyeView extends ZhuanyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 专业类型的值
	*/
	@ColumnInfo(comment="专业类型的字典表值",type="varchar(200)")
	private String zuanyeValue;
	/**
	* 学校的值
	*/
	@ColumnInfo(comment="学校的字典表值",type="varchar(200)")
	private String zhuanyeValue;
	/**
	* 学院的值
	*/
	@ColumnInfo(comment="学院的字典表值",type="varchar(200)")
	private String zhuanyeErjiValue;




	public ZhuanyeView() {

	}

	public ZhuanyeView(ZhuanyeEntity zhuanyeEntity) {
		try {
			BeanUtils.copyProperties(this, zhuanyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 专业类型的值
	*/
	public String getZuanyeValue() {
		return zuanyeValue;
	}
	/**
	* 设置： 专业类型的值
	*/
	public void setZuanyeValue(String zuanyeValue) {
		this.zuanyeValue = zuanyeValue;
	}
	//当前表的
	/**
	* 获取： 学校的值
	*/
	public String getZhuanyeValue() {
		return zhuanyeValue;
	}
	/**
	* 设置： 学校的值
	*/
	public void setZhuanyeValue(String zhuanyeValue) {
		this.zhuanyeValue = zhuanyeValue;
	}
	//当前表的
	/**
	* 获取： 学院的值
	*/
	public String getZhuanyeErjiValue() {
		return zhuanyeErjiValue;
	}
	/**
	* 设置： 学院的值
	*/
	public void setZhuanyeErjiValue(String zhuanyeErjiValue) {
		this.zhuanyeErjiValue = zhuanyeErjiValue;
	}




	@Override
	public String toString() {
		return "ZhuanyeView{" +
			", zuanyeValue=" + zuanyeValue +
			", zhuanyeValue=" + zhuanyeValue +
			", zhuanyeErjiValue=" + zhuanyeErjiValue +
			"} " + super.toString();
	}
}
