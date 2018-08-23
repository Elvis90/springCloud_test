package com.example.mapper;

import com.example.entity.WisdomParkOrder;

public interface WisdomParkOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WisdomParkOrder record);

    int insertSelective(WisdomParkOrder record);

    WisdomParkOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WisdomParkOrder record);

    int updateByPrimaryKeyWithBLOBs(WisdomParkOrder record);

    int updateByPrimaryKey(WisdomParkOrder record);
}