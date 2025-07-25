package HashMapAllproblems;
import java.util.*;
import java.io.*;

public class CountCharactersInString 
{
	
	    //write a program for Characteroccurences

	    public static void CountCharacter(String str)
	    {

    Map <Character, Integer> CountCharacters = new HashMap<>();

    for (char ch: str.toCharArray())
    {
        if (Character.isLetter(ch))
        {

            ch = Character.toLowerCase(ch);
            CountCharacters.put(ch, CountCharacters.getOrDefault(ch, 0) + 1);
        }
    }


    //print charcter and occurences 
    for (Map.Entry < Character, Integer > entry: CountCharacters.entrySet())
    {
        System.out.println("'" + entry.getKey() + "':" + entry.getValue());
    }
}




public static void main(String[] args) throws java.lang.Exception
{
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string");
    String Input = scanner.nextLine();

    CountCharacter(Input);
    scanner.close();

}
}