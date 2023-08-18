package FunctionInterfac;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functn {
	public static void main(String[] args) {
		Function<Integer, Integer> f = a -> a + 5;
		System.out.println(f.apply(20));

		Consumer<String> name = (a) -> System.out.println(a);
		name.accept("Praveenraj");

		int num = 52;
		Supplier<Boolean> b = () -> num == 2;
		Supplier<Integer> c = () -> num * 2;
		System.out.println(b.get());
		System.out.println(c.get());

		Predicate<Integer> s = a -> a / 2 == 0;
   	    System.out.println(s.test(20)); 

	}

}
