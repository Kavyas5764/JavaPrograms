package demo;

public class Taskprgs {

	public static void main(String[] args) {
		//table of  a number using while(do while)
		int i=1,number=5;
		do {
			System.out.println("The table number is"  +(number*i));
			i++;
		}
		while(i<=10);
		
		
		//factorial of a number using while(do while):
		int fact=1,j=1,num=5;
		do {
			fact = fact *j;
			j++;
		}
		while(j<=num);
		System.out.println("\n Factorial of number is:" +num+ "is:" + fact);
		
		
		//fibonacci series if 20 numbers:
		int count= 20,n1=0,n2=1;
		System.out.println("Fibonacci Series are: "+count+" numbers:");
		for(int k=1;k<=count;++k) {
			System.out.println(n1+ "");
			int sumOfPrevTwo = n1 + n2;
			n1 = n2;
			n2 = sumOfPrevTwo;
		}
		
		
		
		//sum of 100 even no's using while and do while:
		int nu=100,l=2;
		while(l<=nu) {
			System.out.println(l+"");
			l = l+2;	
		}
	}

}
