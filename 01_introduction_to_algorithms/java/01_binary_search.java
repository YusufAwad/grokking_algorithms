/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class grokkingAlgorithms
{
    public static boolean isFound = false; 

    public static int binary_search(int[] arr, int item){
        // low and high keep track of which part of the list you'll search in.
        int low = 0;
        int high = arr.length;

        // While you haven't narrowed it down to one element ...
        while(low <= high){
            // ... check the middle element
            int mid = low + ((high - low) / 2);
            int guess = arr[mid];
            // Found the item.
            if (guess == item){
                isFound = true;
                return mid;
            } else if (guess > item) { // The guess was too high.
                high = mid - 1;
            } else { // The guess was too low.
                low = mid + 1;
            }
        }
        // Item doesn't exist
        return 0;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int arr[] = {1, 3, 5, 7, 9};
        int ans = binary_search(arr, 3);
        
        if(isFound == true){
            System.out.println(ans);
        } else { // We use "None" to indicate that the item wasn't found.
            System.out.println("None");
        }
	}
}