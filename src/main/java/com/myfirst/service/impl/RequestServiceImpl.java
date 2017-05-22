package com.myfirst.service.impl;

import com.myfirst.dao.IrequestDao;
import com.myfirst.entity.Parameter;
import com.myfirst.entity.Request;
import com.myfirst.service.IrequestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by LT on 2017/5/9.
 */
@Service("IrequestService")
public class RequestServiceImpl implements IrequestService{
	public int updateByPrimaryKey(Request record) {
		return dao.updateByPrimaryKey(record);
	}

	public int insertSelective(Request record) {
		return dao.insertSelective(record);
	}

	@Resource
	private IrequestDao dao;

	public int insert(Request record) {
		return dao.insert(record);
	}

	public Request selectByPrimaryKey(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

	public List<Request> selectTestLike1(String trainName) {
		return dao.selectTestLike1(trainName);
	}

	public List<Request> selectTestLike2(Request record) {
		return dao.selectTestLike2(record);
	}

	public List<Request> selectTestLike3(String trainName) {
		return dao.selectTestLike3(trainName);
	}

	public List<Request> selectTestLike4(Request record) {
		return dao.selectTestLike4(record);
	}

	public List<Request> selectTestLike5(Request record) {
		return dao.selectTestLike5(record);
	}

	public List<Request> selectTestIn1(List<Integer> list) {
		return dao.selectTestIn1(list);
	}

	public List<Request> selectTestIn2(Integer[] array) {
		return dao.selectTestIn2(array);

	}

	public List<Request> selectTestIn3(String  status) {
		return dao.selectTestIn3(status);

	}

	public List<Request> selectTestMultiparameter1(Integer[]  status,String name) {
		return dao.selectTestMultiparameter1(status,name);
	}

	public List<Request> selectTestMultiparameter2(Map<String,Object> map) {
		return dao.selectTestMultiparameter2(map);
	}

	public List<Request> selectTestMultiparameter3(String name,String purpose) {
		return dao.selectTestMultiparameter3(name,purpose);
	}

	public List<Request> selectTestMultiparameter4(Parameter parameter) {
		return dao.selectTestMultiparameter4(parameter);
	}
}
