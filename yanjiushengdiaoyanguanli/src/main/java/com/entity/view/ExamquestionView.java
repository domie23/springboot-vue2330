package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ExamquestionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 试题表
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("examquestion")
public class ExamquestionView extends ExamquestionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 试题类型的值
	*/
	@ColumnInfo(comment="试题类型的字典表值",type="varchar(200)")
	private String examquestionValue;

	//级联表 问卷表
		/**
		* 问卷名称
		*/

		@ColumnInfo(comment="问卷名称",type="varchar(200)")
		private String exampaperName;
		/**
		* 时长(分钟)
		*/

		@ColumnInfo(comment="时长(分钟)",type="int(11)")
		private Integer exampaperDate;
		/**
		* 结束语
		*/

		@ColumnInfo(comment="结束语",type="varchar(255)")
		private String exampaperJieshuyu;
		/**
		* 问卷状态
		*/
		@ColumnInfo(comment="问卷状态",type="int(11)")
		private Integer exampaperTypes;
			/**
			* 问卷状态的值
			*/
			@ColumnInfo(comment="问卷状态的字典表值",type="varchar(200)")
			private String exampaperValue;



	public ExamquestionView() {

	}

	public ExamquestionView(ExamquestionEntity examquestionEntity) {
		try {
			BeanUtils.copyProperties(this, examquestionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 试题类型的值
	*/
	public String getExamquestionValue() {
		return examquestionValue;
	}
	/**
	* 设置： 试题类型的值
	*/
	public void setExamquestionValue(String examquestionValue) {
		this.examquestionValue = examquestionValue;
	}


	//级联表的get和set 问卷表

		/**
		* 获取： 问卷名称
		*/
		public String getExampaperName() {
			return exampaperName;
		}
		/**
		* 设置： 问卷名称
		*/
		public void setExampaperName(String exampaperName) {
			this.exampaperName = exampaperName;
		}

		/**
		* 获取： 时长(分钟)
		*/
		public Integer getExampaperDate() {
			return exampaperDate;
		}
		/**
		* 设置： 时长(分钟)
		*/
		public void setExampaperDate(Integer exampaperDate) {
			this.exampaperDate = exampaperDate;
		}

		/**
		* 获取： 结束语
		*/
		public String getExampaperJieshuyu() {
			return exampaperJieshuyu;
		}
		/**
		* 设置： 结束语
		*/
		public void setExampaperJieshuyu(String exampaperJieshuyu) {
			this.exampaperJieshuyu = exampaperJieshuyu;
		}
		/**
		* 获取： 问卷状态
		*/
		public Integer getExampaperTypes() {
			return exampaperTypes;
		}
		/**
		* 设置： 问卷状态
		*/
		public void setExampaperTypes(Integer exampaperTypes) {
			this.exampaperTypes = exampaperTypes;
		}


			/**
			* 获取： 问卷状态的值
			*/
			public String getExampaperValue() {
				return exampaperValue;
			}
			/**
			* 设置： 问卷状态的值
			*/
			public void setExampaperValue(String exampaperValue) {
				this.exampaperValue = exampaperValue;
			}


	@Override
	public String toString() {
		return "ExamquestionView{" +
			", examquestionValue=" + examquestionValue +
			", exampaperName=" + exampaperName +
			", exampaperDate=" + exampaperDate +
			", exampaperJieshuyu=" + exampaperJieshuyu +
			"} " + super.toString();
	}
}
