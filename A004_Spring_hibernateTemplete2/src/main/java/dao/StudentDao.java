package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Student;

public class StudentDao {
	
    HibernateTemplate hibernateTemplate;
    


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void addStudent(Student s)
	{
		hibernateTemplate.save(s);
	}

	public void updateStudent(Student std) {
	
		

	}

	public void deleteStudent(int i) {
		
		
	}

	public List<Student> vielAll() {
		
		
			return null;
	
	}
}
