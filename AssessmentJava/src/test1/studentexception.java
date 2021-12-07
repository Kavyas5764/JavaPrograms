package test1;

public class studentexception {

	public static void main(String[] args) {
		int num=100;
		try
		{
			if(num<200)
			{
				throw new Marks("Failed Exception");
			}
			else {
				System.out.println("Student is pass");
			}
		}
		catch(Marks e)
		{
			System.out.println(e);
		}
	}

		}
		class Marks extends Exception
		{
			public Marks(String marks)
		{
			super(marks);
		}
}
