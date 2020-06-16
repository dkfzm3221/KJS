package com.koreait.kjs.mission;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요 (남1/여2)>>> ");
		System.out.println("키를 입력해주세요 >>> ");
		int g = scan.nextInt();
		int t = scan.nextInt();
		
		if(g == 1 && t < 160) {
			System.out.println("평균 미만입니다.");
		}else if(g == 1 && t == 160){
			System.out.println("평균입니다.");
		}else if(g == 1 && t > 160) {
			System.out.println("평균 초과입니다.");
		}
		if(g == 2 && t < 150) {
			System.out.println("평균 미만입니다.");
		}else if(g == 2 && t == 150) {
			System.out.println("평균 입니다.");
		}else if(g == 2 && t > 150) {
			System.out.println("평균 초과입니다.");
		}
		
	}

}
