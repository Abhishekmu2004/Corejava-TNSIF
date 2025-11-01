package com.tnsif.constructorprogram;

public class Constructer {
	Constructer(int i){
		System.out.println("Constructor with 1 parameter");
	}
	
	Constructer(int i,int j){
		System.out.println("Constructor with 2 parameter");
	}
	Constructer(int i, String g , int w){
		System.out.println("Constructor with 3 parameter");
	}
	Constructer(String name,double marks){
		System.out.println("Constructer with String and double parameter:" + name + "," + marks);
	}
	public static void main(String[] args) {
		//Constructer c=new Constructer(9,"abvch");
		Constructer c1=new Constructer(7,9);
		Constructer c2=new Constructer(5);
		Constructer c3=new Constructer(7,7);
		Constructer c4=new Constructer("Abhishek",9.8);
	}

}
