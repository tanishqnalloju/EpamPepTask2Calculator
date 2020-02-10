package org.epam.pep.task2;

class Divide extends Operations{

	Divide(long longNumOne, long longNumTwo) {
		super(longNumOne, longNumTwo);
	}
	
	Divide(double doubleNumOne, double doubleNumTwo) {
		super(doubleNumOne, doubleNumTwo);
	}
	
	long resultLong() {
		return this.longNumOne / this.longNumTwo;
	}
	
	double resultDouble() {
		return this.doubleNumOne / this.doubleNumTwo;
	}
}