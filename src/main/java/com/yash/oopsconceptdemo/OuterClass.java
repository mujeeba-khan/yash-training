package com.yash.oopsconceptdemo;

public class OuterClass 
{
	
	private int number=90;
	
	class Inner
	{
		
		void show()
		{
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass o = new OuterClass();
		OuterClass.Inner i = o.new Inner();
		i.show();
	}
	
}
