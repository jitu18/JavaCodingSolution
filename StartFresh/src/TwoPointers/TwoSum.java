package TwoPointers;

public class TwoSum {
	
	/* Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.*/
	
	/* Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].*/
	
	public static int[] twoSumBruteForce(int[] numbers, int target) {
	    // Iterate over each element in the array
	    for (int i = 0; i < numbers.length; i++) {
	        // For the current 'i', iterate over every element greater than 'i'
	        for (int j = i + 1; j < numbers.length; j++) {
	            // If the pair adds up to the target, return their indices (1-indexed)
	            if (numbers[i] + numbers[j] == target) {
	                return new int[]{i + 1, j + 1};
	            }
	            // Since the array is sorted, no need to further check if sum exceeds target
	            if (numbers[i] + numbers[j] > target) {
	                break;
	            }
	        }
	    }
	    // Return an empty array if no solution is found, although the problem guarantees a solution
	    return new int[]{};
	}
	
	public static void main(String args[])
	{
		
		int[] numbers = {2,7,11,15};
		int target = 9 ;
		for (int i : twoSumBruteForce(numbers,target)) {
			
			System.out.println(i);
			
		}
	
	}


}
