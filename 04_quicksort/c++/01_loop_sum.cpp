#include <iostream>

using namespace std;

int sum(int (&arr)[4]){
	int total = 0;
	for (int i = 0; i < (sizeof(arr)/sizeof(*arr)) ; ++i){
		total += arr[i];
	}
	return total;
}

int main(int argc, char *argv[]) {
	int arr[] = {1, 2, 3, 4};
	cout << sum(arr) << endl;	
}