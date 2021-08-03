package com.yash.arraydemo.classassignments;

public class JaggedArrays {

	public static void main(String[] args) {
		
		 int jarray[][] = new int[3][];
		 
	       jarray[0] = new int[]{1,2,3};
	       jarray[1] = new int[]{4,5};
	       jarray[2] = new int[]{6,7,8,9,10};
	 
	       System.out.println("Jagged Array:");
	       for (int i=0;i<jarray.length; i++)
	       {
	          for (int j=0; j<jarray[i].length; j++)
	              System.out.print(jarray[i][j] + " ");
	          
	          System.out.println();
	        }

	}

}
