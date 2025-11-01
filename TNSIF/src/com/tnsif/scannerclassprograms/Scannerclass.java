package com.tnsif.scannerclassprograms;
import java.util.Scanner;

//demo for scanner class
public class Scannerclass {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		
	System.out.println("enter the id");
	int	eid=sc.nextInt();
	System.out.println("id number:"+ eid);
	System.out.println("enter the name");
	String name=sc.next();
	System.out.println("name of the emp :" +name);
	}
	
}
