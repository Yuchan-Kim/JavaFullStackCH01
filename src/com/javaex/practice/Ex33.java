package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		System.out.print("구의 부피는: " + ((double)4/3*3.14*(radius*radius*radius)) + "입니다.");
		sc.close();
		
	}
}
