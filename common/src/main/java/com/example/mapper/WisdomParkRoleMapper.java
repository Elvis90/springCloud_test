package com.example.mapper;

import com.example.entity.WisdomParkRole;

public interface WisdomParkRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(WisdomParkRole record);

    int insertSelective(WisdomParkRole record);

    WisdomParkRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(WisdomParkRole record);

    int updateByPrimaryKey(WisdomParkRole record);
}