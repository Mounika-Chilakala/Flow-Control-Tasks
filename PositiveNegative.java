package com.flowcontroltasks;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		if(num==0) {
			System.out.println("The given number is zero");
		}
		else if(num>0) {
			System.out.println("The given number is positive");
		}
		else {
			System.out.println("The given number is negative");
		}
	}

}
