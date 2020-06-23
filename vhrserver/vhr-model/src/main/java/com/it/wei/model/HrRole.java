package com.it.wei.model;

import lombok.Data;

/**
 * @auther: chetwei@163.com
 * @date: 2020/6/21 12:51
 * @description: 用户hr 和 角色role的中间表
 */

/**
 CREATE TABLE `hr_role` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `hrid` int(11) DEFAULT NULL,
 `rid` int(11) DEFAULT NULL,
 PRIMARY KEY (`id`),
 KEY `rid` (`rid`),
 KEY `hr_role_ibfk_1` (`hrid`),
 CONSTRAINT `hr_role_ibfk_1` FOREIGN KEY (`hrid`) REFERENCES `hr` (`id`) ON DELETE CASCADE,
 CONSTRAINT `hr_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;

 */
@Data
public class HrRole {
    private Integer id;

    private Integer hrid;

    private Integer rid;
}