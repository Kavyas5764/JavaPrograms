//Program to Print ascii value of character from A-Z
package test1;

public class testprogram5 {

	public static void main(String[] args) {
		char CapitalChar ='A';
		
		System.out.println("ASCII Value from'A' to 'Z'");
		for(int i = 'A'; i<='Z'; i++) {
			System.out.println(CapitalChar+":"+i);
			CapitalChar++;
		}
				

	}

}
