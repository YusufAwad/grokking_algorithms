import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

class grokkingAlgorithms
{	
	public static int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high];  
		int i = (low-1);
		for (int j=low; j<high; j++) 
		{ 
			if (arr[j] < pivot) 
			{ 
				i++; 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		}
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 	
		return i+1; 
	} 
	
	public static void QuickSort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			int pi = partition(arr, low, high); 
			QuickSort(arr, low, pi-1); 
			QuickSort(arr, pi+1, high); 
		} 
	}
	
	public static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {10, 5, 2, 3}; 
		int n = arr.length; 
		QuickSort(arr, 0, n-1); 
		printArray(arr); 
	}
}