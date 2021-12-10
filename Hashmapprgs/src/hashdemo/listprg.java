package hashdemo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class listprg {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();



		map.put("name1", "jack"); //name- key & value-jack
		map.put("id1", "1130");
		map.put("age1", "25");
		map.put("name2", "Tim");
		map.put("id2", "1131");
		map.put("age2", "30");



		List<Map<String, String>> keysString = Arrays.asList(map);

		for(Map<String, String> key : keysString)
		{
		System.out.println(key);
		}
	}

}
