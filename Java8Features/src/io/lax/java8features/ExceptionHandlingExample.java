package io.lax.java8features;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		int key = 0;
		process(intArr, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] intArr, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : intArr) {
			biConsumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (v,k) -> {
			try {
				biConsumer.accept(v, k);
			}catch(Exception e) {
				System.out.println("Exception in wrapper lambda : "+e.getMessage());
			}
		};
	}
}
