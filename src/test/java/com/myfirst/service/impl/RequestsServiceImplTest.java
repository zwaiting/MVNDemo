package com.myfirst.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.myfirst.entity.Requests;
import com.myfirst.service.IrequestsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * RequestServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 9, 2017</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class RequestsServiceImplTest {

	private static Log logger = LogFactory.getLog(RequestsServiceImplTest.class);
	private ApplicationContext ac = null;

	private IrequestsService requestsService = null;

	@Before
	public void before() throws Exception {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		requestsService = (IrequestsService) ac.getBean("s");
	}

	@After
	public void after() throws Exception {
	}

	/**
	 * Method: selectByPrimaryKey(Integer id)
	 */
	@Test
	public void testSelectByPrimaryKey() throws Exception {
		RowBounds r = new RowBounds(0,1);
		Requests requests = requestsService.select1(1);
		System.out.println("延时加载");
//		requests.getCourses();
		logger.info(JSONObject.toJSONString(requests.getCourses()));
		logger.info(JSON.toJSONString(requests));
	}


} 
