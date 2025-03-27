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
 * 专业信息
 *
 * @author 
 * @email
 */
@TableName("zhuanye")
public class ZhuanyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhuanyeEntity() {

	}

	public ZhuanyeEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 专业名称
     */
    @ColumnInfo(comment="专业名称",type="varchar(200)")
    @TableField(value = "zhuanye_name")

    private String zhuanyeName;


    /**
     * 专业类型
     */
    @ColumnInfo(comment="专业类型",type="int(11)")
    @TableField(value = "zuanye_types")

    private Integer zuanyeTypes;


    /**
     * 专业封面
     */
    @ColumnInfo(comment="专业封面",type="varchar(200)")
    @TableField(value = "zhuanye_photo")

    private String zhuanyePhoto;


    /**
     * 师资力量
     */
    @ColumnInfo(comment="师资力量",type="varchar(200)")
    @TableField(value = "zhuanye_shangke")

    private String zhuanyeShangke;


    /**
     * 招生人数
     */
    @ColumnInfo(comment="招生人数",type="int(11)")
    @TableField(value = "zhuanye_number")

    private Integer zhuanyeNumber;


    /**
     * 学校
     */
    @ColumnInfo(comment="学校",type="int(11)")
    @TableField(value = "zhuanye_types")

    private Integer zhuanyeTypes;


    /**
     * 学院
     */
    @ColumnInfo(comment="学院",type="int(11)")
    @TableField(value = "zhuanye_erji_types")

    private Integer zhuanyeErjiTypes;


    /**
     * 专业简介
     */
    @ColumnInfo(comment="专业简介",type="text")
    @TableField(value = "zhuanye_content")

    private String zhuanyeContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "zhuanye_delete")

    private Integer zhuanyeDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 获取：专业名称
	 */
    public String getZhuanyeName() {
        return zhuanyeName;
    }
    /**
	 * 设置：专业名称
	 */

    public void setZhuanyeName(String zhuanyeName) {
        this.zhuanyeName = zhuanyeName;
    }
    /**
	 * 获取：专业类型
	 */
    public Integer getZuanyeTypes() {
        return zuanyeTypes;
    }
    /**
	 * 设置：专业类型
	 */

    public void setZuanyeTypes(Integer zuanyeTypes) {
        this.zuanyeTypes = zuanyeTypes;
    }
    /**
	 * 获取：专业封面
	 */
    public String getZhuanyePhoto() {
        return zhuanyePhoto;
    }
    /**
	 * 设置：专业封面
	 */

    public void setZhuanyePhoto(String zhuanyePhoto) {
        this.zhuanyePhoto = zhuanyePhoto;
    }
    /**
	 * 获取：师资力量
	 */
    public String getZhuanyeShangke() {
        return zhuanyeShangke;
    }
    /**
	 * 设置：师资力量
	 */

    public void setZhuanyeShangke(String zhuanyeShangke) {
        this.zhuanyeShangke = zhuanyeShangke;
    }
    /**
	 * 获取：招生人数
	 */
    public Integer getZhuanyeNumber() {
        return zhuanyeNumber;
    }
    /**
	 * 设置：招生人数
	 */

    public void setZhuanyeNumber(Integer zhuanyeNumber) {
        this.zhuanyeNumber = zhuanyeNumber;
    }
    /**
	 * 获取：学校
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }
    /**
	 * 设置：学校
	 */

    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 获取：学院
	 */
    public Integer getZhuanyeErjiTypes() {
        return zhuanyeErjiTypes;
    }
    /**
	 * 设置：学院
	 */

    public void setZhuanyeErjiTypes(Integer zhuanyeErjiTypes) {
        this.zhuanyeErjiTypes = zhuanyeErjiTypes;
    }
    /**
	 * 获取：专业简介
	 */
    public String getZhuanyeContent() {
        return zhuanyeContent;
    }
    /**
	 * 设置：专业简介
	 */

    public void setZhuanyeContent(String zhuanyeContent) {
        this.zhuanyeContent = zhuanyeContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getZhuanyeDelete() {
        return zhuanyeDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setZhuanyeDelete(Integer zhuanyeDelete) {
        this.zhuanyeDelete = zhuanyeDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Zhuanye{" +
            ", id=" + id +
            ", zhuanyeName=" + zhuanyeName +
            ", zuanyeTypes=" + zuanyeTypes +
            ", zhuanyePhoto=" + zhuanyePhoto +
            ", zhuanyeShangke=" + zhuanyeShangke +
            ", zhuanyeNumber=" + zhuanyeNumber +
            ", zhuanyeTypes=" + zhuanyeTypes +
            ", zhuanyeErjiTypes=" + zhuanyeErjiTypes +
            ", zhuanyeContent=" + zhuanyeContent +
            ", zhuanyeDelete=" + zhuanyeDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
