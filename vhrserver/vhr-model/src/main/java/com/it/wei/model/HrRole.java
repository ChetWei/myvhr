package com.it.wei.model;

import lombok.Data;

/**
 * @auther: chetwei@163.com
 * @date: 2020/6/21 12:51
 * @description: 用户hr 和 角色role的中间表
 */
@Data
public class HrRole {
    private Integer id;

    private Integer hrid;

    private Integer rid;
}