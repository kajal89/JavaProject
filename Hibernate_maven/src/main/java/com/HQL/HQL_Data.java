package com.HQL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HQL_Data {
	
	@Id
	@Column(name="HQL_ID")
	private int id;
	private String queryHQL;
	public HQL_Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HQL_Data(int id, String queryHQL) {
		super();
		this.id = id;
		this.queryHQL = queryHQL;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQueryHQL() {
		return queryHQL;
	}
	public void setQueryHQL(String queryHQL) {
		this.queryHQL = queryHQL;
	}
	@Override
	public String toString() {
		return "HQL_Data [id=" + id + ", queryHQL=" + queryHQL + "]";
	}
	

}
