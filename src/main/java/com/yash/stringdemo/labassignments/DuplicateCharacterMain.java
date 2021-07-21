package com.yash.stringdemo.labassignments;

public class DuplicateCharacterMain {

	public static void main(String[] args) {
		
		System.out.println("Duplicate characters in a given string: "); 
		DuplicateCharacter dup = new DuplicateCharacter();
		dup.setWord(args[0]);
		dup.findDuplicateCharacter();
		
	}

}
