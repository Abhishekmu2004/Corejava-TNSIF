package com.tnsif.inheritancedemo;

public class Demo implements Childinterface,Interfaceone{

	@Override
	public void print() {
		System.out.println("print");
		
	}
	@Override
	public void show() {
		System.out.println("show");	
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.show();
		d.print();
	}

}