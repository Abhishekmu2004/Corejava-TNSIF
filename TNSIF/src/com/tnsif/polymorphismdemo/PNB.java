package com.tnsif.polymorphismdemo;

public class PNB extends RBI {
	@Override
	float rateofinterest () {
		return 7.8f;
	}

	public static void main(String[] args) {
		PNB p=new PNB();
		System.out.println(p.rateofinterest ());

	}

}
