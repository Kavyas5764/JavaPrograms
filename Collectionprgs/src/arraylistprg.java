import java.util.ArrayList;

public class arraylistprg {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<>();//Object
	        list.add("java");
	        list.add("C++");
	        list.add("C");

	        for(String x  : list)
	        {
	        System.out.println(x);    
	        }
	        
	        //integerlist
	        ArrayList<Integer> list1=new ArrayList<>();//Object
	        list1.add(567);
	        list1.add(67890);
	        list1.add(14);

	        for(int  x  : list1)
	        {
	        System.out.println(x);    
	        }

	}

}
