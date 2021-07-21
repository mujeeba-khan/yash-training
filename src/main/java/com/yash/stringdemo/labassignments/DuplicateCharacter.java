package com.yash.stringdemo.labassignments;

public class DuplicateCharacter {

	public String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public void findDuplicateCharacter()
	{
	    int count;  
        char string[] = word.toCharArray();
      
        for(int i = 0; i <string.length; i++)
        {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) 
            {  
                if(string[i] == string[j] && string[i] != ' ') 
                {  
                    count++;  
                     
                    string[j] = '0';  
                }  
            }   
            if(count > 1 && string[i] != '0')  
            {
            	System.out.println(string[i]);
            	 
            }

        }
    
	}
	
}
