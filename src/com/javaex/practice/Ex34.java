package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨;: ");
		double temperature = sc.nextDouble();
		System.out.println("화씨 " +temperature + "의 섭씨온도는 " + ((double)5/9 * (temperature-32)) + "입니다. ");
		sc. close();
	}
}
