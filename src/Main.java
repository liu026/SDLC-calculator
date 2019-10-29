import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int number1;
		int number2;
		String operator; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();			
		System.out.print("Enter your operation (+, -, *, /, %): ");
        operator = input.next();
		
        if(operator.equals("+"))
        {
        	System.out.print(Calculator.add(number1, number2));
    	}
        else if(operator.equals("-"))
        {
        	System.out.print(Calculator.subtract(number1, number2));
    	}
        else if(operator.equals("*"))
        {
        	System.out.print(Calculator.multiply(number1, number2));
    	}
        else if(operator.equals("/"))
        {
        	
        	try{
        		System.out.print(Calculator.divide(number1, number2));
        	}
        	catch(ArithmeticException e)
            {
                System.out.println("No division by zero");
            }
        }
	}
}