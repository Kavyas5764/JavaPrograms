package hashdemo;
import java.util.HashMap;
import java.util.Map;


public class hashmapprg13 {

	public static void main(String[] args) {
		HashMap <String, String> hm = new HashMap < String, String > ();
		  hm.put("C", "Dennis ");
		  hm.put("C++", "Bjarne");
		  hm.put("Java", "Gosling");
		  hm.put("Python", "Guido");

		  HashMap < String, String > hm1 = new HashMap < String, String > ();

		  hm1.put("C", "Dennis Ritchie");
		  hm1.put("C++", "Bjarne Stroustrup");
		  hm1.put("Java", "James Gosling");
		  hm1.put("Python", "Guido van Rossum");

		  boolean a = hm.equals(hm1);
		  System.out.println(a);

		  HashMap < String, Integer > hm2 = new HashMap < String, Integer > ();
		  hm2.put("ABC", 1000);
		  hm2.put("XYZ", 1001);
		  hm2.put("IJK", 1002);

		  boolean b = hm.equals(hm2);
		  System.out.println(b);

	}

}
