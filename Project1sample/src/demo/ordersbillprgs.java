package demo;
import java.util.Scanner;

public class ordersbillprgs {

	public static void main(String[] args) {
			char choice;
			int sum=0;
			Scanner sc=new Scanner(System.in);
			do 
			{
				System.out.print("Select your option :\n 1.Breakfast\n 2.Lunch\n 3.Dinner\n");
				int op=sc.nextInt();
				if(op==1)
				{
					System.out.print("Select your option :\n 1.Coffee\n 2.Idli\n");
					int cho=sc.nextInt();
					if(cho==1)
					{
						sum=sum+30;
						System.out.println("Your Totalbill is: "+sum+"Rs");
					}
					else if(cho==2)
					{
						sum=sum+50;
						System.out.println("Your Totalbill is: "+sum+"Rs");
					}
				}
				else if(op==2)
				{
					System.out.print("Select your option :\n 1.Pizza\n 2.Burger\n");
					int choose=sc.nextInt();
					if(choose==1)
					{
						sum=sum+300;
						System.out.println("Your Totalbill is: "+sum+"Rs");
					}
					else if(choose==2)
					{
						sum=sum+200;
						System.out.println("Your Totalbill is: "+sum+"Rs");
					}
				}
					else if(op==3)
					{
						System.out.print("Select your option :\n 1.Rice\n 2.Chapati\n");
						int ch=sc.nextInt();
						if(ch==1)
						{
							sum=sum+70;
							System.out.println("Your bill is: "+sum+"Rs");
						}
						else if(ch==2)
						{
							sum=sum+50;
							System.out.println("Your bill is: "+sum+"Rs");
						}
					}
					System.out.print("Do you want to continue?(y/n)");
					choice=sc.next().charAt(0);

			}
			while(choice=='y');
			System.out.print("Thankyou visit again!!!");

	}

}
