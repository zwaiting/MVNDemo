package com.myfirst.service;

import com.myfirst.entity.Course;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by LT on 2017/5/11.
 */
public interface IcourseService {
	Course selectByPrimaryKey(Integer id);

	List<Course> selectByForeignKey(Integer requestId);

	int deleteByKey(Integer courseId);

	List<Course> selectByKey(Integer requestId);

	int insertByAnnotation(Course course);

	int updateByAnnotation(Course course);
}
