package com.tnsif.exceptionhadnlingprograms;
// no exception
public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("welcome to tnsif");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Learn core java");
		}
	}

}

