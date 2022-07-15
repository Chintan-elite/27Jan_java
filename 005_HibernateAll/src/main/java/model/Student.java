package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	int sid;
	@Column(name="sname")
	String sname;
	
	@ManyToMany
	@JoinTable(
			
			name = "student_course",
			joinColumns = @JoinColumn(name="sid"),
			inverseJoinColumns = @JoinColumn(name="cid")
			
			)
	List<Course> courses;
	
	public void addCourse(Course tempCourse)
	{
		if(courses==null)
		{
			courses = new ArrayList<Course>();
		}
		courses.add(tempCourse);
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
