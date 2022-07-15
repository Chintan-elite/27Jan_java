package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;
import model.Student;

public class StudentCrud {
	public static void main(String[] args) {
		
		
		Student std = new Student();
		//std.setId(1);
		std.setUname("Mohini");
		std.setEmail("mohini@gmail.com");
		std.setPass("Tops123");
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationcontaxt.xml");
		
		StudentDao dao =  context.getBean("dao", StudentDao.class);
		dao.addStudent(std);
		
		//dao.updateStudent(std);
		
		//dao.deleteStudent(1);
		
//		List<Student> al = dao.vielAll();
//		for(Student s : al)
//		{
//			System.out.println(s.getId()+" "+s.getUname()+" "+s.getEmail()+" "+s.getPass());
//		}
	}
}
