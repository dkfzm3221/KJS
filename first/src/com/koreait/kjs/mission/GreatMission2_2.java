package com.koreait.kjs.mission;

import java.util.Scanner;

public class GreatMission2_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] Menu = {"사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유"};
		int[] Price = {500, 600, 700, 800, 400, 400};
		int TotalPrice = 0;
		
		System.out.println("-메뉴-");
		for(int i=0; i<Menu.length; i++) {
			System.out.printf("%d.%s(%d원)\n", (i+1),Menu[i],Price[i]);
		}
		
		while(true) {
			System.out.println("메뉴를 선택하세요: (종료:0)");
			int num = scan.nextInt();
			
			if(num == 0) {
				System.out.printf("종료! %d원 사용\n", TotalPrice);
				break;
			} else if(num < 0 || num>Menu.length) {
				
			}
		}
	
	}

}
