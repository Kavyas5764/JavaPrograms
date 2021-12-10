package hashdemo;
import java.util.HashMap;
import java.util.Map;

public class hashmapprg7 {

	public static void main(String[] args) {
		HashMap<String, Integer> languages = new HashMap<>();
        System.out.println("Newly Created HashMap: " + languages);


        boolean result = languages.isEmpty(); // true
        System.out.println("Is the HashMap empty? " + result);

        languages.put("Python", 1);
        languages.put("Java", 14);
        System.out.println("Updated HashMap: " + languages);

      
        result = languages.isEmpty();  // false
        System.out.println("Is the HashMap empty? " + result);

	}

}
