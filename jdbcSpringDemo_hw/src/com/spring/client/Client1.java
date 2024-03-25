package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.SpringConfig;
import com.spring.dao.TeacherDao;
import com.spring.entity.Teacher;

public class Client1 {

	public static void main(String[] args) {
		ApplicationContext conText = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		TeacherDao dao = (TeacherDao) conText.getBean("teacherDao");
		
//		dao.addTeachers(new Teacher(11,"Ashwini Mam",65000));
//		dao.addTeachers(new Teacher(12,"Ravindra Sir",80000));
//		dao.addTeachers(new Teacher(13,"Vasudha Mam",57000));
//		dao.addTeachers(new Teacher(14,"Abhinav Sir",100000));
//		dao.addTeachers(new Teacher(15,"Patil Sir",80000));
	
//		dao.updateTeacherSalary(13, 60000);
		dao.deleteByTeacherNm("Patil Sir");

	}

}
