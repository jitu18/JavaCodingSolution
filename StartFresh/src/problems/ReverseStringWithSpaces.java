package problems;


	public class ReverseStringWithSpaces {

	    public static String reverseStringKeepingSpaces(String input) {
	        char[] inputArray = input.toCharArray();
	        char[] result = new char[inputArray.length];

	        // Mark the spaces in the result array
	        for (int i = 0; i < inputArray.length; i++) {
	            if (inputArray[i] == ' ') {
	                result[i] = ' ';
	            }
	        }

	        // Fill the characters in reverse, skipping spaces
	        int j = inputArray.length - 1;
	        for (char element : inputArray) {
	            if (element != ' ') {
	                while (result[j] == ' ') {
	                    j--;
	                }
	                result[j] = element;
	                j--;
	            }
	        }

	        return new String(result);
	    }

	    public static void main(String[] args) {
	        String input = "My name is jitender";
	        String output = reverseStringKeepingSpaces(input);
	        System.out.println("Original: \"" + input + "\"");
	        System.out.println("Reversed: \"" + output + "\"");
	    }
	}



