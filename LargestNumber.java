package com.flowcontroltasks;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int fnum=sc.nextInt();
		System.out.println("Enter the second number:");
		int snum=sc.nextInt();
		System.out.println("Enter the third number:");
		int tnum=sc.nextInt();
		if(fnum > snum && fnum > tnum) {
			System.out.println("The largest number is:"+fnum);
		}
		else if(snum > fnum && snum > tnum) {
			System.out.println("The largest number is:"+snum);
		}
		else {
			System.out.println("The largest number is:"+tnum);
		}
	}

}
