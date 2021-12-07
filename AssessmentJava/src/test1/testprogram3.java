//Program to calculate the power of the number:
package test1;
import java.util.Scanner;

public class testprogram3 {

	public static void main(String[] args) {
		int base, exponent,expo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base:");
		base = sc.nextInt();
		System.out.println("Enter the exponent:");
		exponent = sc.nextInt();
		expo = exponent;
		long power = 1;//executes until the condition becomes fail.
		while(exponent!= 0) {
			power = power*base;
			--exponent;//decrements the power by 1
			
		}
		System.out.println(base+ "to the power" +expo+ "is:" +power);

	}

}
