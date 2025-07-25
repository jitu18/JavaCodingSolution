package TwoPointers;

public class IsSubsequence {
	
	public static boolean IsSubsequence(String s,String t)
	
	{
		int i=0,j=0;
		
		//
		
		while(i<s.length() && j<t.length())
			
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++ ;
			}
			
			j++;
		}
		
		return i ==s.length();
	}
	
	
	
	
	
	public static void main(String args[])
	{
		String s = "abc";
		String t = "ahbgdc";
		Boolean subsequence = IsSubsequence(s,t);
		System.out.print(subsequence);
		
	}

}
