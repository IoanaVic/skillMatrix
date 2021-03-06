package com.yonder.matrix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Matrix {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String area;
	private String topic;
	private int priority;
	private int grade;
	private String phase;
	private String details;
	@ManyToOne
	private User user;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}

	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getPhase() {
		return phase;
	}
	
	public void setPhase(String phase) {
		this.phase = phase;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	    public int hashCode() {
	        return getId();
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	 
	        if(obj instanceof Matrix){
	        	Matrix matrix = (Matrix) obj;
	            return matrix.getId() == getId();
	        }
	 
	        return false;
	    }

}
