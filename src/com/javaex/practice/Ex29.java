package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요: ");
		double width = sc.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double legnth = sc.nextDouble();
		
		System.out.print("사각형의 넓이는: " + (width*legnth));
		System.out.print("사각형의 둘레는: " + (2*width+2*legnth));
		
		sc.close();
	}
}
