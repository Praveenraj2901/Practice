package day3;

public class Employee {
	private static Employee emp=null;
	private static String name = null;
	
	private Employee(String name)  {
		this.name = name;
	}
	public static Employee getemp(String name) {
		if(emp==null) {
			emp = new Employee(name);
			return emp;
		}
		else {
			Employee.name = name;
			return emp;
		}
	}
	public String toString() {
		return name;
	}

}
