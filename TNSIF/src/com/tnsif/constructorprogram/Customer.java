package com.tnsif.constructorprogram;

public class Customer {
    private String Customnername;
	
	private String customeradress;
	
	private int customerid;
	
	//default constructor
	public Customer() {
		
	}
	
	//parameter constructor

	public Customer(String customnername, String customeradress, int customerid) {
		
		Customnername = customnername;
		this.customeradress = customeradress;
		this.customerid = customerid;
	}
	// getter and setter methods

	public String getCustomnername() {
		return Customnername;
	}

	public void setCustomnername(String customnername) {
		Customnername = customnername;
	}

	public String getCustomeradress() {
		return customeradress;
	}

	public void setCustomeradress(String customeradress) {
		this.customeradress = customeradress;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	@Override
	public String toString() {
		return "Customer [Customnername=" + Customnername + ", customeradress=" + customeradress + ", customerid="
				+ customerid + "]";
	}
	
}
