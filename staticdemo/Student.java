package com.tnsif.staticdemo;
//demo for static method
public class Student {
	int rollno;
	String name;
	static String college="RV";
	//static method change value
	static void change() {
		college="VKIT";
	
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void displsy() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		
		Student.change();
		Student s=new Student(1,"manoj");
		Student s1=new Student(2,"abhi");
		Student s2=new Student(3,"ravi");
		s1.displsy();
		s2.displsy();
		s.displsy();
	}

}
