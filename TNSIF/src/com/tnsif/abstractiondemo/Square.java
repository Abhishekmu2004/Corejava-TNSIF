package com.tnsif.abstractiondemo;

public class Square extends Shape{
	
	private float side;
	public Square() {
		side=4.0f;
	}

	public Square(float side) {
		this.side=side;
	}
	@Override
	void calarea() {
		super.area=side*side;
		
	}
	public static void main(String[] args) {
		Square s=new Square(2.0f);
		s.calarea();
		s.show();
	}

}