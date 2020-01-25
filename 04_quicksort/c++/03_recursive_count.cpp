#include <iostream>
#include <vector>
using namespace std;

int count(vector<int> arr){
	if (!arr.size())
		return 0;
	else{
		arr.erase(arr.begin(), arr.begin()+1);
		return 1 + sum(arr);
	}
}
int main(int argc, char *argv[]) {
	vector<int> arr{1, 2, 3, 4};
	cout << count(arr) << endl;
}