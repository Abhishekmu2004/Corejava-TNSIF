package com.tnsif.exceptionhadnlingprograms;
//without maching the catch block
public class test2 {
	public static void main(String[] args) {
		try {
			System.out.println(50/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("hai anyone here  from vkit");
		}
		System.out.println("yes i am from vkit");
	}

}
