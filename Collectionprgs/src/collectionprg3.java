import java.util.ArrayList;
public class collectionprg3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Is arraylist empty:"+list.isEmpty());
		
		list.add(1);
		list.add(88);
		list.add(9);
		list.add(14);
		
		//again checking for isempty
		System.out.println("Is arraylist empty:"+list.isEmpty());
		
		//displaying elements:
		for(Integer num: list) {
			System.out.println(num);
		}

	}

}
