package com.example.mapper;

import com.example.entity.WisdomParkAlarm;

public interface WisdomParkAlarmMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WisdomParkAlarm record);

    int insertSelective(WisdomParkAlarm record);

    WisdomParkAlarm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WisdomParkAlarm record);

    int updateByPrimaryKey(WisdomParkAlarm record);
}