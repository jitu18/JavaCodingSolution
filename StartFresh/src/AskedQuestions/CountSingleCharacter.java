package AskedQuestions;

import java.util.Scanner;

public class CountSingleCharacter {
	
	 public static void main(String[] args) {
		    
		    
		    Scanner scanner = new Scanner(System.in);
		    
		    System.out.println("Enter the String:");
		    
		    String s= scanner.nextLine();
		    
		    System.out.println("User Entered String:"+s);
		    
		    
		    
		    
		    s = s.toLowerCase();
		    
		    
		    int count =0;
		    
		    for(char ch: s.toCharArray())
		      
		    {
		      if (ch == 'a')
		      {
		        count++;
		      }
		      
		     
		    }
		    
		    System.out.println(count);
		    
		    scanner.close();
		    
		     }
		}


