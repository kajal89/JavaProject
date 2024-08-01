package com.relationship.mapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Quastion {

	@Id
	@Column(name="Quastion_Id")
	private int QId;
	private String qustion;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="OneToOne_relation")
	private Answer answer;
	public Quastion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Quastion(int qId, String qustion, Answer answer) {
		super();
		QId = qId;
		this.qustion = qustion;
		this.answer = answer;
	}
	public int getQId() {
		return QId;
	}
	public void setQId(int qId) {
		QId = qId;
	}
	public String getQustion() {
		return qustion;
	}
	public void setQustion(String qustion) {
		this.qustion = qustion;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Quastion [QId=" + QId + ", qustion=" + qustion + ", answer=" + answer + "]";
	}
	
}
