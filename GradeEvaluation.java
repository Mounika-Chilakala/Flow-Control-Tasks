package com.flowcontroltasks;

import java.util.Scanner;

public class GradeEvaluation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student score:");
		int score=sc.nextInt();
		if(score>89 && score<=100) {
			System.out.println("Grade is:A");
		}
		else if(score>79 && score<=89) {
			System.out.println("Grade is:B");
		}
		else if(score>69 && score<=79) {
			System.out.println("Grade is:C");
		}
		else if(score>59 && score<=69) {
			System.out.println("Grade is:D");
		}
		else {
			System.out.println("Grade is:F");
		}
	}

}
