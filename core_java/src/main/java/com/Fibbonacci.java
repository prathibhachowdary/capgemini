package com;

public class Fibbonacci {

	public static void main(String[] args) {
		int a=0,b=1,c,i,n=15;
		System.out.println(a+" "+b );
		for(i=2;i<n;++i)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
