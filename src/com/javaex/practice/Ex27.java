package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {
	public static void main (String[] args) {
		final double PI = 3.14;
		System.out.print("반지름을 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		
		System.out.println("원의 넓이는 " + (PI*radius*radius));
		sc.close();
	}
}
