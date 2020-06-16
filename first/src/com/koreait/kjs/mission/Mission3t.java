package com.koreait.kjs.mission;

import java.util.Scanner;

public class Mission3t {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해주세요(남/여) >>> ");
		String gender = scan.next();
		System.out.print("키를 입력해주세요 >>> ");
		int height = scan.nextInt();
		
		if("남".equals(gender)) {
			
			if(height > 160) {
				System.out.println("평균 초과입니다.");
			} else if(height < 160) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
			
		} else if ("여".equals(gender)) {
			if(height > 150) {
				System.out.println("평균 초과입니다.");
			} else if(height <150) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}		
		} else {
			System.out.println("성별을 잘 못 입력하셨습니다.");		
		}
	}

}
