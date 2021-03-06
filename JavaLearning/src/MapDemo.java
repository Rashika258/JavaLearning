import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	//HashMap is not synchronised but HashTable is synchronised
	Map<String, String> map=new HashMap();
	map.put("name", "rashika");
	map.put("actor", "john");
	map.put("class", "cseb");
	//keys should be unique
	map.put("name","rashika suresh");
	System.out.println(map);
	//maps don't have iterators nor for loops can be used only through keys values can be accessed
	System.out.println(map.get("name"));
	Set<String> keys=map.keySet();
	for (String key:keys) {
		System.out.println(key + map.get(key));
	}
}
}
