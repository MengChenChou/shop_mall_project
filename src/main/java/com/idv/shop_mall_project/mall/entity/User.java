/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本软件已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package com.idv.shop_mall_project.mall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class User {
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "login_name")
    private String loginName;
    @Column(name = "password_md5")
    private String passwordMd5;
    @Column(name = "introduce_sign")
    private String introduceSign;
    @Column(name = "is_deleted")
    private Byte isDeleted;
    @Column(name = "locked_flag")
    private Byte lockedFlag;
    @Column(name = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}