package com.tnsif.multithreading;

public class Tsynch {
	public static void main(String[] args) {
		//Example e=new Example();
		
		T t1=new T(null);
		T t2=new T(null);
		T t3=new T(null);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}