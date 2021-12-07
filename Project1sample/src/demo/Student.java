package demo;

public class Student {
	String name, rollno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public static void main(String args[]) {
		Employee e = new Employee("12","kajal");
		System.out.println(e.getDetails());
		Student s1 = new Student();
		s1.setName("Kavya S");
		s1.setRollno("24");
		
		System.out.println(s1.getName()+""+s1.getRollno());
	}

}

class Employee
{
	String id, empName;
	//using constructor
	Employee(String y, String sal){
		id = y;
		empName="kajal";
	}
	
	String getDetails()
	{
		return id +""+empName;
	}
}
