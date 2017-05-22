package com.myfirst.service;

import com.myfirst.entity.Requests;

/**
 * Created by LT on 2017/5/9.
 */
public interface IrequestsService {
	Requests selectByPrimaryKey(Integer id);
	Requests select1(Integer id);

}
