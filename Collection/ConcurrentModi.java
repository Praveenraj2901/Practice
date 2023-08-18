package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModi {
	public static void main(String[] args) {
		List<String> names = new CopyOnWriteArrayList<>();
		names.add("Praveenraj");
		names.add("Raja");
		names.add("Ajith");
		names.add("Venkatesh");
		names.add("Deepan");
		
		for(String x: names) {
			if(x.equals("Deepan")) {
				names.remove(x);
			}
		}
		System.out.println(names);
		
	}

}
