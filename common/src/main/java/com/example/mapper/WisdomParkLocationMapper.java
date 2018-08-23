package com.example.mapper;

import com.example.entity.WisdomParkLocation;

public interface WisdomParkLocationMapper {
    int deleteByPrimaryKey(String locationId);

    int insert(WisdomParkLocation record);

    int insertSelective(WisdomParkLocation record);

    WisdomParkLocation selectByPrimaryKey(String locationId);

    int updateByPrimaryKeySelective(WisdomParkLocation record);

    int updateByPrimaryKey(WisdomParkLocation record);
}