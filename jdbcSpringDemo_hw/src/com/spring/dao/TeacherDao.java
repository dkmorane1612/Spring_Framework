package com.spring.dao;

import com.spring.entity.Teacher;


public interface TeacherDao {
	
	public void deleteByTeacherNm(String name);
	
	public void updateTeacherSalary(int id , int newSalary);
	
	public void addTeachers(Teacher tc);
	
}
