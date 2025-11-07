package com.tnsif.multithreading;

public class T extends Thread{
 	Example e;
	T(Example e){
 	this.e=e;
	}
	public void run() {
		Example.display();
	}

}