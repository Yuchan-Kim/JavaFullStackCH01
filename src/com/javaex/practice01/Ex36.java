package com.javaex.practice01;

import java.util.Scanner;

public class Ex36 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int coin1 = sc.nextInt() * 500;
		System.out.print("100원 개수: ");
		int coin2 = sc.nextInt() * 100;
		System.out.print("50원 개수: ");
		int coin3 = sc.nextInt() * 50;
		System.out.print("10원 개수: ");
		int coin4 = sc.nextInt() * 10;
		System.out.print("동전의 총합은 " + (coin1+coin2+coin3+coin4) + "원 입니다.");
		sc.close();
	}

}
