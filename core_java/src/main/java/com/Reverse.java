package com;

public class Reverse {

	public static void main(String[] args) {
		int n = 345678, rev = 0;  
		while(n != 0)   
		{  
		int remainder = n % 10;  
		rev = rev * 10 + remainder;  
		n = n/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);
	}

}
