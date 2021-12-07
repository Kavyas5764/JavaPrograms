package demo;

public class Electricityprg {

	public static void main(String[] args) {
		//bill for electricity
		//units
		//50 units are free
		//51-100 units cost Rs6
		//101-150 units cost Rs 8
		//151-total units cost Rs 9 and
		
		int units=690;
        if(units<=50)
            System.out.print("Bill Rs.0");

        else if(units>50 && units <=100)
        {   
            units=units-50;
        System.out.print(units*6);
        }
        else if(units>100 && units<=150)
        {
            units=(units-100)*8+(50*6);
            System.out.print("Bill Rs."+units);
        }
        else
        {
            units=(units-150)*9+(50*8)+(50*6);
            System.out.print("Bill Rs."+units);
        }
        
      //6.generate bills of calls, take no of calls as input(300)
      		int calls=200;
      	    if (calls <= 100)
      	    {
      	        System.out.println("Bill : Rs.0");
      	    }
      	    else if (calls > 100 && calls <= 200)
      	    {
      	        calls = calls - 100;
      	        System.out.println(calls);
      	    }
      	    else if (calls > 200 && calls <= 300)
      	    {
      	        calls = (calls - 200)*2+100;
      	        System.out.println(calls);
      	    }
      	    else
      	    {
      	        calls = (calls - 300)*3+300;
      	        System.out.println(calls);
      	    }



	}

}
