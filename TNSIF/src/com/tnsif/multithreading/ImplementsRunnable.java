package com.tnsif.multithreading;
// implementing runnable interface

class Eclipse1 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("eclipse id"+" "+Thread.currentThread().getId());
		}
	}
}


public class ImplementsRunnable {
	public static void main(String[] args) {
	Eclipse1 e=new Eclipse1();
	Thread t=new Thread(e);
	t.start();
	System.out.println("main method id"+" "+Thread.currentThread().getId());
}
}