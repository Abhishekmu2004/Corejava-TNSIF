package com.tnsif.scannerclassprograms;

public class Taxcalculation {

	public void Caluculatetax(Person p) {
		if(p.getIncome()<=1600) {
			p.setTax(0);
		}
		else if(p.getIncome()>1600 && p.getIncome()<50000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}
}
