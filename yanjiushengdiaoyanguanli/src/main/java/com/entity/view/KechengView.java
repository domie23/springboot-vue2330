package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 课表信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kecheng")
public class KechengView extends KechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 课程类型的值
	*/
	@ColumnInfo(comment="课程类型的字典表值",type="varchar(200)")
	private String kechengValue;
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

	//级联表 教师信息
		/**
		* 教师名称
		*/

		@ColumnInfo(comment="教师名称",type="varchar(200)")
		private String jiaoshiName;
		/**
		* 教师类型
		*/
		@ColumnInfo(comment="教师类型",type="int(11)")
		private Integer jiaoshiTypes;
			/**
			* 教师类型的值
			*/
			@ColumnInfo(comment="教师类型的字典表值",type="varchar(200)")
			private String jiaoshiValue;
		/**
		* 教师头像
		*/

		@ColumnInfo(comment="教师头像",type="varchar(200)")
		private String jiaoshiPhoto;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String jiaoshiPhone;
		/**
		* 工作时长
		*/

		@ColumnInfo(comment="工作时长",type="varchar(200)")
		private String jiaoshiShichang;
		/**
		* 性别
		*/
		@ColumnInfo(comment="性别",type="int(11)")
		private Integer sexTypes;
			/**
			* 性别的值
			*/
			@ColumnInfo(comment="性别的字典表值",type="varchar(200)")
			private String sexValue;
		/**
		* 教师简介
		*/

		@ColumnInfo(comment="教师简介",type="text")
		private String jiaoshiContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer jiaoshiDelete;
	//级联表 专业信息
		/**
		* 专业名称
		*/

		@ColumnInfo(comment="专业名称",type="varchar(200)")
		private String zhuanyeName;
		/**
		* 专业类型
		*/
		@ColumnInfo(comment="专业类型",type="int(11)")
		private Integer zuanyeTypes;
			/**
			* 专业类型的值
			*/
			@ColumnInfo(comment="专业类型的字典表值",type="varchar(200)")
			private String zuanyeValue;
		/**
		* 专业封面
		*/

		@ColumnInfo(comment="专业封面",type="varchar(200)")
		private String zhuanyePhoto;
		/**
		* 师资力量
		*/

		@ColumnInfo(comment="师资力量",type="varchar(200)")
		private String zhuanyeShangke;
		/**
		* 招生人数
		*/

		@ColumnInfo(comment="招生人数",type="int(11)")
		private Integer zhuanyeNumber;
		/**
		* 专业简介
		*/

		@ColumnInfo(comment="专业简介",type="text")
		private String zhuanyeContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer zhuanyeDelete;

	//重复字段


	public KechengView() {

	}

	public KechengView(KechengEntity kechengEntity) {
		try {
			BeanUtils.copyProperties(this, kechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 课程类型的值
	*/
	public String getKechengValue() {
		return kechengValue;
	}
	/**
	* 设置： 课程类型的值
	*/
	public void setKechengValue(String kechengValue) {
		this.kechengValue = kechengValue;
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


	//级联表的get和set 教师信息

		/**
		* 获取： 教师名称
		*/
		public String getJiaoshiName() {
			return jiaoshiName;
		}
		/**
		* 设置： 教师名称
		*/
		public void setJiaoshiName(String jiaoshiName) {
			this.jiaoshiName = jiaoshiName;
		}
		/**
		* 获取： 教师类型
		*/
		public Integer getJiaoshiTypes() {
			return jiaoshiTypes;
		}
		/**
		* 设置： 教师类型
		*/
		public void setJiaoshiTypes(Integer jiaoshiTypes) {
			this.jiaoshiTypes = jiaoshiTypes;
		}


			/**
			* 获取： 教师类型的值
			*/
			public String getJiaoshiValue() {
				return jiaoshiValue;
			}
			/**
			* 设置： 教师类型的值
			*/
			public void setJiaoshiValue(String jiaoshiValue) {
				this.jiaoshiValue = jiaoshiValue;
			}

		/**
		* 获取： 教师头像
		*/
		public String getJiaoshiPhoto() {
			return jiaoshiPhoto;
		}
		/**
		* 设置： 教师头像
		*/
		public void setJiaoshiPhoto(String jiaoshiPhoto) {
			this.jiaoshiPhoto = jiaoshiPhoto;
		}

		/**
		* 获取： 联系方式
		*/
		public String getJiaoshiPhone() {
			return jiaoshiPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setJiaoshiPhone(String jiaoshiPhone) {
			this.jiaoshiPhone = jiaoshiPhone;
		}

		/**
		* 获取： 工作时长
		*/
		public String getJiaoshiShichang() {
			return jiaoshiShichang;
		}
		/**
		* 设置： 工作时长
		*/
		public void setJiaoshiShichang(String jiaoshiShichang) {
			this.jiaoshiShichang = jiaoshiShichang;
		}
		/**
		* 获取： 性别
		*/
		public Integer getSexTypes() {
			return sexTypes;
		}
		/**
		* 设置： 性别
		*/
		public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
		}


			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}

		/**
		* 获取： 教师简介
		*/
		public String getJiaoshiContent() {
			return jiaoshiContent;
		}
		/**
		* 设置： 教师简介
		*/
		public void setJiaoshiContent(String jiaoshiContent) {
			this.jiaoshiContent = jiaoshiContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getJiaoshiDelete() {
			return jiaoshiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setJiaoshiDelete(Integer jiaoshiDelete) {
			this.jiaoshiDelete = jiaoshiDelete;
		}
	//级联表的get和set 专业信息

		/**
		* 获取： 专业名称
		*/
		public String getZhuanyeName() {
			return zhuanyeName;
		}
		/**
		* 设置： 专业名称
		*/
		public void setZhuanyeName(String zhuanyeName) {
			this.zhuanyeName = zhuanyeName;
		}
		/**
		* 获取： 专业类型
		*/
		public Integer getZuanyeTypes() {
			return zuanyeTypes;
		}
		/**
		* 设置： 专业类型
		*/
		public void setZuanyeTypes(Integer zuanyeTypes) {
			this.zuanyeTypes = zuanyeTypes;
		}


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

		/**
		* 获取： 专业封面
		*/
		public String getZhuanyePhoto() {
			return zhuanyePhoto;
		}
		/**
		* 设置： 专业封面
		*/
		public void setZhuanyePhoto(String zhuanyePhoto) {
			this.zhuanyePhoto = zhuanyePhoto;
		}

		/**
		* 获取： 师资力量
		*/
		public String getZhuanyeShangke() {
			return zhuanyeShangke;
		}
		/**
		* 设置： 师资力量
		*/
		public void setZhuanyeShangke(String zhuanyeShangke) {
			this.zhuanyeShangke = zhuanyeShangke;
		}

		/**
		* 获取： 招生人数
		*/
		public Integer getZhuanyeNumber() {
			return zhuanyeNumber;
		}
		/**
		* 设置： 招生人数
		*/
		public void setZhuanyeNumber(Integer zhuanyeNumber) {
			this.zhuanyeNumber = zhuanyeNumber;
		}

		/**
		* 获取： 专业简介
		*/
		public String getZhuanyeContent() {
			return zhuanyeContent;
		}
		/**
		* 设置： 专业简介
		*/
		public void setZhuanyeContent(String zhuanyeContent) {
			this.zhuanyeContent = zhuanyeContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getZhuanyeDelete() {
			return zhuanyeDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setZhuanyeDelete(Integer zhuanyeDelete) {
			this.zhuanyeDelete = zhuanyeDelete;
		}

	//重复字段

	@Override
	public String toString() {
		return "KechengView{" +
			", kechengValue=" + kechengValue +
			", zhuanyeValue=" + zhuanyeValue +
			", zhuanyeErjiValue=" + zhuanyeErjiValue +
			", jiaoshiName=" + jiaoshiName +
			", jiaoshiPhoto=" + jiaoshiPhoto +
			", jiaoshiPhone=" + jiaoshiPhone +
			", jiaoshiShichang=" + jiaoshiShichang +
			", jiaoshiContent=" + jiaoshiContent +
			", jiaoshiDelete=" + jiaoshiDelete +
			", zhuanyeName=" + zhuanyeName +
			", zhuanyePhoto=" + zhuanyePhoto +
			", zhuanyeShangke=" + zhuanyeShangke +
			", zhuanyeNumber=" + zhuanyeNumber +
			", zhuanyeContent=" + zhuanyeContent +
			", zhuanyeDelete=" + zhuanyeDelete +
			"} " + super.toString();
	}
}
