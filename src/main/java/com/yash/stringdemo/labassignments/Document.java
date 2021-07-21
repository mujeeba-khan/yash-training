package com.yash.stringdemo.labassignments;

public class Document {

	public String title;
	public String filepath;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFilePath() {
		return filepath;
	}
	public void setFilePath(String filepath) {
		this.filepath = filepath;
	}
	
	public String showDocumentInformation()
	{
		String file = "{title: "+ title + ", "+ "filepath: " + filepath+"}";
		return file;
	}
	
}
