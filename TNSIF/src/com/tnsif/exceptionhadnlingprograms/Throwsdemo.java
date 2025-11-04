package com.tnsif.exceptionhadnlingprograms;
// throws key keyword

import java.io.IOException;

public class Throwsdemo {
	//abhishek
	void m1()// no exception
	{
		System.out.println("no exception");
	}
	//mahesh
	void m2() throws IOException{
		System.out.println("device error");
	}
	//kushal
	void m3() throws ArithmeticException,IOException,ClassNotFoundException{
		System.out.println("fill not found");
	}
	public static void main(String[] args) {
		Throwsdemo t=new Throwsdemo();
		t.m1();
		try {
			t.m2();
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			t.m3();
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}