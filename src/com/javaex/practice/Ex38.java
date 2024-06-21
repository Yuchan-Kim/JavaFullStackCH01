package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전체금액을 입력해주세요: ");
		int amount = sc.nextInt();
		int rightAmount = (amount/1000) * 1000;
		System.out.println("실제지불금액은 " + rightAmount + " 입니다.");
	}
}
