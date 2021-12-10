package hashdemo;
import java.util.HashMap;
import java.util.Map;

public class hashmapprg10 {

	public static void main(String[] args) {
		HashMap<String, String> details = new HashMap<>();

	    // add mappings to HashMap
	    details.put("Name", "Kavya");
	    details.put("Place", "Mangalore");
	    details.put("age", "24");
	    System.out.println("Student Details: \n" + details);

	    // check if key Domain is present
	    if(details.containsKey("Place")) {
	      System.out.println("Place name is present in the Hashmap.");
	    }

	}

}
