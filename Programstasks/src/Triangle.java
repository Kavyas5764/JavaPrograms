import java.util.Scanner;
import java.lang.Math;

public class Triangle {
	int l,b,h;
	Triangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of triangle");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		int p=l+b+h;
		int s2=p/2;
		double sq =(s2*(s2-l)*(s2-b)*(s2-h));
		double area=Math.sqrt(sq);
		System.out.println("Area is: "+area+" Perimeter is: "+p);
		sc.close();

	}
}
