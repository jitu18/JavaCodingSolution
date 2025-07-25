package TwoPointers;

public class IsPalindrome {
	
	public static boolean CheckPalindrome(String s)
	{
		int left = 0;
		int right = s.length()-1;
		
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right))	;
			
			return false ;
		}
		
		return true;
	}
	
	public static void main(String args[])
	{
		String s ="race a car";
		boolean palindrome = CheckPalindrome(s);
		System.out.print(palindrome);
	}

}
