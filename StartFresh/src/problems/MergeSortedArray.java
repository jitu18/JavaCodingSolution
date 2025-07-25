package problems;

import java.util.Arrays;

public class MergeSortedArray {

	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
         // Copy nums2 to nums1 from index m to m+n
        for (int i = 0; i<n; i++) {
            nums1[m + i] = nums2[i];
        }
        // Sort nums1
        Arrays.sort(nums1);
        for (int k=0; k< nums1.length; k++)
        {
        	System.out.println(nums1[k]);
        }
        
    }

	 public static void main(String[] args)
	 {
		 int[] nums1 = {1,2,3,0,0,0};

		 int[] nums2 = {2,5,6};


         int n = nums2.length ;

		 merge(nums1,3,nums2,n);
		 


	 }
}




