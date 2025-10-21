package com.tnsif.accessmodifierdemo;

public class Accessmodifier {
	//public
	int a=3;
	String s="abhi";
	public void display() {
		System.out.println("welcome to corejava");
	}
	public static void main(String[] args) {
		Accessmodifier obj=new Accessmodifier();
		System.out.println(obj.a);
		System.out.println(obj.s);
		obj.display();
	}

}
