#include <iostream>

using namespace std;

int fact(int num){
	if(num == 1){
		return num;
	}
	else{
		return num * fact(num-1);
	}
}

int main(int argc, char *argv[]) {
	cout << fact(5) << endl; 	
}