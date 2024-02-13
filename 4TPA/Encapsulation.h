#pragma once

#include <string>
#include <iostream>




using namespace std;

class Encapsulation
{
private:
	string firstName;
	string lastName;

public:
	Encapsulation(){}

	Encapsulation(string fN, string lN) {
		this->firstName = fN;
		this->lastName = lN;
	}


	void setFirstName(string fN) {
		this->firstName = fN;
	}

	string getFirstName() {
		return this->firstName;
	}

	double silnia(double n) {
		if (n == 0) {
			return 1;
		}
		else {
			return n * silnia(n - 1);
		}
	}


};

