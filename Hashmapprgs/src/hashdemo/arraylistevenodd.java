package hashdemo;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistevenodd {

	public static void main(String[] args) {
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		ArrayList<Integer> prime=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		
		for(int i=0;i<10;i++)
		{
			int n=sc.nextInt();
			list.add(n);
		}
		System.out.println(list);
		
		for(Integer s:list)
		{
			if(s%2==0)
				even.add(s);
		else
			odd.add(s);
			int p=s;
			int r=p-1;
			int count=1;
		while(r!=0)
		{
		if(p%r==0)
			count++;
			r--;
		}
		if(count==2)
			prime.add(s);
		}
		System.out.println("The Even numbers are: "+even);
		System.out.println("The Odd number are: "+odd);
		System.out.println("The Prime number are: "+prime);
		}


}
