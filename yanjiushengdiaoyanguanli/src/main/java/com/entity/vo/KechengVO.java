package com.entity.vo;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课表信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng")
public class KechengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程名称
     */

    @TableField(value = "kecheng_name")
    private String kechengName;


    /**
     * 课程类型
     */

    @TableField(value = "kecheng_types")
    private Integer kechengTypes;


    /**
     * 课程封面
     */

    @TableField(value = "kecheng_photo")
    private String kechengPhoto;


    /**
     * 上课教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 专业信息
     */

    @TableField(value = "zhuanye_id")
    private Integer zhuanyeId;


    /**
     * 上课时间
     */

    @TableField(value = "kecheng_shangke")
    private String kechengShangke;


    /**
     * 课程时长
     */

    @TableField(value = "kecheng_shichang")
    private String kechengShichang;


    /**
     * 学校
     */

    @TableField(value = "zhuanye_types")
    private Integer zhuanyeTypes;


    /**
     * 学院
     */

    @TableField(value = "zhuanye_erji_types")
    private Integer zhuanyeErjiTypes;


    /**
     * 课程简介
     */

    @TableField(value = "kecheng_content")
    private String kechengContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "kecheng_delete")
    private Integer kechengDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：课程封面
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 获取：课程封面
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：上课教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：上课教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：专业信息
	 */
    public Integer getZhuanyeId() {
        return zhuanyeId;
    }


    /**
	 * 获取：专业信息
	 */

    public void setZhuanyeId(Integer zhuanyeId) {
        this.zhuanyeId = zhuanyeId;
    }
    /**
	 * 设置：上课时间
	 */
    public String getKechengShangke() {
        return kechengShangke;
    }


    /**
	 * 获取：上课时间
	 */

    public void setKechengShangke(String kechengShangke) {
        this.kechengShangke = kechengShangke;
    }
    /**
	 * 设置：课程时长
	 */
    public String getKechengShichang() {
        return kechengShichang;
    }


    /**
	 * 获取：课程时长
	 */

    public void setKechengShichang(String kechengShichang) {
        this.kechengShichang = kechengShichang;
    }
    /**
	 * 设置：学校
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 获取：学校
	 */

    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 设置：学院
	 */
    public Integer getZhuanyeErjiTypes() {
        return zhuanyeErjiTypes;
    }


    /**
	 * 获取：学院
	 */

    public void setZhuanyeErjiTypes(Integer zhuanyeErjiTypes) {
        this.zhuanyeErjiTypes = zhuanyeErjiTypes;
    }
    /**
	 * 设置：课程简介
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 获取：课程简介
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
