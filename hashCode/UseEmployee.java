package hashCode;

import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(123, "Praveen", 25000, "Male");
		Employee e2 = new Employee(124, "Ajith", 26000, "Male");
		Employee e3 = new Employee(125, "Venkatesh", 25000, "Male");
		
		HashMap<Integer, Employee> employees = new HashMap<>();
		employees.put(e1.getId(), e1);
		employees.put(e2.getId(), e2);
		employees.put(e3.getId(), e3);
		
		for(Employee e: employees.values()) {
			System.out.println(e.hashCode());
		}
			System.out.println(e1.equals(e2));	
	}
}
