package demo;

public class Programs {

	public static void main(String[] args) {
		//calculate simple interest(p,r,t)
		float p,r,t,si;
		p=20000;
		r=12;
		t=2;
		si=(p*r*t)/100;
		System.out.println("The Simple Interest is:" +si);
		
		//calculate average of 5 no
		int num1=10,num2=20,num3=30,num4=40,num5=50;
		System.out.println("Average of 5 numbers are:" +(num1 + num2 + num3 + num4 + num5)/5);
		
		//find area of rectangle (length,breadth)
		int l=5,b=6,area_rectangle;
		area_rectangle= l * b;
		System.out.println("The Area of the Rectangle is:" +area_rectangle);
		
		//find area of circle
		int radius=44;
		double area_circle;
		area_circle = (radius*radius)*Math.PI;
		System.out.println("The Area of the Circle is:" +area_circle);
		
		
		//find area of square
		int s=15, area_square=s*s;
		System.out.println("The Area of the Square is:" +area_square);
		
		//1.check the no is even or odd
		int num = 12;
		if(num%2 == 0)
			System.out.println(num + "is even");
		else
			System.out.println(num + "is odd");
		
		//2. check the no is +ve or -ve
		int number = 912;
		if(number>0)
		{
			System.out.println("The number is positive");
		}
		else if(number<0)
		{
			System.out.println("The number is negative");
			
		}
		else
		{
			System.out.println("The number is zero");
		}
		
		//3.check the greatest of 3 nos
		int number1= 40,number2= 78,number3 = 19;
		if(number1>=number2 && number2>=number3) 
		{
			System.out.println(number1+ "is the largest number");
		}
		else if(number2>=number3 && number2>=number3) 
		{
			System.out.println(number2+ "is the largest number");
		}
		else
		{
			System.out.println(number3+ "is the largest number");
		}
		
		//4.check the grade of a student(a,b,c)
		int avg = 59;
		char grade;
		
		if(avg>=80) {
			grade = 'A';
		}
		else if(avg>=60 && avg<80) {
			grade = 'B';
		}
		else if(avg>=40 && avg<60) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		System.out.println("Your Grade is" +grade);
		
		//5.To check the greatest of 4 numbers
		int n1= 60,n2= 120,n3 = 16, n4 = 57;
		if(n1>=n2 && n2>=n3) 
		{
			System.out.println(n1+ "is the largest number");
		}
		else if(n2>=n3 && n2>=n3) 
		{
			System.out.println(n2+ "is the largest number");
		}
		else if(n3>=n4 && n3>=n4) 
		{
			System.out.println(n3+ "is the largest number");
		}
		else 
		{
			System.out.println(n4+ "is the largest number");
		}
		
		
		//6.generate bills of calls, take no of calls as input(300)
		int calls=200;
	    if (calls <= 100)
	    {
	        System.out.println("Bill : Rs.0");
	    }
	    else if (calls > 100 && calls <= 200)
	    {
	        calls = calls - 100;
	        System.out.println(calls);
	    }
	    else if (calls > 200 && calls <= 300)
	    {
	        calls = (calls - 200)*2+100;
	        System.out.println(calls);
	    }
	    else
	    {
	        calls = (calls - 300)*3+300;
	        System.out.println(calls);
	    }


			
		
		//find the factorial of a number
		int i, fact=1;
		int no = 5;
		for(i=1;i<=no;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of the number" +no+" is:"+fact);
		
		//find sum of list 100 even no's
		int sumofeven = 0;
		for(int j =10;j<=100;j=j+2) {
			sumofeven = sumofeven + j;	
		}
		System.out.println(sumofeven);
		
		
		//find the sum of 50 odd no's
		int numb= 20,q,oddSum = 0;
		for(q=1;q<=50;q++) {
			if(q%2!=0) {
				oddSum = oddSum + i;
			}
			System.out.println("\n The Sum of Odd Numbers  upto "+numb+" = "+oddSum);
			
		}
		 
		//find the sum of no divisble by 3 and 9 from 1-1000
//		int sum1= 0;
//		for (int n=1;n<=1000;n++) {
//			if(n%3 == 0)
//				sum1 += n;		
//			
//		}
		
		//to find the number is prime or no
		int d,c=0,flag=0;
		int g=3;
		c = g/2;
		if(g==0||g==1) {
			System.out.println(g+ "is not a prime number");
		}else {
			for(d=2;d<=c;d++) {
				if(g%d==0) {
					System.out.println(g+ "is not a prime number");
					flag =1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(g+ "is a prime number");
			}
		}
		
		
		//print the fibonacci series
		int count=20, r1=0,r2=1,r3,h;
		System.out.println(r1+"" +r2);
		for(h=2;h<count;++h) {
			r3 = r1 + r2;
			System.out.println("" +r3);
			r1=r2;
			r2=r3;
		}
		
		//to print the pattern
		for(int u=1;u<=5;u++)
        {
            for(int v=1;v<=u;v++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
		
		
		
	}

}
