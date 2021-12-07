package test1;

public class evenexception {

	public static void main(String[] args) {
		int number=5;
		try
		{
			if(number%2 != 0)
			{
				throw new Even("NotEven Exception");
			}
			else {
				System.out.println("Even number");
			}
		}
		catch(Even e)
		{
			System.out.println(e);
		}
	}

		}
		class Even extends Exception
		{
			public Even(String number)
		{
				super(number);
		}

}
