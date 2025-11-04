package com.tnsif.exceptionhadnlingprograms;
//exception with matching block 
public class Test1 {

	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("hello vkit");
		}
		System.out.println("java coding");

	}

}
