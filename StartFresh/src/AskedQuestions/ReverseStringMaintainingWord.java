package AskedQuestions;

import java.util.Scanner;

public class ReverseStringMaintainingWord {
	
	 public static void main(String[] args) {
		    
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter the String:");
		    String s = scanner.nextLine();
		    String[] original = s.split(" ");
		    String[] Replaced = new String[original.length];
		    String finalsentence = "";
		    
		    int j=0;
		    
		    for(int i=original.length-1; i>=0; i--)
		    {
		      Replaced[j] = original[i];
		      j++;
		    }
		    for(int i=0;i<Replaced.length;i++)
		    {
		      finalsentence+= Replaced[i];
		      
		      if(i < Replaced.length-1)
		      {
		        finalsentence += " ";
		      }
		    }
		      
		    scanner.close();
		    System.out.println("Reversed String:" +finalsentence);
		    
		    
		    
		    
		    
		  }
		}



