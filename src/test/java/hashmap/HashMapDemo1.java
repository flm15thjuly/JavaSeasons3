package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		hMap.put("Manager", "Ravi");
		hMap.put("Test Lead", "Gopi");
		hMap.put("Tester", "reyaz");
		hMap.put("Developer", "Sam");
		
		System.out.println(hMap);
		
		
		Set<Entry<String, String>> entries=hMap.entrySet();
		
		for(Entry<String, String> entry:entries)
		{
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		System.out.println(hMap.get("Developer"));

	}

}
