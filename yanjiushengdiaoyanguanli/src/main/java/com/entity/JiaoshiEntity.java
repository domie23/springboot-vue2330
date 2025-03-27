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
 * 教师信息
 *
 * @author 
 * @email
 */
@TableName("jiaoshi")
public class JiaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoshiEntity() {

	}

	public JiaoshiEntity(T t) {
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
     * 教师名称
     */
    @ColumnInfo(comment="教师名称",type="varchar(200)")
    @TableField(value = "jiaoshi_name")

    private String jiaoshiName;


    /**
     * 教师类型
     */
    @ColumnInfo(comment="教师类型",type="int(11)")
    @TableField(value = "jiaoshi_types")

    private Integer jiaoshiTypes;


    /**
     * 教师头像
     */
    @ColumnInfo(comment="教师头像",type="varchar(200)")
    @TableField(value = "jiaoshi_photo")

    private String jiaoshiPhoto;


    /**
     * 联系方式
     */
    @ColumnInfo(comment="联系方式",type="varchar(200)")
    @TableField(value = "jiaoshi_phone")

    private String jiaoshiPhone;


    /**
     * 工作时长
     */
    @ColumnInfo(comment="工作时长",type="varchar(200)")
    @TableField(value = "jiaoshi_shichang")

    private String jiaoshiShichang;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


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
     * 教师简介
     */
    @ColumnInfo(comment="教师简介",type="text")
    @TableField(value = "jiaoshi_content")

    private String jiaoshiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "jiaoshi_delete")

    private Integer jiaoshiDelete;


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
	 * 获取：教师名称
	 */
    public String getJiaoshiName() {
        return jiaoshiName;
    }
    /**
	 * 设置：教师名称
	 */

    public void setJiaoshiName(String jiaoshiName) {
        this.jiaoshiName = jiaoshiName;
    }
    /**
	 * 获取：教师类型
	 */
    public Integer getJiaoshiTypes() {
        return jiaoshiTypes;
    }
    /**
	 * 设置：教师类型
	 */

    public void setJiaoshiTypes(Integer jiaoshiTypes) {
        this.jiaoshiTypes = jiaoshiTypes;
    }
    /**
	 * 获取：教师头像
	 */
    public String getJiaoshiPhoto() {
        return jiaoshiPhoto;
    }
    /**
	 * 设置：教师头像
	 */

    public void setJiaoshiPhoto(String jiaoshiPhoto) {
        this.jiaoshiPhoto = jiaoshiPhoto;
    }
    /**
	 * 获取：联系方式
	 */
    public String getJiaoshiPhone() {
        return jiaoshiPhone;
    }
    /**
	 * 设置：联系方式
	 */

    public void setJiaoshiPhone(String jiaoshiPhone) {
        this.jiaoshiPhone = jiaoshiPhone;
    }
    /**
	 * 获取：工作时长
	 */
    public String getJiaoshiShichang() {
        return jiaoshiShichang;
    }
    /**
	 * 设置：工作时长
	 */

    public void setJiaoshiShichang(String jiaoshiShichang) {
        this.jiaoshiShichang = jiaoshiShichang;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
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
	 * 获取：教师简介
	 */
    public String getJiaoshiContent() {
        return jiaoshiContent;
    }
    /**
	 * 设置：教师简介
	 */

    public void setJiaoshiContent(String jiaoshiContent) {
        this.jiaoshiContent = jiaoshiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJiaoshiDelete() {
        return jiaoshiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setJiaoshiDelete(Integer jiaoshiDelete) {
        this.jiaoshiDelete = jiaoshiDelete;
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
        return "Jiaoshi{" +
            ", id=" + id +
            ", jiaoshiName=" + jiaoshiName +
            ", jiaoshiTypes=" + jiaoshiTypes +
            ", jiaoshiPhoto=" + jiaoshiPhoto +
            ", jiaoshiPhone=" + jiaoshiPhone +
            ", jiaoshiShichang=" + jiaoshiShichang +
            ", sexTypes=" + sexTypes +
            ", zhuanyeTypes=" + zhuanyeTypes +
            ", zhuanyeErjiTypes=" + zhuanyeErjiTypes +
            ", jiaoshiContent=" + jiaoshiContent +
            ", jiaoshiDelete=" + jiaoshiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
