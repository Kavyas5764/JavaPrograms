package hashdemo;
import java.util.ArrayList;
import java.util.ListIterator;

public class hashmapprg14 {

	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<String>();
	      List.add("abc");
	      List.add("def");
	      List.add("ghi");
	      List.add("jkl");
	      List.add("mno");
	      ListIterator<String> li = List.listIterator();
	      while (li.hasNext()) {
	         li.next();
	      }
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) {
	         System.out.println(li.previous());
	      }
	   }

}
