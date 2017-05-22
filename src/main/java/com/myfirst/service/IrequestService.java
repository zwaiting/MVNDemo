package com.myfirst.service;

import com.myfirst.entity.Parameter;
import com.myfirst.entity.Request;

import java.util.List;
import java.util.Map;

/**
 * Created by LT on 2017/5/9.
 */
public interface IrequestService {
	Request selectByPrimaryKey(Integer id);
	int insertSelective(Request record);
	int insert(Request record);
	int updateByPrimaryKey(Request record);

	List<Request> selectTestLike1(String trainName);

	List<Request> selectTestLike2(Request record);

	List<Request> selectTestLike3(String trainName);

	List<Request> selectTestLike4(Request record);

	List<Request> selectTestLike5(Request record);

	List<Request> selectTestIn1(List<Integer> list);

	List<Request> selectTestIn2(Integer[] array);

	List<Request> selectTestIn3(String  status);

	List<Request> selectTestMultiparameter1(Integer[]  status,String name);

	List<Request> selectTestMultiparameter2(Map<String,Object> map);

	List<Request> selectTestMultiparameter3(String name,String purpose);

	List<Request> selectTestMultiparameter4(Parameter parameter);
}
