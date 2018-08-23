package com.example.mapper;

import com.example.entity.WisdomParkLog;

public interface WisdomParkLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WisdomParkLog record);

    int insertSelective(WisdomParkLog record);

    WisdomParkLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WisdomParkLog record);

    int updateByPrimaryKey(WisdomParkLog record);
}