package hashdemo;
import java.util.HashMap;
import java.util.Map;

public class hashmapprg5 {

	public static void main(String[] args) {
		  HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Abc");    
	      map.put(101,"def");    
	      map.put(102,"ghi");  
	      map.put(103, "jkl");  
	    System.out.println("Initial list of elements: "+map);  
	    //key-based removal  
	    map.remove(100);  
	    System.out.println("Updated list of elements: "+map);  
	    //value-based removal  
	    map.remove(101);  
	    System.out.println("Updated list of elements: "+map);  
	    //key-value pair based removal  
	    map.remove(102, "ghi");  
	    System.out.println("Updated list of elements: "+map);  
	   }      

}
