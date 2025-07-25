package HashMapAllproblems;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KsmallestNumberUsingPriorityQueueMinheap 

{
    
    public static int KSmallestNumber(int[] arr, int k)
    {
       PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       for(int i : arr)
       {
           minHeap.add(i);
       }
       
       for(int j=1;j<k; j++)
       {
    	   
    	   minHeap.poll();
       }
       
       return minHeap.peek();
       
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the value of K:");
		int k = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<size;i++)
		{
		    array[i]=scanner.nextInt();
		}
		
		int SmallestNumber = KSmallestNumber(array,k);
		System.out.println("Smallest Number is:" +SmallestNumber);
		
		scanner.close();

	}

}




