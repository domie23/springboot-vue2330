package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 问卷表
 *
 * @author 
 * @email
 */
@TableName("exampaper")
public class ExampaperEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ExampaperEntity() {

	}

	public ExampaperEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(20)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 问卷名称
     */
    @ColumnInfo(comment="问卷名称",type="varchar(200)")
    @TableField(value = "exampaper_name")

    private String exampaperName;


    /**
     * 时长(分钟)
     */
    @ColumnInfo(comment="时长(分钟)",type="int(11)")
    @TableField(value = "exampaper_date")

    private Integer exampaperDate;


    /**
     * 结束语
     */
    @ColumnInfo(comment="结束语",type="varchar(255)")
    @TableField(value = "exampaper_jieshuyu")

    private String exampaperJieshuyu;


    /**
     * 问卷状态
     */
    @ColumnInfo(comment="问卷状态",type="int(11)")
    @TableField(value = "exampaper_types")

    private Integer exampaperTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：问卷名称
	 */
    public String getExampaperName() {
        return exampaperName;
    }
    /**
	 * 设置：问卷名称
	 */

    public void setExampaperName(String exampaperName) {
        this.exampaperName = exampaperName;
    }
    /**
	 * 获取：时长(分钟)
	 */
    public Integer getExampaperDate() {
        return exampaperDate;
    }
    /**
	 * 设置：时长(分钟)
	 */

    public void setExampaperDate(Integer exampaperDate) {
        this.exampaperDate = exampaperDate;
    }
    /**
	 * 获取：结束语
	 */
    public String getExampaperJieshuyu() {
        return exampaperJieshuyu;
    }
    /**
	 * 设置：结束语
	 */

    public void setExampaperJieshuyu(String exampaperJieshuyu) {
        this.exampaperJieshuyu = exampaperJieshuyu;
    }
    /**
	 * 获取：问卷状态
	 */
    public Integer getExampaperTypes() {
        return exampaperTypes;
    }
    /**
	 * 设置：问卷状态
	 */

    public void setExampaperTypes(Integer exampaperTypes) {
        this.exampaperTypes = exampaperTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Exampaper{" +
            ", id=" + id +
            ", exampaperName=" + exampaperName +
            ", exampaperDate=" + exampaperDate +
            ", exampaperJieshuyu=" + exampaperJieshuyu +
            ", exampaperTypes=" + exampaperTypes +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
