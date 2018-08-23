package com.example.mapper;

import com.example.entity.WisdomParkCar;

public interface WisdomParkCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WisdomParkCar record);

    int insertSelective(WisdomParkCar record);

    WisdomParkCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WisdomParkCar record);

    int updateByPrimaryKey(WisdomParkCar record);
}