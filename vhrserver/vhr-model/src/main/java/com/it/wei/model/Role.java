package com.it.wei.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther: chetwei@163.com
 * @date: 2020/6/21 12:51
 * @description:
 */
@Data
public class Role implements Serializable {
    private Integer id;

    private String name;

    private String nameZh;
}