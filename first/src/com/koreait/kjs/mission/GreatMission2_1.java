package com.koreait.kjs.mission;

import java.util.Scanner;

public class GreatMission2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] menu = {"사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유"};
		int[] won = {500, 600, 700, 800, 400, 400};
		
		System.out.println("-메뉴-");
		for(int i=0; i<menu.length; i++) {
			System.out.printf("%d.%s(%d원)\n", (i+i),menu[i],won[i]);
		}
		int sum = 0;
		while(true) {
			int idx = scan.nextInt();
			if(idx == 0) {
				break;
			}
		}
		scan.close();
		System.out.printf("종료! %,d원 사용\n", sum);

	}

}
