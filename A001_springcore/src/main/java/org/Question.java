package org;

public class Question {
	
	int qid;
	String que;
	
	public Question(int qid, String que) {
		super();
		this.qid = qid;
		this.que = que;
	}

	public void display()
	{
		System.out.println(qid+" "+que);
	}
}
