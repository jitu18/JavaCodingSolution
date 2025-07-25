package problems;

public class ReverseSort {
	public static int[] ReverseArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap if next is greater (for descending)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 23, 8, 7, 1};
        int[] reverse = ReverseArray(arr);
        for (int i = 0; i < reverse.length; i++) {
            System.out.println(reverse[i]);
        }
    }
}

	
	


