package stream;

public class Demo {
	private String name;
	private int age;
	private int salary;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Demo(String name, int age, int salary, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	

}
