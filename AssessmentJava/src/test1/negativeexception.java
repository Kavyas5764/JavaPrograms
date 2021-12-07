package test1;

public class negativeexception {

	public static void main(String[] args) {
		int number=-1;
		try
		{
			if(number<0)
			{
				throw new Negative("Negative Exception");//custom exception to be passed
			}
			else {
				System.out.println(number);
			}
		}
		catch(Negative e)
		{
			System.out.println(e);
		}
	}
	
}
		
	class Negative extends Exception
	{
		public Negative(String number)
	{
		super(number);
	}

}
