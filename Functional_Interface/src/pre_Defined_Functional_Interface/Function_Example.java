package pre_Defined_Functional_Interface;

import java.util.function.Function;

public class Function_Example {

	public static void main(String[] args) {
		Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Hello"));

	}

}
