#include <iostream> 
#include <vector>
using namespace std;

// Finds the smallest value in an array
int findSmallest(vector<int> arr){
	// Stores the smallest value
	int smallest = arr[0];
	// Stores the index of the smallest value
	int smallest_index = 0;
	for(int i = 0; i < arr.size(); ++i){
		if(arr[i] < smallest){
			smallest = arr[i];
			smallest_index = i;
		}
	}
	return smallest_index;
}

// Sort array
vector<int> selectionSort(vector<int> arr){
	vector<int> newArr;
	int len = arr.size();
	for(int i = 0; i < len; ++i){
		// Finds the smallest element in the array and adds it to the new array
		int smallest = findSmallest(arr);
		newArr.push_back(arr[smallest]);
		swap(arr[0], arr[smallest]);
		arr.erase(arr.begin(), arr.begin()+1);
	}
	return newArr;
}

int main(int argc, char *argv[]) {
	vector<int> arr{5, 3, 6, 2, 10};
	
	vector<int> sortedArr = selectionSort(arr);
	for(int i = 0; i < sortedArr.size(); ++i)
		cout << sortedArr[i] << " "; 
}