#include <iostream>
#include <stdio.h>
using namespace std;

int binary_search(int (&list)[5], int item, bool& isFound){
    // low and high keep track of which part of the array you'll search in.
    int low = 0;
    int high = (sizeof(list)/sizeof(*list));
    
    // While you haven't narrowed it down to one element ...
    while(low <= high){
        // ... check the middle element
        int mid = low + ((high - low) / 2);
        int guess = list[mid];
        // Found the item.
        if (guess == item){
            isFound =  true;
            return mid;
        // The guess was too high.
        } else if (guess > item) {
            high = mid - 1;
        } else { // The guess was too low.
            low = mid + 1;
        }
    }
    return 0;
}

int main() {
	// your code goes here
    bool isFound = false;
    int arr[] = {1, 3, 5, 7, 9};
    int ans = binary_search(arr, 3, isFound);
    if(isFound){
        printf ("%d\n", ans);
    } else { // We use "None" to indicate that the item wasn't found.
        printf ("None");
    }
	return 0;
}