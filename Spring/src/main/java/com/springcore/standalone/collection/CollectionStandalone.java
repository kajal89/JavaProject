package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class CollectionStandalone {
	private List<String> friends;
	private Map<String, Integer> courses;

	public CollectionStandalone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "CollectionStandalone [friends=" + friends + ", courses=" + courses + "]";
	}

	

}
