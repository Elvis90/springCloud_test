package com.example.mapper;

import com.example.entity.WisdomParkCompany;

public interface WisdomParkCompanyMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(WisdomParkCompany record);

    int insertSelective(WisdomParkCompany record);

    WisdomParkCompany selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(WisdomParkCompany record);

    int updateByPrimaryKey(WisdomParkCompany record);
}