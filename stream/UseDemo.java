package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseDemo {
	public static void main(String[] args) {
		Demo d1 = new Demo("Praveen",26,35000,"Developer");
		Demo d2 = new Demo("Ajith",24,30000,"QA");
		Demo d3 = new Demo("Balaji",27,45000,"Senior Developer");
		Demo d4 = new Demo("Chandru",25,25000,"Support");
		
		List<Demo> l = Arrays.asList(d1,d2,d3,d4);
		//sorting the names
		List<String> names = l.stream().map(x->x.getName()).sorted(Comparator.reverseOrder()).toList();
		System.out.println(names);
		//AnyMatch
		Boolean qa = l.stream().anyMatch(x->x.getDesignation().equals("QA"));
		System.out.println(qa);
		//sortbyAge
		List<Demo> ageSort = l.stream().sorted(Comparator.comparingInt(Demo::getAge).reversed()).toList();
		System.out.println(ageSort);
		//maxSalary
		Integer  maxSal = l.stream().map(x->x.getSalary()).max(Integer::compare).get();
		System.out.println(maxSal);
		//maxSalaryPerson
		Demo hiSalPerson = l.stream().sorted(Comparator.comparingInt(Demo::getSalary).reversed()).findFirst().get();
		System.out.println(hiSalPerson);
		//Summing Salary
		Integer sal = l.stream().collect(Collectors.summingInt(Demo::getSalary));
		System.out.println(sal);
		Map<String,List<Demo>> grp = l.stream().collect(Collectors.groupingBy(Demo::getDesignation));
		System.out.println(grp);
		//ArrayList
		ArrayList<Demo> lToArr = l.stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(lToArr);
		//
	}

}
