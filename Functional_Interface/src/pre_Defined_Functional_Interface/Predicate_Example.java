package pre_Defined_Functional_Interface;

import java.util.function.Predicate;

public class Predicate_Example {

	public static void main(String[] args) {
		Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7)); 

	}

}
