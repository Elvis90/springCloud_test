package com.example.mapper;

import com.example.entity.WisdomParkMsg;

public interface WisdomParkMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WisdomParkMsg record);

    int insertSelective(WisdomParkMsg record);

    WisdomParkMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WisdomParkMsg record);

    int updateByPrimaryKey(WisdomParkMsg record);
}