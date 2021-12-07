package demo;
import java.util.Scanner;

public class usingscannerprgs {

	public static void main(String[] args) {
		
		int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("The sum of 2 numbers are:" +num1+ "+" +num2);

	}

}
