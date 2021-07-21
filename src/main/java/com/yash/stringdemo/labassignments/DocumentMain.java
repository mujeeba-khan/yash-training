package com.yash.stringdemo.labassignments;

public class DocumentMain {

	public static void main(String[] args) {
		
		Document doc = new Document();
		doc.setTitle(args[0]);
		doc.setFilePath(args[1]);
		String file = doc.showDocumentInformation();
		System.out.println(file);

	}

}
