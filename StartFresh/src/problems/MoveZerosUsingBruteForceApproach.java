package problems;

public class MoveZerosUsingBruteForceApproach {

	public static void moveZeros(int[] nums)
	{
		int n = nums.length;
		int j =0;
		int[] result = new int[n] ;

		// First pass: accumulate non-zero elements
		for(int i=0; i<n; i++)
		{
			if(nums[i]!=0)
			{
				result[j] = nums[i];
				j++;

			}
		}
		 // Second pass: fill remaining positions with zeroes
		for(;j<n; j++)
		{
			result[j] = 0;
		}

		 // Copy back to original array
	    System.arraycopy(result, 0, nums, 0, n);
	}




public static void main(String[] args) {
	int[] nums = {0,1,0,3,12} ;
	moveZeros(nums);
	   // Print the result
    System.out.print("Modified array: ");
    for (int num : nums) {
        System.out.print(num + " ");
    }

}
}

//Time Complexity: O(n), where n is the length of the array.
//Space Complexity: O(n), due to the use of additional array.





