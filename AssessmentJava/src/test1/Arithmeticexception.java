package test1;

public class Arithmeticexception {

	public static void main(String[] args) {
		try {
		int num1=30,num2=0;
		int result = num1/num2;
		System.out.println("Result is:"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");
		}

	}

}
