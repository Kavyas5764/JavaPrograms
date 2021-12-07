package test1;

public class exception {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++) {
			try {
				if(i==5) {
					i=i/10;
				}
				System.out.println(i);
			}
			catch(Exception e) {
				System.out.println("Exception in code: " +e);
			}
			
		}
		try {
			String var = null;
			
			System.out.println(var.charAt(3));
			
		}
		catch(Exception e){
			System.out.print(e);
			
		}
		

	}

}
