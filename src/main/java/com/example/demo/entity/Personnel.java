package com.example.demo.entity;

import com.example.demo.common.pageParam.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "人员实体")
public class Personnel extends PageParam {

    @ApiModelProperty(value = "人员Id")
    private Integer id;

    @ApiModelProperty(value = "学生学号")
    private String studyNumber;

    @ApiModelProperty(value = "人员姓名")
    private String name;

    @ApiModelProperty(value = "人员性别")
    private Integer gender;

    @ApiModelProperty(value = "学生类别")
    private Integer studentType;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "身份证号")
    private String personId;

    @ApiModelProperty(value = "家长姓名")
    private String parentName;

    @ApiModelProperty(value = "家长电话")
    private String parentPhone;

    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "人脸唯一标识")
    private String faceImageId;

    @ApiModelProperty(value = "人脸照")
    private String faceImageUri;

    @ApiModelProperty(value = "人员有效标志")
    private Integer validityPeriod;

    @ApiModelProperty(value = "人员照")
    private String pictureUri;

    @ApiModelProperty(value = "人员类型")
    private String personType;

    @ApiModelProperty(value = "人员状态")
    private Integer status;

    @ApiModelProperty(value = "场景照")
    private String sceneImageUri;

    @ApiModelProperty(value = "档案号")
    private String fileNumber;

    @ApiModelProperty(value = "人员照")
    private String personPictureUri;

    @ApiModelProperty(value = "创建时间")
    private Date creatTime;

    @ApiModelProperty(value = "录入时间")
    private Date entryTime;

    @ApiModelProperty(value = "部门Id")
    private Long deptId;

    @ApiModelProperty(value = "岗位Id")
    private Long postId;

    @ApiModelProperty(value = "工号")
    private String jobNumber;

    @ApiModelProperty(value = "是否删除")
    private Byte isDel;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "生日")
    private String birthday;

    @ApiModelProperty(value = "国籍")
    private Integer nation;

    @ApiModelProperty(value = "扩展字段1")
    private String ext1;

    @ApiModelProperty(value = "扩展字段2")
    private String ext2;

    @ApiModelProperty(value = "过期时间")
    private Integer expireTime;

    @ApiModelProperty(value = "标签Id")
    private String tagId;

}