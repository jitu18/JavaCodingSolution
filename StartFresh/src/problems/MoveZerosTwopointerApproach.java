package problems;

public class MoveZerosTwopointerApproach {

	public static void moveZeroes(int[] nums) {
	    int insertPos = 0; // Points to the index where the next non-zero should be placed

	    // Iterate through the array
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != 0) {
	            // Swap only if necessary, insertPos can be equal to i
	            nums[insertPos] = nums[i];
	            insertPos++;
	        }
	    }

	    // Fill the rest of the array with zeroes
	    while (insertPos < nums.length) {
	        nums[insertPos] = 0;
	        insertPos++;
	    }
	}

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12} ;
		moveZeroes(nums);
		   // Print the result
	    System.out.print("Modified array: ");
	    for (int num : nums) {
	        System.out.print(num + " ");
	    }

	}

}
