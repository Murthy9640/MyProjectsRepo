package pre_Defined_Functional_Interface;

import java.util.function.BiConsumer;

public class BiConsumer_Example {

	public static void main(String[] args) {
		
		BiConsumer<String, Integer> printPerson = (name, age) ->
        System.out.println("Name: " + name + ", Age: " + age);

		printPerson.accept("Alice", 25);
		printPerson.accept("Bob", 30);

	}

}
