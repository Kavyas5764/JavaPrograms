package hashdemo;

import java.util.HashMap;
import java.util.Map;

public class hashprg4 {

	public static void main(String[] args) {
		HashMap<String,Teacher> map2 = new HashMap<>();
		Teacher t1 = new Teacher("xyz","10th",119);
		Teacher t2 = new Teacher("abc","12th",120);
		
		//key,//value
		map2.put("Teacher1",t1);
		map2.put("Teacher2",t2);
		

		System.out.println(map2);

		for(Map.Entry<String,Teacher> me: map2.entrySet())
		{
			System.out.println(me.getKey()+ ":" +me.getValue().name+ ":"+me.getValue().id+":"+me.getValue().classes);
		}

	}

}

class Teacher{
	String name,classes;
	int id;
	public Teacher(String name, String classes, int id) {
		super();
		this.name = name;
		this.classes = classes;
		this.id = id;
	}
	
	
}
