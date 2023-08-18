package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapp {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10,20,30);
		List<Integer> l2 = Arrays.asList(40,50,60);
		
		List<List<Integer>> lists = Arrays.asList(l1,l2);
		System.out.println(lists);
		
		List<Integer> res = lists.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(res);
		
		Set<Integer> se = lists.stream().flatMap(x->x.stream()).collect(Collectors.toSet());
		//System.out.println(se);
		
		Integer[] num = {78,34,56,21};
		List<Integer> li = Arrays.stream(num).sorted(Integer::compare).toList();
		System.out.println(li);
		
		List<Integer> lii = Arrays.stream(num).sorted(Comparator.comparing(Integer::intValue).reversed()).toList();
		System.out.println(lii);
		
		Integer lis = Arrays.stream(num).max(Integer::compare).get();
		System.out.println(lis);
		
		List<Integer> l5 = Arrays.stream(num).filter(x->x%2==0).toList();
		System.out.println(l5);
		List<Integer> l6 = Arrays.stream(num).limit(1).toList();
		System.out.println(l6);
		List<Integer> l7 = li.stream().sorted((x,y)->x-y).toList();
		List<String> l8 = res.stream().map(x->String.valueOf(x)).toList();
		System.out.println(l8);
		Integer l9 = li.stream().max((x,y)->x-y).get();
		System.out.println(l9);
		Integer sum = li.stream().reduce(0,(x,y)->x+y);
		System.out.println(sum);
		Integer max = li.stream().reduce(0,(x,y)-> x>y ? x:y);
		System.out.println(max);
		Integer Sums = li.stream().reduce(0,Integer::sum);
		System.out.println(Sums);
		Integer maxi = li.stream().reduce(0,Integer::max);
		System.out.println(maxi);
		Integer mini = li.stream().reduce(li.get(0),Integer::min);
		System.out.println(mini);
		
		List<Integer> li1 = Arrays.asList(2,2,3,5,7,8,8,9);
		List<Integer> dup = li1.stream().filter(x->Collections.frequency(li1,x)>1).toList();
		System.out.println(dup);
		List<Integer>dups=li1.stream().filter(z->li1.stream().filter(y->y.equals(z)).count()>1).distinct().toList();
		System.out.println(dups);
		
	}

}
