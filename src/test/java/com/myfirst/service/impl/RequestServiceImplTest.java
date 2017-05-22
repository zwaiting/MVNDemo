package com.myfirst.service.impl;

import com.myfirst.entity.Parameter;
import com.myfirst.entity.Request;
import com.myfirst.service.IrequestService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RequestServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 14, 2017</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class RequestServiceImplTest {
	private static Logger logger = LoggerFactory.getLogger(RequestsServiceImplTest.class);
//	private static Log log = LogFactory.getLog(RequestsServiceImplTest.class);
	private ApplicationContext ac = null;

	private IrequestService requestService = null;

	@Before
	public void before() throws Exception {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		requestService = (IrequestService) ac.getBean("s");
	}

	@After
	public void after() throws Exception {
	}

	/**
	 * Method: insertSelective(Request record)
	 */
	@Test
	public void testInsertSelective() throws Exception {
		Request request = new Request();
		request.setTrainName("sds");
		requestService.insertSelective(request);
		/*log.info(request.toString());
		log.debug("fd");*/
//TODO: Test goes here...
	}

	/**
	 * Method: insert(Request record)
	 */
	@Test
	public void testInsert() throws Exception {
//TODO: Test goes here...
		Request request = new Request();
		request.setTrainName("sds");
		requestService.insert(request);
	}

	/**
	 * Method: selectByPrimaryKey(Integer id)
	 */
	@Test
	public void testSelectByPrimaryKey() throws Exception {
//TODO: Test goes here...
		Request request = requestService.selectByPrimaryKey(1);
//		logger.info(request);
	}

	/**
	 *
	 * Method: selectTestLike1(String trainName)
	 *
	 */
	@Test
	public void testSelectTestLike1() throws Exception {
//TODO: Test goes here...
		List<Request> request = requestService.selectTestLike1("息");
//		logger.info(request);
	}

	/**
	 *
	 * Method: selectTestLike2(String trainName)
	 *
	 */
	@Test
	public void testSelectTestLike2() throws Exception {
//TODO: Test goes here...
		Request request = new Request();
		request.setTrainName("息");
		List<Request> requests = requestService.selectTestLike2(request);
//		logger.info(requests);
	}

	/**
	 *
	 * Method: selectTestLike3(String trainName)
	 *
	 */
	@Test
	public void testSelectTestLike3() throws Exception {
//TODO: Test goes here...
		List<Request> request = requestService.selectTestLike3("息");
//		logger.info(request);
	}

	/**
	 *
	 * Method: selectTestLike4(Request record)
	 *
	 */
	@Test
	public void testSelectTestLike4() throws Exception {
//TODO: Test goes here...
		Request request = new Request();
		request.setTrainName("息");
		List<Request> requests = requestService.selectTestLike4(request);
//		logger.info(requests);
	}

	/**
	 *
	 * Method: selectTestLike5(Request record)
	 *
	 */
	@Test
	public void testSelectTestLike5() throws Exception {
//TODO: Test goes here...
		Request request = new Request();
		request.setTrainName("息");
		List<Request> requests = requestService.selectTestLike5(request);
//		logger.info(requests);
	}

	/**
	 *
	 * Method: selectTestIn1(Request record)
	 *
	 */
	@Test
	public void testSelectTestIn1() throws Exception {
//TODO: Test goes here...
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		List<Request> requests = requestService.selectTestIn1(list);
//		logger.info(requests);
	}

	/**
	 *
	 * Method: selectTestIn2(Request record)
	 *
	 */
	@Test
	public void testSelectTestIn2() throws Exception {
//TODO: Test goes here...
		Integer[] array = new Integer[]{1,2};
		List<Request> requests = requestService.selectTestIn2(array);
//		logger.info(requests);
	}

	/**
	 *
	 * Method: selectTestIn3(Request record)
	 *
	 */
	@Test
	public void testSelectTestIn3() throws Exception {
//TODO: Test goes here...
		String status = "1,2";
		List<Request> requests = requestService.selectTestIn3( status);
//		logger.info(requests);
	}

	/**
	 *
	 * Method: selectTestMultiparameter1(Integer[]  status, String name)
	 *
	 */
	@Test
	public void testSelectTestMultiparameter1() throws Exception {
//TODO: Test goes here...
		Integer[] array = new Integer[]{1,2};
		String name = "信";
		List<Request> requests = requestService.selectTestMultiparameter1(array,name);
	}

	/**
	 *
	 * Method: selectTestMultiparameter2(Map<String,Object> map)
	 *
	 */
	@Test
	public void testSelectTestMultiparameter2() throws Exception {
//TODO: Test goes here...
		String name = "信";
		String purpose = "信";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("trainName",name);
		map.put("trainPurpose",purpose);
		List<Request> requests = requestService.selectTestMultiparameter2(map);
	}

	/**
	 *
	 * Method: selectTestMultiparameter3(Integer[]  status, String name)
	 *
	 */
	@Test
	public void testSelectTestMultiparameter3() throws Exception {
//TODO: Test goes here...
		String name = "信";
		String purpose = "信";
		Map<String,Object> map = new HashMap<String,Object>();
		List<Request> requests = requestService.selectTestMultiparameter3(name,purpose);
	}

	/**
	 *
	 * Method: selectTestMultiparameter4(Parameter parameter)
	 *
	 */
	@Test
	public void testSelectTestMultiparameter4() throws Exception {
//TODO: Test goes here...

		Integer[] array = new Integer[]{1,2};
		String name = "信";
		Parameter parameter = new Parameter();
		parameter.setName(name);
		parameter.setArray(array);
		List<Request> requests = requestService.selectTestMultiparameter4(parameter);
		logger.error("s");
	}
}
