package com.myfirst.service.impl;

import com.myfirst.dao.IcourseDao;
import com.myfirst.dao.IrequestDao;
import com.myfirst.entity.Course;
import com.myfirst.service.IcourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LT on 2017/5/11.
 */
@Service
public class CourseServiceImpl implements IcourseService{

	@Autowired
	private IcourseDao dao;

	public int deleteByKey(Integer courseId) {
		return dao.deleteByKey(courseId);
	}

	public List<Course> selectByForeignKey(Integer requestId) {
		return dao.selectByForeignKey(requestId);
	}

	public Course selectByPrimaryKey(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

	public int insertByAnnotation(Course course) {
		return dao.insertByAnnotation(course);
	}

	public int updateByAnnotation(Course course) {
		return dao.updateByAnnotation(course);
	}

	public List<Course> selectByKey(Integer requestId) {
		return dao.selectByKey(requestId);
	}
}
