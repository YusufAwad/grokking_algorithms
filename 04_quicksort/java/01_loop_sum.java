import java.util.*;
import java.lang.*;
import java.io.*;


class grokkingAlgorithms
{	
	public static int sum(int[] arr){
		int total = 0;
		for (int i = 0; i < arr.length; ++i){
			total += arr[i];
		}
		return total;
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {1, 2, 3, 4};
		System.out.print(sum(arr)); 
	}
}