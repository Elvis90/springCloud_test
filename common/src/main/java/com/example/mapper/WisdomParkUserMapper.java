package com.example.mapper;

import com.example.entity.WisdomParkUser;

import util.MyMapper;

public interface WisdomParkUserMapper extends MyMapper<WisdomParkUser>{
    
	public WisdomParkUser getUserinfoById(Long userId);
	public WisdomParkUser getresourceByUserId(Long userId);
}