package org.epam.pep.task2;

class Calculate{
	
	Calculate(){
		
	}
	
	
	
	public Object calculate(Object operandOne, Object operandTwo, String operator) {
		
		Operations operation;
		String dataType = operandOne.getClass().getSimpleName();
		
		switch(operator) {
		case "+":
			if(dataType.equals("Long")) {
				Add add = new Add((long) operandOne, (long) operandTwo);
				return add.resultLong();
			}
			else {
				Add add = new Add((double) operandOne, (double) operandTwo);
				return add.resultDouble();
			}
			//break;
		
		case "-":
			if(dataType.equals("Long")) {
				Subtract sub = new Subtract((long) operandOne, (long) operandTwo);
				return sub.resultLong();
			}
			else {
				Subtract sub = new Subtract((double) operandOne, (double) operandTwo);
				return sub.resultDouble();
			}
			//break;
			
		case "*":
			if(dataType.equals("Long")) {
				Multiply mul = new Multiply((long) operandOne, (long) operandTwo);
				return mul.resultLong();
			}
			else {
				Multiply mul = new Multiply((double) operandOne, (double) operandTwo);
				return mul.resultDouble();
			}
			
			//break;
			
		case "/":
			if(dataType.equals("Long")) {
				Divide div = new Divide((long) operandOne, (long) operandTwo);
				return div.resultLong();
			}
			else {
				Divide div = new Divide((double) operandOne, (double) operandTwo);
				return div.resultDouble();
			}
			//break;
			
		default:
			return -1;			
			
		}
	}
	
}