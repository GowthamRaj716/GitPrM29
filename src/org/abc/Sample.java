package org.abc;

public class Sample {

	int number = 123;

	private void add(int a, int b) {

		int c = a + b;
		System.out.println("Sum : " + c);
	}

	private void mul(int num1, int num2) {

		int product = num1 * num2;
		System.out.println(product);
	}

	private void sub(int n1, int n2) {

		int res = n1 - n2;
		System.out.println(res);
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		s.add(11, 22);
		s.add(22, 55);

	}
}
