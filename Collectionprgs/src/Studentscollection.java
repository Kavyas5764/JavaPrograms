import java.util.ArrayList;
public class Studentscollection {

	public static void main(String[] args) {
		ArrayList<Students> list=new ArrayList<>();
		Students s1 = new Students("Kavya","400/500","300/500","490/500");
		Students s2 = new Students("John","300/500","390/500","450/500");
		Students s3 = new Students("abc","400/500","300/500","490/500");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(Students s : list)
		{
			System.out.println("\nStudent Name:"+s.name+"\nMarks1: "+s.marks1+"\nMarks2:"+s.marks2+"\nMarks3:"+s.marks3);
		}

	}

}

class Students{
	String name;
	String marks1,marks2,marks3;
	public Students(String name, String marks1, String marks2, String marks3) {
		super();
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	
}
