package pre_Defined_Functional_Interface;

import java.util.function.BiFunction;

public class BiFunction_Example {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));

	}

}
