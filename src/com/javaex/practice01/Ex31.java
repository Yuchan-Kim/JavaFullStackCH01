package com.javaex.practice01;

import java.util.Scanner;

public class Ex31 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		int price = sc.nextInt();
		System.out.print("상품가격: ");
		int earnedMoney = sc.nextInt();
		
		System.out.println("============================");
		System.out.println("받은돈: " + (double)earnedMoney );
		System.out.println("상품가격: " + (double)price);
		System.out.println("부가: " + ((double)price *0.1));
		System.out.println("잔액: " + ((double)earnedMoney - price));
		
		sc.close();
	}
}
