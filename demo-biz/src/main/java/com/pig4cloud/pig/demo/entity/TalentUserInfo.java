/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */
package com.pig4cloud.pig.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pig4cloud.pig.common.mybatis.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 *
 *
 * @author pig code generator
 * @date 2022-05-06 14:33:01
 */
@Data
@TableName("talent_user_info")
@EqualsAndHashCode(callSuper = true)
@Schema(name = "")
public class TalentUserInfo extends BaseEntity {

    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    @Schema(name="id")
    private Integer id;

    /**
     * 抖音app里的id
     */
    @Schema(name="抖音app里的id")
    private String uid;

    /**
     * 抖音、星图id
     */
    @Schema(name="抖音、星图id")
    private String uniqueId;

    /**
     * nickName
     */
    @Schema(name="nickName")
    private String nickName;

    /**
     * 头像地址
     */
    @Schema(name="头像地址")
    private String avatarLink;

    /**
     * 省
     */
    @Schema(name="省")
    private String province;

    /**
     * 市
     */
    @Schema(name="市")
    private String city;

    /**
     * 0:女，1：男，2：其他
     */
    @Schema(name="0:女，1：男，2：其他")
    private Integer gender;

    /**
     * 点赞数量
     */
    @Schema(name="点赞数量")
    private Integer totalLike;

    /**
     * 平均点赞
     */
    @Schema(name="平均点赞")
    private Integer avgLike;

    /**
     * 粉丝数量
     */
    @Schema(name="粉丝数量")
    private Integer fansCount;

    /**
     * 关注数量
     */
    @Schema(name="关注数量")
    private Integer focusCount;

    /**
     * 真粉数量
     */
    @Schema(name="真粉数量")
    private Integer realFansCount;

    /**
     * 用户提出的价格：1-20s：1000，20s-60s：2000
     */
    @Schema(name="用户提出的价格：1-20s：1000，20s-60s：2000")
    private String price;

    /**
     * 计算的真实价值：
     */
    @Schema(name="计算的真实价值：")
    private Float value;

    /**
     * 用户领域
     */
    @Schema(name="用户领域")
    private String type;

    /**
     * 总播放量
     */
    @Schema(name="总播放量")
    private Integer totalPlayNum;

    /**
     * 平均播放量
     */
    @Schema(name="平均播放量")
    private Integer avgPlayNum;

    /**
     * 预期播放量
     */
    @Schema(name="预期播放量")
    private Integer prePlayNum;

    /**
     * 单位粉丝贡献播放量
     */
    @Schema(name="单位粉丝贡献播放量")
    private Float playNumUnit;

    /**
     * 互动率
     */
    @Schema(name="互动率")
    private Float interactionNum;

    /**
     * 总评论数
     */
    @Schema(name="总评论数")
    private Integer totalCommentNum;

    /**
     * 平均评论数
     */
    @Schema(name="平均评论数")
    private Integer avgComment;

    /**
     * 总分享数
     */
    @Schema(name="总分享数")
    private Integer totalShareNum;

    /**
     * 平均分享数
     */
    @Schema(name="平均分享数")
    private Integer avgShareNum;

    /**
     * 发表的动态数量
     */
    @Schema(name="发表的动态数量")
    private Integer totalDynaicNum;

    /**
     * 传播力
     */
    @Schema(name="传播力")
    private Float communicationValue;

    /**
     * 粉丝特征
     */
    @Schema(name="粉丝特征")
    private String fansFeature;

    /**
     * 年龄
     */
    @Schema(name="年龄")
    private Integer age;

    /**
     * 用户描述
     */
    @Schema(name="用户描述")
    private String signature;

    /**
     * 视频数
     */
    @Schema(name="视频数")
    private Integer videoCount;

    /**
     * isVerified
     */
    @Schema(name="isVerified")
    private Integer isVerified;

    /**
     * birthday
     */
    @Schema(name="birthday")
    private String birthday;

    /**
     * cpm
     */
    @Schema(name="cpm")
    private Float cpm;

    /**
     * xtPrePlayNum
     */
    @Schema(name="xtPrePlayNum")
    private Integer xtPrePlayNum;

    /**
     * xtCpm
     */
    @Schema(name="xtCpm")
    private Float xtCpm;

    /**
     * 星图上任务完成数
     */
    @Schema(name="星图上任务完成数")
    private Integer xtOrderCompleteNum;

    /**
     * 扩展字段
     */
    @Schema(name="扩展字段")
    private String other;

    /**
     * 平台id
     */
    @Schema(name="平台id")
    private Integer platformId;

    /**
     * 喜欢的作品数量
     */
    @Schema(name="喜欢的作品数量")
    private Integer favoritingCount;

    /**
     * 爬虫扩展字段：来源
     */
    @Schema(name="爬虫扩展字段：来源")
    private String datafrom;

    /**
     * 星图id
     */
    @Schema(name="星图id")
    private String oid;

    /**
     * 平均制作周期
     */
    @Schema(name="平均制作周期")
    private Integer orderAvgTimeCost;

    /**
     * 星图达人指数
     */
    @Schema(name="星图达人指数")
    private Integer topScore;

    /**
     * 星图合作指数
     */
    @Schema(name="星图合作指数")
    private Integer cooperateIndex;

    /**
     * 星图传播指数
     */
    @Schema(name="星图传播指数")
    private Integer spreadIndex;

    /**
     * 达人风格标签
     */
    @Schema(name="达人风格标签")
    private String userStyle;


}
