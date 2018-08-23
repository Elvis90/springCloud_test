package com.example.mapper;

import com.example.entity.WisdomParkAlarmRule;

public interface WisdomParkAlarmRuleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WisdomParkAlarmRule record);

    int insertSelective(WisdomParkAlarmRule record);

    WisdomParkAlarmRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WisdomParkAlarmRule record);

    int updateByPrimaryKey(WisdomParkAlarmRule record);
}