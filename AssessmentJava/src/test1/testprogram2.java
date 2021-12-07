//Program to draw the pattern
package test1;

public class testprogram2 {

	public static void main(String[] args) {
		int row=7;
		for(int i=0; i<7; i++)
		{
		for(int j=0; j<i; j++)
		{
		System.out.print(" ");
		}
		for(int k=row-i; k>=i+1; k=k-1)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	}
}
