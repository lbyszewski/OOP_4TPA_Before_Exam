// 4TPA.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include "Encapsulation.h"

using namespace std;



double silnia(double n) {
	if (n == 0) {
		return 1;
	}
	else {
		return n * silnia(n - 1);
	}
}




int main()
{
	Encapsulation  en("ABC","DEF");
	cout<<en.getFirstName();

	cout << silnia(5) << endl;


}