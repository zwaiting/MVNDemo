package com.myfirst.dao;

import com.myfirst.entity.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IcourseDao {
    int deleteByPrimaryKey(Integer reqCourseId);

    @Delete("DELETE FROM per_train_request WHERE request_id = #{courseId}")
    int deleteByKey(Integer courseId);

    /*当只有一个参数时，可以不写@Param*/
	@Select("select * from per_train_req_course where request__id = #{requestId}")
	@ResultMap(value = "BaseResultMap")
	List<Course> selectByKey(@Param("requestId") Integer requestId);


	@Insert("insert into per_train_req_course(COURSE_NAME,TRAIN_PLACE)values(#{courseName,jdbcType=VARCHAR},#{trainPlace,jdbcType=VARCHAR})")
	@Options(useGeneratedKeys = true,keyProperty = "reqCourseId")
	int insertByAnnotation(Course course);

	@Update("update per_train_req_course set course_name = #{courseName,jdbcType=VARCHAR} where req_course_id = #{reqCourseId,jdbcType=INTEGER}")
	int updateByAnnotation(Course course);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer reqCourseId);

    List<Course> selectByForeignKey(Integer requestId);



    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}