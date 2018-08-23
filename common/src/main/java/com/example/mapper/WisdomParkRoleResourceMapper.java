package com.example.mapper;

import com.example.entity.WisdomParkRoleResource;

public interface WisdomParkRoleResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WisdomParkRoleResource record);

    int insertSelective(WisdomParkRoleResource record);

    WisdomParkRoleResource selectByPrimaryKey(Long id);
    
    WisdomParkRoleResource selectByroleId(Integer roleId);

    int updateByPrimaryKeySelective(WisdomParkRoleResource record);

    int updateByPrimaryKey(WisdomParkRoleResource record);
}