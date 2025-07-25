package problems;

public class RemoveDuplicateSortedArrayUsingTwoPointers {


	    public static int removeDuplicates(int[] nums) {
	        // Check if the array is empty. If it is, return 0 as there are no elements to process.
	        if (nums.length == 0) {
				return 0;
			}

	        // Initialize i to point to the index where we should place the next unique element.
	        int i = 0;

	        // Iterate through the array starting from the first element.
	        for (int j = 1; j < nums.length; j++) {
	            // Check if the current element nums[j] is different from nums[i].
	            // If so, it indicates a new unique element.
	            if (nums[j] != nums[i]) {
	                // Increment i to reserve the next position for the new unique element.
	                i++;
	                // Place the new unique element found at nums[j] into the position at nums[i].
	                nums[i] = nums[j];
	            }
	        }
	        // Return the length of the array containing unique elements,
	        // this is i + 1 because i is the index of the last unique element found.
	        return i + 1;
	    }



	    public static void main(String[] args) {
	    	int[] nums = {0,0,1,1,1,2,2,3,3,4} ;
	    	int number = removeDuplicates(nums);
	    	   // Print the result
	        System.out.print("Maximum non duplicate: "+number);

	        System.out.print("Array after duplicates removed:");
		    for (int num : nums) {
		    System.out.print(num + "");
		    }
	}
}

