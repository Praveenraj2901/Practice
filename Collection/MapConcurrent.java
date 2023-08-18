package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapConcurrent {
	public static void main(String[] args) {
		Map<Integer, String> names = new ConcurrentHashMap<>();
		names.put(1,"Praveenraj");
		names.put(2,"Ajith");
		names.put(3,"Venkatesh");
		names.put(4,"Raja");
		
		for(int a: names.keySet()) {
			if(a==2) {
				names.remove(a);
			}
			
		}
		System.out.println(names);
		System.out.println(names.get(1));
	}

}
