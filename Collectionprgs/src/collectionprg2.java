import java.util.ArrayList;
public class collectionprg2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//using add() method
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("Printing list items before using clear method"+list);
		
		//using clear method:
		list.clear();
		System.out.println("Printing list items after using clear method"+list);
		
		

	}

}
