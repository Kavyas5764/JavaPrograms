package demo;

public class methodsprgs {
	
	
	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
		
	}
	
	static int getSum(int n) {
		int sum = 0;
		while(n!=0) {
			sum = sum+n%10;
			n=n/10;
		}
		return sum;
	}
	
	
	

	public static void main(String[] args) {
		int fact=1;
		int number =5;
		fact = factorial(number);
		System.out.println("Factorial of" +number+ "is:"+fact);
		
		int n = 785;
		System.out.println(getSum(n));
	

	}

}
