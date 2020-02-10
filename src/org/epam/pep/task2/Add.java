package org.epam.pep.task2;

class Add extends Operations{

	Add(long longNumOne, long longNumTwo) {
		super(longNumOne, longNumTwo);
	}
	
	Add(double doubleNumOne, double doubleNumTwo) {
		super(doubleNumOne, doubleNumTwo);
	}
	
	long resultLong() {
		return this.longNumOne + this.longNumTwo;
	}
	
	double resultDouble() {
		return this.doubleNumOne + this.doubleNumTwo;
	}
	
}