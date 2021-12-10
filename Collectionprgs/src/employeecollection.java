import java.util.ArrayList;
public class employeecollection {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();//Object

        Employee e1=new Employee("Kavya", "101");
        Employee e2=new Employee("xyz", "123");
        list.add(e1);
        list.add(e2);
        list.add(new Employee("abc","1234"));

        for(Employee  x  : list)
        {
        System.out.println(x);    
        }

    }
}
 
class Employee
{
    String name,id;
 
    public Employee(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }

    public String toString()
    {
    return "Name :"+name+"\nId  :"+id;

    }

}
