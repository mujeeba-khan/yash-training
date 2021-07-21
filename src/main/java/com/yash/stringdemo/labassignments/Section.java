package com.yash.stringdemo.labassignments;

public class Section {

	public String id;
	public String name;
	public String createdDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	public String showSectionDetail() {
		
		String sect = "{id: "+id+", name:"+name+", created date: "+createdDate+"}";
		return sect;
		
	}
	
}
