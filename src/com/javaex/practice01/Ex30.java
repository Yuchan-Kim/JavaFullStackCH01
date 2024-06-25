package com.javaex.practice01;

import java.util.Scanner;

public class Ex30 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하세요: ");
		final double mile = 1.609;
		double mileChange = sc.nextDouble();
		System.out.println(mileChange + "마일은 " + (mileChange*mile) + "킬로미터 입니다.");

		sc.close();
	}
}
