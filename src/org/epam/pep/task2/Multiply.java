package org.epam.pep.task2;

class Multiply extends Operations{

	Multiply(long longNumOne, long longNumTwo) {
		super(longNumOne, longNumTwo);
	}
	
	Multiply(double doubleNumOne, double doubleNumTwo) {
		super(doubleNumOne, doubleNumTwo);
	}
	
	long resultLong() {
		return this.longNumOne * this.longNumTwo;
	}
	
	double resultDouble() {
		return this.doubleNumOne * this.doubleNumTwo;
	}
	
	
}