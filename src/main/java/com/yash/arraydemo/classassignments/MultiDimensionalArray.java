package com.yash.arraydemo.classassignments;

public class MultiDimensionalArray {
	
	public static void main(String args[])
	{
		System.out.println("2D array: ");
		int[][] arr = { { 1, 2 }, { 3, 4 } };
		  
	    for (int i = 0; i < 2; i++)
	    {
	    	for (int j = 0; j < 2; j++)
	    	{
	    		 System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	        
	           

	    System.out.println("\n3D array: ");
        int[][][] arr1 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        
        for (int i = 0; i < 2; i++)
        {
        	for (int j = 0; j < 2; j++)
        	{
        		for (int z = 0; z < 2; z++)
        		{
        			System.out.print(arr1[i][j][z]+" ");
        		}
        		//System.out.print("");
        	}
        	System.out.println();
        }
            
                
                                              
	        	
	        
	        
	}
	
}
