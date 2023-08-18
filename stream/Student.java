package stream;

public class Student {
	private String name;
	private int age;
	private char section;
	private String gender;
	private String fatherName;
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
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Student(String name, int age, char section, String gender, String fatherName) {
		super();
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.fatherName = fatherName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", section=" + section + ", gender=" + gender
				+ ", fatherName=" + fatherName + "]";
	}
	

}
