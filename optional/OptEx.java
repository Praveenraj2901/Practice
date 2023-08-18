package optional;

import java.util.Optional;

public class OptEx {
	public static Optional<String> getName(String name) {
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		//OptEx p = new OptEx();
		getName(null).ifPresentOrElse(a->System.out.println(a),()->System.out.println("Value not found"));
		
	}

}
