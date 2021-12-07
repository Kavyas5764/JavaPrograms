package test1;

public class Passwordexception {

	public static void main(String[] args) {
			String val="Kavya";
			try
			{
				if(val.length()<10)
				{
					throw new Strlength("LengthNotMatch Exception");
				}
				else {
					System.out.println(val);
				}
			}
			catch(Strlength e)
			{
				System.out.println(e);
			}
		}
}

		class Strlength extends Exception
		{
			public Strlength(String val)
			{
				super(val);
			}

}
