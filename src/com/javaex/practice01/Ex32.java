package com.javaex.practice01;

import java.util.Scanner;

public class Ex32 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로:    ");
		double width = sc.nextDouble();
		System.out.print("세로:    ");
		double length = sc.nextDouble();
		System.out.print("삼각형의 넓이는 " + (0.5*width*length) + " 입니다.");
		sc.close();
	}
}
