package model;

import javax.persistence.*;

@Entity
@Table(name="studentdetails")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="fname")
	String fname;
	
	@Column(name="lname")
	String lname;
	
	@OneToOne(mappedBy = "studentDetails",cascade = CascadeType.ALL)
	Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}
