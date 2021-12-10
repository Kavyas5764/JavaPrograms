package hashdemo;
import java.util.HashMap;
import java.util.Map;

public class hashprg3 {

	public static void main(String[] args) {
		HashMap<String,Books> map = new HashMap<>();
		Books b1 = new Books("xyz",101,200);
		Books b2 = new Books("abc",102,250);
		
		//key,//value
		map.put("Books1",b1);
		map.put("Books2",b2);
		

		System.out.println(map);

		for(Map.Entry<String,Books> me: map.entrySet())
		{
			System.out.println(me.getKey()+ ":" +me.getValue().name+ ":"+me.getValue().id+":"+me.getValue().price);
		}
		
		
		
		
		
		//employee
		HashMap<String,Employee> map3 = new HashMap<>();
		Employee e1 = new Employee("xyz",20000,22);
		Employee e2 = new Employee("abc",10000,23);
		
		//key,//value
		map3.put("Employee1",e1);
		map3.put("Employee2",e2);
		

		System.out.println(map3);

		for(Map.Entry<String,Employee> me: map3.entrySet())
		{
			System.out.println(me.getKey()+ ":" +me.getValue().name+ ":"+me.getValue().salary+":"+me.getValue().id);
		}
	}

}

class Books{
		String name;
		int id,price;
		public Books(String name, int id, int price) {
			super();
			this.name = name;
			this.id = id;
			this.price = price;
		}
		
}

class Employee
{
	String name;
	int salary,id;
	public Employee(String name, int salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
}


