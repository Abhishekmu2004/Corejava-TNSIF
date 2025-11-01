package com.tnsif.superkeyworddemo;
//child class
public class DemoextendsSuperdemo extends Superdemo {

int a=50;
	
	void drinking() {
		System.out.println("hi java");
	}
	
	void show() {
		System.out.println(a);
		System.out.println(super.a);
		drinking();
		super.drinking();
	}
	
	DemoextendsSuperdemo(){
		super();
		System.out.println("child class");
	}
	public static void main(String[] args) {
		DemoextendsSuperdemo d=new DemoextendsSuperdemo();
		System.out.println(d.a);
		d.show();
		
	}
}
