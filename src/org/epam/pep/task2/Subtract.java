package org.epam.pep.task2;

class Subtract extends Operations{

	Subtract(long longNumOne, long longNumTwo) {
		super(longNumOne, longNumTwo);
	}
	
	Subtract(double doubleNumOne, double doubleNumTwo) {
		super(doubleNumOne, doubleNumTwo);
	}
	
	long resultLong() {
		return this.longNumOne - this.longNumTwo;
	}
	
	double resultDouble() {
		return this.doubleNumOne - this.doubleNumTwo;
	}
	
}