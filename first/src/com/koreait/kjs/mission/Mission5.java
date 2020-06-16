package com.koreait.kjs.mission;

import java.util.Scanner;

public class Mission5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 (0~100)>>> ");
		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}else if (score >= 97) {
			System.out.println("A+");
		}else if (score <= 93){
			System.out.println("A-");
		}
	
		if((score >= 80) && (score < 90)) {
			System.out.println("B");
		}else if (score >= 87) {
			System.out.println("B+");
		}else if (score <= 83){
			System.out.println("B-");
		}
		
	}
}
