package com.spring.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entity.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl implements TeacherDao {
	
	@Autowired
	JdbcTemplate template;

	@Override
	public void deleteByTeacherNm(String name) {
		String query = "delete from teachers where name= ?";
		template.update(query, new Object[] { name });
		
	}

	@Override
	public void updateTeacherSalary(int id, int newSalary) {
		String query = "update teachers set salary = ? where id= ? ";
		template.update(query, new Object[] {newSalary,id});
		
	}

	@Override
	public void addTeachers(Teacher tc) {
		String query = "insert into teachers values (?, ?, ?)";
		template.update(query, new Object[] {tc.getId(),tc.getName(),tc.getSalary() });
		
	}
	
	

}
