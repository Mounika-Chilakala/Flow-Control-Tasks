package com.flowcontroltasks;

import java.util.Scanner;

public class SumOfNaturalNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			sum=sum+i;
			
		}
		System.out.println("Sum of Natural numbers is:"+sum);
	}

}
