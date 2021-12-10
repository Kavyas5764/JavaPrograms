package hashdemo;
import java.util.ArrayList;
import java.util.ListIterator;

public class hashprg15 {

	public static void main(String[] args) {
		 ArrayList<String> List = new ArrayList<String>();
	      List.add("abc");
	      List.add("def");
	      List.add("ghi");
	      List.add("jkl");
	      List.add("mno");
	      ListIterator li = List.listIterator();
	      System.out.println("The ArrayList elements in the forward direction are: ");
	      while (li.hasNext()) {
	         System.out.println(li.next());
	      }
	}

}
