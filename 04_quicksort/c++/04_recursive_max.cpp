#include <iostream>
#include <vector>
using namespace std;

int maxx(vector<int> arr){
	if (arr.size() == 2)
		return arr[0] > arr[1] ? arr[0] : arr[1];
	else{
		int temp = arr[0];
		arr.erase(arr.begin(), arr.begin()+1);
		int submax = maxx(arr);
		return temp > submax ? temp : submax;
	}
}
int main(int argc, char *argv[]) {
	vector<int> arr{1, 2, 3, 4};
	cout << maxx(arr) << endl;
}