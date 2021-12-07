//Program to reverse the string Hello
package test1;

public class testprogram1 {

	public static void main(String[] args) {
		String str = "Hello",nstr = "";
		char ch;
		
		System.out.println("Original Word:");
		System.out.println("Hello");
		
		for (int i=0;i<str.length();i++) {
			ch= str.charAt(i);//extracts each character
			nstr = ch + nstr;//adds each character in front of the existing string.
		}
		System.out.println("Reversed Word is:" +nstr);
	}

}
