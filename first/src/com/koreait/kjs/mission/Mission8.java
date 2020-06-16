package com.koreait.kjs.mission;

import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 10;
		int max = 80;
		System.out.printf("랜덤값 %d~%d을 맞추는 게임~\n", min, max);
		int r = (int) (Math.random() * (max-(min+1)) + min);
		while (true) {
			System.out.printf("랜덤값 %d~%d을 입력해주세요>>>> \n", min , max);
			int c = scan.nextInt();
			if (r == c) {
				System.out.println("Great~!");
				break;
			} else if (r > c) {
				System.out.println("Up");
			} else {
				System.out.println("Down");
			}
		}
	}
}
