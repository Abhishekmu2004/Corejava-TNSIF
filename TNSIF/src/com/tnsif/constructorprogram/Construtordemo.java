package com.tnsif.constructorprogram;
import java.util.Scanner;

public class Construtordemo {

	public static void main(String[] args) {
	
       Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the address");
		String address=sc.next();
		
		System.out.println("enter the id");
		int cid=sc.nextInt();
		
		Customer c=new Customer();
		c.setCustomnername(name);
		c.setCustomeradress(address);
		c.setCustomerid(cid);
		
		System.out.println(c);
	}

}
