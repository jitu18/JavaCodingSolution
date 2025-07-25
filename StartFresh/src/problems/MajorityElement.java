package problems;

import java.util.HashMap;

public class MajorityElement {
public static  int majorityElement(int[] nums) {

	int n = nums.length ;
	HashMap<Integer,Integer> result = new HashMap<>();

	for(int i : nums)
	{
	result.put(i,result.getOrDefault(i, 0)+1);

	if (result.get(i)>n/2)
	{
        return i ;
    }

    }
	return -1 ; // Shouldn't reach here if input is valid


}

public static void main(String[] args) {
	int[] nums = {2,2,1,1,1,2,2} ;
	int number = majorityElement(nums);
	   // Print the result
    System.out.print("Majority element: "+number);


}
}
