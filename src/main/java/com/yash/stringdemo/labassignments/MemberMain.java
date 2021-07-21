package com.yash.stringdemo.labassignments;

public class MemberMain {

	public static void main(String[] args) {
		
		Member mem = new Member();
		mem.setFirstName(args[0]);
		mem.setLastName(args[1]);
		mem.setEmail(args[2]);
		mem.setPassword(args[3]);
		mem.setRole(args[4]);
		String member = mem.showMemberDetail();
		System.out.println(member);

	}

}
