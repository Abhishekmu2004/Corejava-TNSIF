package com.tnsif.staticdemo;
//demo for static variables
public class Employee {
	int eid;
	String name;
	static String companyname="TNSIF";
  //constructor
	Employee(int e, String n){
		eid =e;
		name=n;
	}
	void display() {
		System.out.println(eid+" "+name+" "+companyname);
	}
	public static void main(String[] args) {
		Employee e1=new Employee(1,"abhi");
		Employee e2=new Employee(2,"chetu");
		
		e1.display();
		e2.display();
		

	}

}
