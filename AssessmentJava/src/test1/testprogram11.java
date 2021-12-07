//Program to Count occurrences of Character in String in Java
package test1;

public class testprogram11 {
	
	public static int count(String s,char ch) {
		int res=0;
		//checking character in a string
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ch)
				res++;
		}
		return res;
	}

	public static void main(String[] args) {
		String str = "WelcomeHelloAwesome";
		char c = 'o';
		System.out.println(count(str,c));

	}

}
