package com.tnsif.polymorphismdemo;
//demo for method  overloading
public class Overloadingdemo {
	int add(int a,int b) {
		return a+b;	
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
	Overloadingdemo d=new Overloadingdemo();
	
	System.out.println(d.add(1, 2));
	System.out.println(d.add(1, 2, 3));
	}

}
