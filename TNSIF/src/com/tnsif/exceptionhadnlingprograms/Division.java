package com.tnsif.exceptionhadnlingprograms;
import java.util.InputMismatchException;

public class Division {
	
	public static void divide() {  // method
		int a=6,b=0,c;
		try {
			c=a/b;
			System.out.println("division "+c);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught"+e.getMessage());
		}
     	catch(ArithmeticException d) {
 			System.out.println(d);	
 	}
		catch(InputMismatchException u) {
			System.out.println("exception caught"+u.getMessage());
		}
		catch(Exception f) {
			System.out.println(f);
		}
		
	}

}