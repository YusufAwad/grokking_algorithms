#include <iostream>
#include <map>
using namespace std;

map<string, bool> voted;

void check_voter(string name){
    if ( voted.find(name) == voted.end() ) {
        voted[name] = true;
        cout << "let them vote!" << endl;
    } else {
        cout << "kick them out!" << endl;
    }
}

int main(int argc, char *argv[]) {
	
    check_voter("tom");
    check_voter("mike");
    check_voter("mike");

    
}