package hashdemo;
import java.util.HashMap;
import java.util.Map;

public class hashmapprg6 {
	public static void main(String[] args) {
	HashMap<Integer, String> languages = new HashMap<>();

    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

    // return set view of keys
    // using keySet()
    System.out.println("Keys: " + languages.keySet());
	}
}
