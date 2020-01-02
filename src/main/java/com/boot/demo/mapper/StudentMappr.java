package com.boot.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.demo.entity.Student;

@Mapper
public interface StudentMappr {

	/**
	 * 
	 * @Title: listStudent @Description: TODO(获取所有的用户信息) @author:
	 *         Administrator @date: 2019年12月25日 下午3:23:48 @param @return 参数 @return
	 *         List<Student> 返回类型 @throws
	 */
	List<Student> listStudent();

	/**
	 * 
	 * @Title: getStudent @Description: TODO(获取用户信息) @author: Administrator @date:
	 *         2019年12月25日 下午4:06:30 @param @return 参数 @return Student 返回类型 @throws
	 */
	Student getStudent(String userName, String passWord);

	int insertStudent(Student studen);

	int updateStudent(Student student);

}