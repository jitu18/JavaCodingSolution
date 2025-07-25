package HashMapAllproblems;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LargestNumberUsingPriorityQueueMaxHeap 
{
    
    public static int FindLargestNumber(int[] arr)
    {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       for(int i : arr)
       {
           maxHeap.add(i);
       }
       
       return maxHeap.peek();
       
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<size;i++)
		{
		    array[i]=scanner.nextInt();
		}
		
		int LargestNumber = FindLargestNumber(array);
		System.out.println("Largest Number is:" +LargestNumber);
		
		scanner.close();

	}

}




