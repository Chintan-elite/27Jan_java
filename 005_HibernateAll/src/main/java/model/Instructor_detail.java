package model;

import javax.persistence.*;

@Entity
@Table(name="instructor_details")
public class Instructor_detail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="insd_id")
	int insd_id;
	@Column(name="insd_channel")
	String insd_channel;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "instructor_detail")
	Instructor instructor;

	public int getInsd_id() {
		return insd_id;
	}

	public void setInsd_id(int insd_id) {
		this.insd_id = insd_id;
	}

	public String getInsd_channel() {
		return insd_channel;
	}

	public void setInsd_channel(String insd_channel) {
		this.insd_channel = insd_channel;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
}
