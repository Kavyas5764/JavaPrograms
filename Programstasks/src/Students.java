import java.util.Scanner;
public class Students {
	Scanner sc = new Scanner(System.in);
	int studentID;
	String studentName,phone;
	
	void readDetails()
	{
		System.out.println("Enter id:");
		studentID = sc.nextInt();
		System.out.println("Enter Student Name:");
		studentName = sc.next();
		System.out.println("Enter Student phone number:");
		phone = sc.next();
		
	}
	
	void displayDetails()
	{
		System.out.println("ID:" +studentID);
		System.out.println("Name:" +studentName);
		System.out.println("phone:" +phone);
	
	}
	

}

class Marks extends Students
{
	int m1,m2,m3;
	
	  void readMarks()
	    {
	        System.out.println("marks of Maths");
	        m1=sc.nextInt();
	        System.out.println("marks of English");
	        m2=sc.nextInt();
	        System.out.println("marks of Hindi");
	        m3=sc.nextInt();
	    }

	    void displayMarks()
	    {
	        System.out.println("Marks ---\nMaths:"+m1);
	        System.out.println("English:"+m2);
	        System.out.println("hindi:"+m3);

	    }
	    public static void main(String aa[])
	    {
	         Marks m=new Marks();
	         m.readDetails();
	         m.readMarks();
	         m.displayDetails();
	         m.displayMarks();
	}    
}
