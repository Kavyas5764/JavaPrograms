package demo;
import java.util.Scanner;

public class Calculatorprgs {

	public static void main(String[] args) {
		
		char operator,choice;
		int num1,num2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Calculator----");
		
		System.out.println("Select your operation:\n 1. Addition \n2.Subtraction \n3.Multiplication \n4. Division \n1/2/3/4 ");
		operator = sc.next().charAt(0);
		
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		System.out.println("Enter Second number:");
		num2 = sc.nextInt();
		
		switch(operator) {
		case '1':
			result = num1 + num2;
			System.out.println(num1 + "+" +num2+ "=" +result);
			break;
			
		case '2':
			result = num1 - num2;
			System.out.println(num1 + "-" +num2+ "=" +result);
			break;
			
		case '3':
			result = num1 * num2;
			System.out.println(num1 + "*" +num2+ "=" +result);
			break;
			
		case '4':
			result = num1 / num2;
			System.out.println(num1 + "/" +num2+ "=" +result);
			break;
	
			
		default:
			System.out.println("Invalid operator!!");
			break;		
		}
	     System.out.print("Do you want to continue?(y/n)");
	        choice=sc.next().charAt(0);
	        while(choice=='y' || choice=='Y');
	        System.out.print("Thankyou!!!");
	}

}
