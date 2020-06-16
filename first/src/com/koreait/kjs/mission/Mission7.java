package com.koreait.kjs.mission;

import java.util.Scanner;

public class Mission7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sum = 0;
		while (true) {
			System.out.println("숫자를 입력해주세요 >>> ");
			int num = scan.nextInt();
			sum = num + sum;
			if (num == 0) {
				break;
			}
		}
		System.out.println("합계 >>> " + sum);
	}
}