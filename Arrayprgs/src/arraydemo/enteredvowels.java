//to find the vowels in the entered string
package arraydemo;
import java.util.Scanner;

public class enteredvowels {

	public static void main(String[] args) {
		String str = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		str = sc.nextLine();
		str = str.toLowerCase();
		
		//to print all vowels
		System.out.println("Vowels in the given string are:");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				//to display each vowel
				System.out.println(" " +str.charAt(i));
			}
		}

	}

}
