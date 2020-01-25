import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

class grokkingAlgorithms
{	

	public static int maxx(ArrayList<Integer> arr){
		if(arr.size() == 2){
			return arr.get(0) > arr.get(1) ? arr.get(0) : arr.get(1);
		}
		int temp = arr.get(0);
		arr.remove(0);
		int result = maxx(arr);
		return temp > result ? temp : result;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.print(maxx(arr)); 
	}
}