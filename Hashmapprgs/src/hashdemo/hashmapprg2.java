package hashdemo;
import java.util.HashMap;
import java.util.Map;

public class hashmapprg2 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
				//key,//value
		map.put("color1","red");
		map.put("color2","black");
		map.put("color3","pink");
		
		System.out.println(map);
		
		for(Map.Entry<String,String> me: map.entrySet())
		{
			System.out.println(me.getKey()+ ":" +me.getValue());
		}
		
		//example2
		HashMap<String,Integer> map1 = new HashMap<>();
		
		map1.put("java",79);
		map1.put("php",60);
		map1.put("Android",90);
		
		System.out.println(map1);
		
		for(Map.Entry<String,Integer> me: map1.entrySet())
		{
			System.out.println(me.getKey()+ ":" +me.getValue());
		}
		
		//example3
				HashMap<Integer,String> map2 = new HashMap<>();
				
				map2.put(1,"kavya");
				map2.put(2,"xyz");
				map2.put(3,"abc");
				map2.put(4,"def");
				
				System.out.println(map2);
				
				for(Map.Entry<Integer,String> me: map2.entrySet())
				{
					System.out.println(me.getKey()+ ":" +me.getValue());
				}

	}

}
