import java.util.ArrayList;
public class languagecollection {

	public static void main(String[] args) {
		ArrayList<Subjects> list=new ArrayList<>();
		Subjects s1 = new Subjects("Java",90);
		Subjects s2 = new Subjects("Android",80);
		Subjects s3 = new Subjects("Python",70);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.set(0, s1);
		list.get(1);
		for(Subjects s : list)
		{
			System.out.println("\nLanguage:"+s.languages+"\nMarks:"+s.marks);
		}
		
		
		

	}

}
class Subjects
{
	String languages;
	int marks;
	public Subjects(String languages, int marks) {
		super();
		this.languages = languages;
		this.marks = marks;
	}
	
}
