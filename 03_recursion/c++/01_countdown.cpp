#include <iostream>

using namespace std;

int countdown(int num){
	if(num > 0)
		cout << num << endl;
	if (num <= 0)
		return num;
	else 
		return countdown(num-1);
}

int main(int argc, char *argv[]) {
	cout << countdown(5) << endl;
}