package io.lax.java8features;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5,0);
		//handle specific execption by passing it to the wrapper lambda.
		integers.forEach(handlingConsumerWrapper(i->writeToFile(i),IOException.class));

	}
	
	private static Object writeToFile(Integer i) {
		return null;
	}
	
	static <T, E extends Exception> Consumer<T> handlingConsumerWrapper(ThrowingConsumer<T, E> throwingConsumer, Class<E> exceptionClass) {
		return i-> {
			try {
				throwingConsumer.accept(i);
			} catch (Exception e) {
				E exCast = exceptionClass.cast(e);
				System.out.println("Exception Occured :  "+exCast.getMessage());
			}
		};
	}

}
