package pre_Defined_Functional_Interface;

import java.util.function.Consumer;


public class Consumer_Example {

	public static void main(String[] args) {
		
		Consumer<String> printer = s -> System.out.println("Hello " + s);
        printer.accept("World"); 

	}

}
