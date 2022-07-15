package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
	int courseId;
	@Column(name="course_name")
	String courseName;
	
	@ManyToMany
	@JoinTable(
			name="courae_candidate",
			joinColumns = @JoinColumn(name="course_id"),
			inverseJoinColumns =  @JoinColumn(name="candidate_id")
	)
	List<Candidate> candidates;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	public void addCandidate(Candidate tempCandidate)
	{
		if(candidates==null)
		{
			candidates = new ArrayList<Candidate>();
		}
		candidates.add(tempCandidate);
	}
	
}
