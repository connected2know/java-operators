package main.java;

public class OperatorsExamples {
	
	class InnerClass extends OperatorsExamples{}

	public static void main(String[] args) {

		String code = "123:";
		System.out.println("code =" + code);

		int a = 1 + 1; // addition with result a = 2
		System.out.println("a =" + a);

		String a2 = "a" + "a"; // string contact with result a = "aa"
		System.out.println("a2 =" + a2);

		int i1 = +1; // unary plus operator with result i = 1;
		System.out.println("i1 =" + i1);

		int a3 = 2 - 1; // subtraction with result a3 = 1
		System.out.println("a3 =" + a3);

		int i2 = -1; // unary minus operator
		System.out.println("i2 =" + i2);

		int i3 = 2 * 2; // with result i3 = 4
		System.out.println("i3 =" + i3);

		int i4 = 2 / 2; // with result i4 = 1
		System.out.println("i4 =" + i4);

		int i5 = 2 % 2; // with result i5 = 0
		System.out.println("i5 =" + i5);

		int i6 = 1;
		i6 = i6++; // increment of i with result i6 = 1
		System.out.println("i6 =" + i6);

		int a4 = ++i6; // increment of i and assign the value to a with result a4 = 2
		System.out.println("a4 =" + a4);

		int i7 = i6--; // decrements of i with result i7 = 2
		System.out.println("i7 =" + i7);

		int a5 = --i6; // decrements of i and assign the value to a with result a5 = 0
		System.out.println("a5 =" + a5);

		boolean a6 = !true; // inversion of a with result a = false
		System.out.println("a6 =" + a6);

		boolean a7 = (1 == 2); // compare if 1 is equals to  2 with result a7 = false;
		System.out.println("a7 =" + a7);

		boolean a8 = (1 != 2); // compare if 1 is different of 2 with result a8 = true;
		System.out.println("a8 =" + a8);

		boolean a9 = (1 > 2); // compare if 1 is greater than 2 with result a9 = false;
		System.out.println("a9 =" + a9);

		boolean a10 = (1 >= 2); // compare if 1 greater or equal 2 with result a10 = false;
		System.out.println("a10 =" + a10);

		boolean a11 = (1 < 2); // compare if 1 is less than 2 with result a11 = true;
		System.out.println("a11 =" + a11);

		boolean a12 = 1 <= 2; // compare if 1 less or equals 2 with result a12 = true;
		System.out.println("a12 =" + a12);
		
		boolean a13 = (1 <= 2) && (1 > 0); // compare if 1 is lesser than 2 and 1 greater than 0 with result a13 = true
		System.out.println("a13 =" + a13);
		
		boolean a14 = (1 > 2) || (1 > 0); // compare if 1 is greater than 2 or 1 is greater than 0 with result a14 = true because 1 > 0
		System.out.println("a14 =" + a14);
		
		boolean a15 = 1 > 0 ? true : false; //compares if 1 is greater than 0, if yes, returns true else false with result a15 = true
		System.out.println("a15 =" + a15);
		
		int a16 = ~2; // returns -3 .  
		System.out.println("a16 =" + a16);
		
		int a17 = 2<<1; // returns 4
		System.out.println("a17 =" + a17);
		
		int a18 = 2>>1; // returns 1
		System.out.println("a18 =" + a18);
		
		int a19 = 2>>>1; // returns 1
		System.out.println("a19 =" + a19);
		
		int a20 = 5&4; // returns 4
		System.out.println("a20 =" + a20);
		
		int a21 = 5^3; // returns 6
		System.out.println("a21 =" + a21);
		
		int a22 = 5|3; // returns 7
		System.out.println("a22 =" + a22);
		
		OperatorsExamples operatorsExamples = new OperatorsExamples();
		InnerClass innerClass = operatorsExamples.new InnerClass();

		boolean a23 = innerClass instanceof OperatorsExamples; // returns true
		System.out.println("a23 =" + a23);
	}

}
