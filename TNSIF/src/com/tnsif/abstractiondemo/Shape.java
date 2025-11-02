package com.tnsif.abstractiondemo;
// demo for abstraction
public abstract class Shape {
	
	protected float area; 
	
	abstract void calarea();// abstract method

	void show() {
		System.out.println("area of shape "+area);
	}
}
