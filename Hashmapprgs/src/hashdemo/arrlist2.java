package hashdemo;
import java.util.ArrayList;

public class arrlist2 {

	public static void main(String[] args) {
		int n = 3;


		ArrayList<ArrayList<Integer> > aList =
		new ArrayList<ArrayList<Integer> >(n);


		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		aList.add(a1);

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(5);
		aList.add(a2);

		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(40);
		a3.add(50);
		a3.add(60);
		aList.add(a3);

		for (int i = 0; i < aList.size(); i++) {
		for (int j = 0; j < aList.get(i).size(); j++) {
		System.out.print(aList.get(i).get(j) + " ");
		}
		System.out.println();
		}

	}

}
