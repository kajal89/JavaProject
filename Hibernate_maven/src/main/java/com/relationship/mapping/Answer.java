package com.relationship.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
	
	@Id
//	@Column(name="Answer_Id")
	private int AId;
	private String ans;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aId, String ans) {
		super();
		AId = aId;
		this.ans = ans;
	}
	public int getAId() {
		return AId;
	}
	public void setAId(int aId) {
		AId = aId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Answer [AId=" + AId + ", ans=" + ans + "]";
	}
	
	

}
