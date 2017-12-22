package io.lax.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2Exercise {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("29", "Lakshman", "Chintala"),
				new Person("22", "Soma", "Evani"), new Person("23", "Sridhar", "Anarasi"),
				new Person("27", "Anil", "Pantangi"), new Person("20", "Chintakunta", "Pinakini"));

		// step1: sort list by last name
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// step 2: create a method that prints all elements in list
		System.out.println("Printing all Persons");
		performConditionally(persons, p->true, p->System.out.println(p));

		// step 3: create a method that prints all elements that firstname starts with "S"
		System.out.println("Printing the Persons whose name starts with 'P'");
		performConditionally(persons, p->p.getLastName().startsWith("P"), p->System.out.println(p.getLastName()));
	}


	private static void performConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : persons) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
