public class inheritancetask {
	  public static void main(String aa[])
	    {
	             B b=new B();
	        b.display();

	        b.details();

	        C c=new C();
	        c.show();
	        c.display();
	}    
} 
	class A   //Parent class or Super class
	{
	    int a=20;
	 
	void display()
	{
	System.out.print("PARENT DISPLAY ");
	}
	 

	}
	 
	class B   extends A    //child or subclass
	{
	    int a=89;
	 void details()
	{
	    System.out.print(super.a);
	}
	 
	}
	class C extends A
	{
	    void show()
	    {
	        System.out.print("C SHOW METHOD ");
	    }
	}

