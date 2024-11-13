package com.flowcontroltasks;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		int a=0,b=1,fib;
		for(int i=1;i<=n;i++) {
			fib=a+b;
			a=b;
			b=fib;
			System.out.println(fib);
		}
	}

}
