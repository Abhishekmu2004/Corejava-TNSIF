package com.tnsif.exceptionhadnlingprograms;
import java.io.IOException;

//demo for throw keyword

public class Throwdemo {
	
	void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("you are not eligibale");
		}
		else {
			System.out.println("you are eligibale");
		}
	}
	public static void main(String[] args) {
		Throwdemo t=new Throwdemo();
		t.validate(9);

	}

}
