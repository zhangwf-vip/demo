package com.boot.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.boot.demo.entity.Student;

@Mapper
@Repository
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

	/**
	 * 
	 * @Title: insertStudent @Description: TODO(这里用一句话描述这个方法的作用) @author:
	 *         Administrator @date: 2020年1月3日 上午10:10:00 @param @param
	 *         studen @param @return 参数 @return int 返回类型 @throws
	 */
	int insertStudent(Student studen);

	/**
	 * 
	 * @Title: updateStudent @Description: TODO(这里用一句话描述这个方法的作用) @author:
	 *         Administrator @date: 2020年1月3日 上午10:10:13 @param @param
	 *         student @param @return 参数 @return int 返回类型 @throws
	 */
	int updateStudent(Student student);

}