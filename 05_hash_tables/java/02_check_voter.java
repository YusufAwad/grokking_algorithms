import java.util.*;
import java.lang.*;
import java.io.*;


class grokkingAlgorithms
{	
    public static HashMap<String, Boolean> voted = new HashMap<String, Boolean>();

    public static void check_voter(String name){
        if (voted.containsKey(name)){
            System.out.println("kick them out!");
        } else {
            voted.put(name, true);
            System.out.println("let them vote!");
        }
    }

	public static void main (String[] args) throws java.lang.Exception
	{
        check_voter("tom");
        check_voter("mike");
        check_voter("mike");
	}
}