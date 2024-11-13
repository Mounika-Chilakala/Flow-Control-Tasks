package com.flowcontroltasks;

import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if(year%100!=0 && year%400==0 && year%4==0){
			System.out.println("The given year is leap year");
		}
		else {
			System.out.println("The given year is not a leap year");
		}
	}

}
