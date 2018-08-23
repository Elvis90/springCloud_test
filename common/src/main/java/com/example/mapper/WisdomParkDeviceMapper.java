package com.example.mapper;

import com.example.entity.WisdomParkDevice;

public interface WisdomParkDeviceMapper {
    int deleteByPrimaryKey(Long deviceId);

    int insert(WisdomParkDevice record);

    int insertSelective(WisdomParkDevice record);

    WisdomParkDevice selectByPrimaryKey(Long deviceId);

    int updateByPrimaryKeySelective(WisdomParkDevice record);

    int updateByPrimaryKey(WisdomParkDevice record);
}