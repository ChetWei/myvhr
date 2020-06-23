package com.it.wei.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: weimingan
 * @Date: 2020/6/23 16:20
 * @Description: 资源表
 */
/*
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(64) DEFAULT NULL,
  `path` varchar(64) DEFAULT NULL,
  `component` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `iconCls` varchar(64) DEFAULT NULL,
  `keepAlive` tinyint(1) DEFAULT NULL,
  `requireAuth` tinyint(1) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `parentId` (`parentId`),
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`parentId`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
* */
@Data
public class Menu implements Serializable {
    private Integer id;
    private String url;
    private String component;
    private String name;
    private String iconCls;
    private String Meta;
    private Integer parentId;
    private Boolean enabled;
    //资源表里面有父子关系 一个menu下面可以有多个其他的menu项
    private List<Menu> children;
    private List<Role> roles;


}