package com.yash.oopsconceptdemo;

abstract class User
{
	abstract void showDetails();
}

public class AnonymousInnerClass {

	public static void main(String[] args) 
	{

		User u = new User() {
			void showDetails()
			{
				System.out.println("User is created");
			}
		};
		
		u.showDetails();

	}

}
