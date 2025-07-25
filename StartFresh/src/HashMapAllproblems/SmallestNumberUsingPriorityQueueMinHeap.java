package HashMapAllproblems;
import java.util.*;
public class SmallestNumberUsingPriorityQueueMinHeap 


{
    
    public static int FindSmallestNumber(int[] arr)
    {
       PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       for(int i : arr)
       {
           minHeap.add(i);
       }
       
       return minHeap.peek();
       
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
		
		int SmallestNumber = FindSmallestNumber(array);
		System.out.println("Smallest Number is:" +SmallestNumber);
		
		scanner.close();

	}

}

