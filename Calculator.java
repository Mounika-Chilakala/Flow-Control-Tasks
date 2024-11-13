package com.flowcontroltasks;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int operation=sc.nextInt();
		switch(operation) {
		case 1:
			System.out.println("Enter the first number:");
			int fnum=sc.nextInt();
			System.out.println("Enter the second number:");
			int snum=sc.nextInt();
			System.out.println("Addition of two numbers is:"+(fnum+snum));
			break;
		case 2:
			System.out.println("Enter the first number:");
			int fnum2=sc.nextInt();
			System.out.println("Enter the second number:");
			int snum2=sc.nextInt();
			System.out.println("Substraction of two numbers is:"+(fnum2-snum2));
			break;
		case 3:
			System.out.println("Enter the first number:");
			int fnum3=sc.nextInt();
			System.out.println("Enter the second number:");
			int snum3=sc.nextInt();
			System.out.println("Multiplication of two numbers is:"+(fnum3*snum3));
			break;
		case 4:
			System.out.println("Enter the first number:");
			int fnum4=sc.nextInt();
			System.out.println("Enter the second number:");
			int snum4=sc.nextInt();
			System.out.println("Division of two numbers is:"+(fnum4/snum4));
			break;
			default:
				System.out.println("Please enter valid input");
				break;
		}
	}

}
