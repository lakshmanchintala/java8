package io.lax.java8features;

public class Person {

private String firstName;
private String lastName;
private String age;

public Person() {
	
}

public Person(String age, String firstName, String lastName) {
	super();
	this.age = age;
	this.firstName = firstName;
	this.lastName = lastName;
}

@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
}

public String getFirstName() {
	return firstName;
}
public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
