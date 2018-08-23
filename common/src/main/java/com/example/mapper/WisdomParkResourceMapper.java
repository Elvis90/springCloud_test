package com.example.mapper;

import com.example.entity.WisdomParkResource;

public interface WisdomParkResourceMapper {
    int deleteByPrimaryKey(Long resourceId);

    int insert(WisdomParkResource record);

    int insertSelective(WisdomParkResource record);

    WisdomParkResource selectByPrimaryKey(Long resourceId);

    int updateByPrimaryKeySelective(WisdomParkResource record);

    int updateByPrimaryKey(WisdomParkResource record);
}