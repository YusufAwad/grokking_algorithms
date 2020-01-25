#include <iostream>
#include <map>
using namespace std;

int main(int argc, char *argv[]) {
	map<string, float> book;
	book["apple"] = 0.67;
	book["milk"] = 1.49;
	book["avocado"] = 1.49;
	
	for(auto elem : book)
	{
		std::cout << elem.first << " " << elem.second << "\n";
	}
}