package com.myfirst.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.myfirst.entity.Course;
import com.myfirst.entity.Request;
import com.myfirst.service.IcourseService;
import com.myfirst.service.IrequestService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/** 
* CourseServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 11, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CourseServiceImplTest {

	private static Log logger = LogFactory.getLog(CourseServiceImplTest.class);
	private ApplicationContext ac = null;

	private IcourseService courseService = null;

@Before
public void before() throws Exception {
	ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	courseService = (IcourseService) ac.getBean("course");
} 

@After
public void after() throws Exception { 
} 

/**
*
* Method: deleteByKey(Integer courseId)
*
*/
@Test
public void testDeleteByKey() throws Exception {
//TODO: Test goes here...
	Integer i =  courseService.deleteByKey(1007);
	logger.info(i);
}

/**
*
* Method: selectByForeignKey(Integer requestId)
*
*/
@Test
public void testSelectByForeignKey() throws Exception {
	List<Course> courses = courseService.selectByForeignKey(1);
	logger.info(courses);
}

/**
*
* Method: selectByPrimaryKey(Integer id)
* 
*/ 
@Test
public void testSelectByPrimaryKey() throws Exception {
	Course course = courseService.selectByPrimaryKey(1);
	logger.info(JSONObject.toJSONString(course));
	logger.info(JSON.toJSONString(course));
}

	/**
	 *
	 * Method: selectByKey(Integer requestId)
	 *
	 */
	@Test
	public void testSelectByKey() throws Exception {
//TODO: Test goes here...
		List<Course> course = courseService.selectByKey(1);
		logger.info(course);
	}


	/**
	 *
	 * Method: insertByAnnotation(Course course)
	 *
	 */
	@Test
	public void testInsertByAnnotation() throws Exception {
//TODO: Test goes here...
		Course course = new Course();
		course.setCourseName("ds");
		course.setTrainPlace("fd");
		courseService.insertByAnnotation(course);
		logger.info(course.getReqCourseId());
	}

	/**
	 *
	 * Method: updateByAnnotation(Course course)
	 *
	 */
	@Test
	public void testUpdateByAnnotation() throws Exception {
//TODO: Test goes here...
		Course course = new Course();
		course.setCourseName("dss");
		course.setReqCourseId(128);
		int i = courseService.updateByAnnotation(course);
		logger.info(i);
	}
} 
