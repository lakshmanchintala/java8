package io.lax.java8features;

import java.util.Arrays;
import java.util.List;

public class JavaLambdas {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("1","Lakshman","Chintala"),
				new Person("1","Soma","Evani"),
				new Person("1","Sridhar","anarasi"));
		persons.forEach(p->System.out.println(p.getFirstName()));
		persons.stream().filter(p->p.getFirstName().startsWith("S")).forEach(p->System.out.println(p.getFirstName()));

	}

}
