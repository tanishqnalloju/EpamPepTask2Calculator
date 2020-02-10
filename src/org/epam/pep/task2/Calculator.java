package org.epam.pep.task2;

import java.util.*;

public class Calculator{
	public static void main(String[] args) {
		
		Calculate calc = new Calculate();
		
		long longNumOne = 458;
		long longNumTwo = 698;
		
		double doubleNumOne = 986.345;
		double doubleNumTwo = 365.98;
		
		System.out.println((long)calc.calculate(longNumOne, longNumTwo, "+"));
		System.out.println((long)calc.calculate(longNumOne, longNumTwo, "-"));
		System.out.println((long)calc.calculate(longNumOne, longNumTwo, "*"));
		System.out.println((long)calc.calculate(longNumOne, longNumTwo, "/"));
		
		System.out.println((double)calc.calculate(doubleNumOne, doubleNumTwo, "+"));
		System.out.println((double)calc.calculate(doubleNumOne, doubleNumTwo, "-"));
		System.out.println((double)calc.calculate(doubleNumOne, doubleNumTwo, "*"));
		System.out.println((double)calc.calculate(doubleNumOne, doubleNumTwo, "/"));
		
		
	}
}