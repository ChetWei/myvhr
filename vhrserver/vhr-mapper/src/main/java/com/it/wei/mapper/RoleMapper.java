package com.it.wei.mapper;

import com.it.wei.model.Role;

import java.util.List;

/**
 * @auther: chetwei@163.com
 * @date: 2020/6/21 13:20
 * @description:
 */
public interface RoleMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> getAllRoles();
}