package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import model.Student;

public class StudentDao {
	
	JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public void addStudent(Student s)
	{
		String query = "insert into student values(0,'"+s.getUname()+"','"+s.getEmail()+"','"+s.getPass()+"')";
		jdbcTemplate.update(query);
		System.out.println("data inserted...");
	}

	public void updateStudent(Student std) {
	
		String query = "update student set pass='"+std.getPass()+"' where id="+std.getId()+"";
		jdbcTemplate.update(query);
		System.out.println("data updated...");
	}

	public void deleteStudent(int i) {
		
		String query = "delete from student where id="+i+"";
		jdbcTemplate.update(query);
		System.out.println("data deleted...");
		
	}

	public List<Student> vielAll() {
		
		return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>() {

			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				ArrayList<Student> al = new ArrayList<Student>();
				while(rs.next())
				{
					Student st = new Student();
					st.setId(rs.getInt(1));
					st.setUname(rs.getString(2));
					st.setEmail(rs.getString(3));
					st.setPass(rs.getString(4));
					al.add(st);
				}
				return al;
			}
			
		});
	}
}
