package com.tnsif.multithreading;
// demo extending thread class

class Eclipse extends Thread{
	public void run() {
		System.out.println("eclipse id"+" "+Thread.currentThread().getId());
	}
	
}
class Notepad  extends Thread{
	public void run() {
		System.out.println("notepad id"+" "+Thread.currentThread().getId());
	}
}

class Onenote  extends Thread{
	public void run() {
		System.out.println("onenote id"+" "+Thread.currentThread().getId());
	}
}

public class Extendingthread {
	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		e.start();
		Notepad  n=new Notepad ();
		n.start();
		Onenote o=new Onenote();
		o.start();
		System.out.println("main method id"+" "+Thread.currentThread().getId());
	}

}