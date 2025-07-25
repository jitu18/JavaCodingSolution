package problems;

public class ReverseStringUsingStringBuilderClass {

	public static String ReverseString(String input) {

		String reversed = new  StringBuilder(input).reverse().toString();

		return reversed ;


	}




	  public static void main(String[] args) {
	        String input = "a b c d";
	        String output = ReverseString(input);
	        System.out.println("Original: \"" + input + "\"");
	        System.out.println("Reversed: \"" + output + "\"");
	    }

}
