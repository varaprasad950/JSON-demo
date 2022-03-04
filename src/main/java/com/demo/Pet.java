package com.demo;

import java.util.Date;
import java.util.List;

public class Pet {
	
	 private int id;
     private String name;
     private boolean isPopular;
     private String status;
     private String category;
     private Date createDate;
     private List<String> tags;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPopular() {
		return isPopular;
	}
	public void setPopular(boolean isPopular) {
		this.isPopular = isPopular;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

     
}
