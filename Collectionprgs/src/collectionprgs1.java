import java.util.ArrayList;
public class collectionprgs1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(5);
		ArrayList<Integer> list1 = new ArrayList<Integer>(5);
		list1.add(6);
		list1.add(4);
		list1.add(9);
		
		System.out.println("Elements of List1 are:" +list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(5);
		
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		
		System.out.println("Elements of List2 are:" +list2);
		
		
		//add method to add the elements in the list
		list.add("Java");
		list.add("Python");
		list.add("Android");
		list.add("php");
		list.add("javascript");
		list.remove(2);
		System.out.println("ArrayList after removing are:" +list);
		
		//using addAll() method:
		list1.addAll(2, list2);
		System.out.println("Elements of List1 after using addAll method are:" +list1);
		
		
		
		

	}

}
