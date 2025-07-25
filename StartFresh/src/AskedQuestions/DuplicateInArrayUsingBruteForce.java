package AskedQuestions;

import java.util.*;



public class DuplicateInArrayUsingBruteForce {
	public static void main(String[] args) {


	
	 Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the size of Array:");
	    int size = scanner.nextInt();
	    int[] arr = new int[size];
	    System.out.println("Enter the Array:");
	    for(int i=0;i<size;i++)
	    {
	       arr[i] = scanner.nextInt();
	    }
	    
	    for(int j=0;j<size;j++)
	    {
	      for(int k=j+1;k<size;k++)
	      {
	        if(arr[j]==arr[k])
	        {
	          System.out.println("Found duplicate:"+arr[j]);
	          break;
	            
	        }
	      }
	      
	    }
	    scanner.close();
	}
}
	



