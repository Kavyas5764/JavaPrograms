package demo;

public class Areas {
	void area(int side)
	{
		System.out.println("The area of the square is "+(side *side)+" sq units");
	}
	
	void area(int l,int b)
	{
		System.out.println("The area of the rectangle is "+(l*b)+" sq units");
	}
	
	void area(float radius) 
	{
		System.out.println("The area of the circle is "+(3.14*radius*radius)+" sq units");
	}

	public static void main(String args[])
	{
		Areas a = new Areas();
		 a.area(22.5f);
         a.area(2);
         a.area(3,9);
		
		
	}
}
