//Program to Swap two no's
package test1;
import java.util.Scanner;

public class testprogram6 {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X and Y");
		x= sc.nextInt();
		y= sc.nextInt();
		System.out.println("before swapping the numbers:" +x+" "+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("before swapping the numbers:" +x+" "+y);
		System.out.println();
		

	}

}
