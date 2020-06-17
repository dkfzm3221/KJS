package com.koreait.kjs.mission;

import java.util.Scanner;

public class GreatMission2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] menu = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유" };
		int[] won = { 500, 600, 700, 800, 400, 400 };
		boolean trueFalse = true;
		int ex = 0;
		int sum = 0;

		System.out.println("-메뉴-");
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("%d. %s(%d원)\n", (i + 1), menu[i], won[i]);
		}

		while (trueFalse) {
			System.out.println("메뉴를 선택하세요(종료 : 0) : ");
			int select = scan.nextInt();

			if (select == ex) {
				trueFalse = false;
			} else if (select > ex && select < menu.length + 1) {
				System.out.printf("%s : %d원\n", menu[select - 1], won[select - 1]);
				sum += won[select - 1];
			} else {
				System.out.println("잘못 입력!");
			}
		}
		System.out.printf("합계 : %,d원", sum);

	}
}
