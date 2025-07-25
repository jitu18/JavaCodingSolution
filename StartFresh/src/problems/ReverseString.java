package problems;

public class ReverseString {

	 public static String reverseStringKeepingSpaces(String input) {
	        char[] inputArray = input.toCharArray();
	        char[] result = new char[inputArray.length];

	        // Fill the characters in reverse, skipping spaces
	        int j = inputArray.length - 1;
	        for (int i = 0; i < inputArray.length; i++) {

	        	result[i] = inputArray[j];
	        	j-- ;
	        }

	        return new String(result);
	 }


	  public static void main(String[] args) {
	        String input = "My name is duble";
	        String output = reverseStringKeepingSpaces(input);
	        System.out.println("Original: \"" + input + "\"");
	        System.out.println("Reversed: \"" + output + "\"");
	    }

}
