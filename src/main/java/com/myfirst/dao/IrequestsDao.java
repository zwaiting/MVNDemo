package com.myfirst.dao;

import com.myfirst.entity.Requests;

public interface IrequestsDao {
    int deleteByPrimaryKey(Integer requestId);

    int insert(Requests record);

    int insertSelective(Requests record);

    Requests selectByPrimaryKey(Integer requestId);

    Requests select1(Integer requestId);

    int updateByPrimaryKeySelective(Requests record);

    int updateByPrimaryKey(Requests record);
}