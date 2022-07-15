package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="candidate")
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidate_id")
	int candidateId;
	@Column(name="candidate_name")
	String candidateName;
	
	@ManyToMany
	@JoinTable(
			name="courae_candidate",
			joinColumns = @JoinColumn(name="candidate_id"),
			inverseJoinColumns =  @JoinColumn(name="course_id")
	)
	List<Course> course;

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	public void addCourse(Course tempCourse)
	{
		if(course == null)
		{
			
			course = new ArrayList<Course>();
		}
		course.add(tempCourse);
	}
}
