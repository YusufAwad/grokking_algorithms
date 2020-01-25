#include <iostream>
#include <vector>
using namespace std;

int sum(vector<int> arr){
	if (!arr.size())
		return 0;
	else{
		int temp = arr[0];
		arr.erase(arr.begin(), arr.begin()+1);
		return temp + sum(arr);
	}
}
int main(int argc, char *argv[]) {
	vector<int> arr{1, 2, 3, 4};
	cout << sum(arr) << endl;
}