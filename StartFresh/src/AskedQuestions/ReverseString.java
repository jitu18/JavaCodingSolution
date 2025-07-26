package AskedQuestions;

import java.util.Scanner;

public class ReverseString {
	
	  public static void main(String[] args) {
		    
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter the String:");
		    String s = scanner.nextLine();
		    char[] input = s.toCharArray();
		    char[] result = new char[input.length];
		    int j=0;
		    
		    for(int i=input.length-1; i>=0; i--)
		    {
		      result[j] = input[i];
		      j++;
		    }
		    
		    scanner.close();
		    
		    System.out.println("Reversed String:"+ new String(result));
		    
	  }

}
