package pre_Defined_Functional_Interface;

import java.util.function.Supplier;

public class Supplier_Example {

	public static void main(String[] args) {
		
		Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); 

	}

}
