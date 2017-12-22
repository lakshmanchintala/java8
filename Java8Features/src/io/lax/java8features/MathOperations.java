package io.lax.java8features;

public class MathOperations {

	public static void main(String[] args) {
		MyMath addition = (a,b)-> a+b;
		MyMath subtraction = (a,b)-> a-b;
		MyMath division = (a,b)-> a/b;
		MyMath multiplication = (a,b)-> a*b;
		calculateAndPrint(addition);
		calculateAndPrint(subtraction);
		calculateAndPrint(division);
		calculateAndPrint(multiplication);
	}
	
	static void calculateAndPrint(MyMath myMath) {
		System.out.println(myMath.math(3, 2));
	}

}

interface MyMath{
	int math(int a, int b);
}
