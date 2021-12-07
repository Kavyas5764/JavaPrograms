//Program to count the number of the vowels in the string:
package test1;

public class testprogram4 {

	public static void main(String[] args) {
		String str = "WelcometoWebsite";
		str = str.toLowerCase();
		
		char[] chars = str.toCharArray();
		
		int count = 0;
		
		for(int i=0;i<str.length(); i++) {
			if(str.charAt(i) == 'a'  || str.charAt(i) == 'e'
					|| str.charAt(i) == 'i'
					|| str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println("Total number of vowels in a string are: " +count);

	}

}
