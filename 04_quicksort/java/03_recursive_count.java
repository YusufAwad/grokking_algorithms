import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

class grokkingAlgorithms
{	

	public static int count(ArrayList<Integer> arr){
		if(arr.size() == 0){
			return 0;
		}

		arr.remove(0);
		return 1 + count(arr);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.print(count(arr)); 
	}
}