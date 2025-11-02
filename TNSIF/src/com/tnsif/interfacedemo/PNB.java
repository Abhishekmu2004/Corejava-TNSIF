package com.tnsif.interfacedemo;

public class PNB implements Bank{

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 5.6f;
	}
	public static void main(String[] args) {
		//PNB p=new PNB();
		Bank b=new PNB();
		System.out.println(b.rateofinterest());
	}

}