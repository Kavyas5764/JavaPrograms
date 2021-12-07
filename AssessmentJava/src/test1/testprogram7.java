//Program to implement factorial of a number using recursion
package test1;

public class testprogram7 {
	
	static int factorial(int n) {
		if(n == 0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		int i,fact=1;
		int number=5;
		fact = factorial(number);
		System.out.println("Factorial of" +number+ "is:" +fact);
		

	}

}
