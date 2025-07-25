package problems;

public class MoveZerosSwapEasySolution {

	public static void moveZeroes(int[] nums) {
	    int lastZeroPosition = 0; // This marks the last zero swap position

	    // Loop through the array
	    for (int current = 0; current < nums.length; current++) {
	        if (nums[current] != 0) {
	            // Perform the swap
	            int temp = nums[lastZeroPosition];
	            nums[lastZeroPosition] = nums[current];
	            nums[current] = temp;
	            lastZeroPosition++;
	        }
	    }
	}
	public static void main(String[] args) {
		int[] nums = {1,0,0,3,12} ;
		moveZeroes(nums);
		   // Print the result
	    System.out.print("Modified array: ");
	    for (int num : nums) {
	        System.out.print(num + " ");
	    }

	}

}
