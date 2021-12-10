package hashdemo;
import java.util.HashMap;
import java.util.Map;

public class Hashmapprg1 {

	public static void main(String[] args) {
				//KEY,//VALUE PAIR   
		HashMap<String,String> map = new HashMap<>();
		
		map.put("key1","abc");
		map.put("key2","xyz");
		map.put("key3","pqr");
		
		System.out.println(map);
		
		for(Map.Entry<String,String> me: map.entrySet())
		{
			System.out.println(me.getKey()+"and"+me.getValue());
		}
		

	}

}
