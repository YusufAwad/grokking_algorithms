import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

class grokkingAlgorithms
{	

	public static int summ(ArrayList<Integer> arr){
		if(arr.size() == 0){
			return 0;
		}
//		ArrayList<Integer> newArr = arr.remove(0);
		int temp = arr.get(0);
		arr.remove(0);
		return temp + summ(arr);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.print(summ(arr)); 
	}
}