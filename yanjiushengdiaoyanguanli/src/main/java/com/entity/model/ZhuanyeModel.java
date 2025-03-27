package com.entity.model;

import com.entity.ZhuanyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 专业信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuanyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 专业名称
     */
    private String zhuanyeName;


    /**
     * 专业类型
     */
    private Integer zuanyeTypes;


    /**
     * 专业封面
     */
    private String zhuanyePhoto;


    /**
     * 师资力量
     */
    private String zhuanyeShangke;


    /**
     * 招生人数
     */
    private Integer zhuanyeNumber;


    /**
     * 学校
     */
    private Integer zhuanyeTypes;


    /**
     * 学院
     */
    private Integer zhuanyeErjiTypes;


    /**
     * 专业简介
     */
    private String zhuanyeContent;


    /**
     * 逻辑删除
     */
    private Integer zhuanyeDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
