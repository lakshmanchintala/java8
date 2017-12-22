package io.lax.java8features;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(()->System.out.println("Printed inside lambda run method"));
		myThread.run();
	}

}
