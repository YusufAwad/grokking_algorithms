import java.util.*;
import java.lang.*;
import java.io.*;


class grokkingAlgorithms
{	

	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {5, 3, 6, 2, 10};
		int n = arr.length; 
		
		for (int i = 0; i < n-1; ++i) { 
		
			int min_idx = i; 
			for (int j = i+1; j < n; j++) 
				if (arr[j] < arr[min_idx]) 
					min_idx = j; 
					
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		}
		
	
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i]+" "); 
	}
}