package com.myfirst.service.impl;

import com.myfirst.dao.IrequestDao;
import com.myfirst.dao.IrequestsDao;
import com.myfirst.entity.Request;
import com.myfirst.entity.Requests;
import com.myfirst.service.IrequestService;
import com.myfirst.service.IrequestsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LT on 2017/5/9.
 */
@Service("IrequestsService")
public class RequestsServiceImpl implements IrequestsService {



	@Resource
	private IrequestsDao dao;

	public Requests selectByPrimaryKey(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

	public Requests select1(Integer id) {
		return dao.select1(id);
	}
}
