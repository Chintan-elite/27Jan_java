package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ins_id")
	int ins_id;
	@Column(name="ins_name")
	String ins_name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="insd_id")
	Instructor_detail instructor_detail;

	@OneToMany(mappedBy = "instructor",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	List<Course> course; 
	
	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public int getIns_id() {
		return ins_id;
	}

	public void setIns_id(int ins_id) {
		this.ins_id = ins_id;
	}

	public String getIns_name() {
		return ins_name;
	}

	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}

	public Instructor_detail getInstructor_detail() {
		return instructor_detail;
	}

	public void setInstructor_detail(Instructor_detail instructor_detail) {
		this.instructor_detail = instructor_detail;
	}
	
	public void addCourse(Course tempCourse)
	{
		if(course==null)
		{
			course = new ArrayList<Course>();
		}
		course.add(tempCourse);
		
		tempCourse.setInstructor(this);
	}
	
}
