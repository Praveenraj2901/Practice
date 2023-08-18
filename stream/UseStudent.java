package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import javax.print.DocFlavor.CHAR_ARRAY;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Ajith",16,'A', "Male", "Ramesh" );
		Student s2 = new Student("Praveenraj",17,'B', "Male", "Sambath" );
		Student s3 = new Student("Raja",17,'A', "Male", "Pandiyan" );
		Student s4 = new Student("Venkatesh",18,'C', "Male", "Ramesh" );
		Student s5 = new Student("Arun",12,'D', "feMale", "Ram" );
		
		List<Student> std = Arrays.asList(s1,s2,s3,s4,s5);
		List<Integer> d = Arrays.asList(1,2,3,4,5,6);
		Integer sums = d.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sums);
		System.out.println(std);
		
		List<String> names = std.stream().map(x->x.getName()).filter(x->x.length()>4).collect(Collectors.toList());
		names.forEach(x->System.out.println(x));
		
		Long count = names.stream().count();
		System.out.println(count);
		
		List<String> dupli = std.stream().map(x->x.getGender()).distinct().toList();
		dupli.forEach(x->System.out.println(x));
		
		List<Student> lim = std.stream().limit(2).toList();
		lim.forEach(x->System.out.println(x));
		System.out.println("----------------------------------------");
		List<Student> skp = std.stream().skip(4).toList();
		skp.forEach(x->System.out.println(x));
		
		Integer maxAge=std.stream().map(x->x.getAge()).max(Integer::compare).get();
		System.out.println(maxAge);
		
		Student minAge=std.stream().min(Comparator.comparingInt(Student::getAge)).get();
		System.out.println("++++++++++++++++++++++++++++=");
		System.out.println(minAge);
		
		
		Student maxthree = std.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).skip(2).findFirst().get();
		System.out.println("----------3rdMaxAge----------");
		System.out.println(maxthree);
		System.out.println("---------------------------------");
		List<Student> minthree = std.stream().sorted(Comparator.comparingInt(Student::getAge)).limit(3).toList();
		System.out.println("----------------MinimumThree-----------------------");
		System.out.println(minthree);
		System.out.println("------------------------------------------");
		
		Boolean match = std.stream().anyMatch(x->x.getSection()=='F');
		System.out.println("----------AnyMatch-------------------------------");
		System.out.println(match);
		
		Integer sum = std.stream().collect(Collectors.summingInt(Student::getAge));
		System.out.println(sum);
		System.out.println("-----------------GroupingBy---------------------------");
		
		Map<String, List<Student>> grp = std.stream().collect(Collectors.groupingBy(Student::getName));
		System.out.println(grp);
		System.out.println("----------------Set------------------");
		
		Set<Student> setStd =  std.stream().collect(Collectors.toSet());
		setStd.forEach(x->System.out.println(x));
		System.out.println("------------------Map---------------");
		
		Map<String,Student> mapstd = std.stream().collect(Collectors.toMap(x->x.getName(), y->y));
		System.out.println(mapstd);
		System.out.println("--------------ArrayList------------------");
		ArrayList<Student> arrstd = std.stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(arrstd);
		System.out.println("-------------HashMap------------------------");
		
		List<Student> lis = arrstd.stream().collect(Collectors.toList());
		
		HashMap<String, Student> hashmapstd = std.stream().collect(Collectors.toMap(x->x.getName(), y->y, (a,b)->a,HashMap::new));
		System.out.println(hashmapstd);
		
		String str = "Praveen";
		char[] c = str.toCharArray();
		//List<char[]> li = Arrays.asList(c);
		//System.out.println(c);
		Long l = str.chars().filter(x->x=='a'||x=='e'||x=='i'||x=='o'||x=='u').count();
		System.out.println(l);
		
		Long l1 = str.chars().filter(x->x=='a'||x=='e'||x=='i'||x=='o'||x=='u').count();
		System.out.println(l1);
		System.out.println("+++++++++++++++++++++++++");
		
		List<Student> sort2  = std.stream().filter(x->x.getAge()>12).sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getName).reversed()).toList();
		System.out.println(sort2);
		System.out.println("(((((((())))))))))");
		Map<String, List<Student>> twocount = std.stream().collect(Collectors.groupingBy(Student::getGender));
		System.out.println(twocount);
		System.out.println("((((((((((((((((((((((()))))))))))))))))))))))");
		Map<String, List<String>> groupByGenderAndFirstNameSet
        = std.stream().collect(Collectors.groupingBy(Student::getGender,
                Collectors.mapping(Student::getName, Collectors.toList()))); 
		System.out.println(groupByGenderAndFirstNameSet);
		
		Map<String, Long> cntgen = std.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println(cntgen);
		
		Map<String, Optional<Student>> maxstd = std.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.maxBy(Comparator.comparing(Student::getAge))));
		System.out.println(maxstd);
		
		Map<String, IntSummaryStatistics> groupPersonsByAge = std.stream().
                collect(Collectors.groupingBy(Student::getGender
                        ,Collectors.summarizingInt(Student::getAge)));
		
		System.out.println(groupPersonsByAge);
		
		/* Map<String, Long> dupliCnt = */ arrstd.stream().collect(Collectors.groupingBy(Student::getFatherName, Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).forEach(x->System.out.println(x.getKey()));
		//System.out.println(dupliCnt);
	//	dupliCnt.entrySet().stream().filter(x->x.getValue()>1).forEach(x->System.out.println(x.getKey()));
		
		List<Student> dups = arrstd.stream().filter(x->Collections.frequency(arrstd,x.getFatherName())>1).toList();
		System.out.println(dups);
	    String sts = "PraveenrajP";
	    
		Map<String,Long> nonRepeating = Arrays.stream(sts.split("")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
		nonRepeating.forEach((x,y)->{
			if(y==1) {
				System.out.println(x);
				
			}
		});
	}

}
