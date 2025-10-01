package pre_Defined_Functional_Interface;

import java.util.function.BiPredicate;

public class BiPredicate_Example {

	public static void main(String[] args) {
		
		BiPredicate<String, Integer> longerThan = (str, len) -> str.length() > len;

        System.out.println(longerThan.test("Java", 3));   
        System.out.println(longerThan.test("Hi", 5)); 

	}

}
