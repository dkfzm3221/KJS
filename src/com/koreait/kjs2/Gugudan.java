package com.koreait.kjs2;

import java.util.Arrays;

public class Gugudan {

	public static void main(String[] args) {
//		gugudan(2, 5);

		int sum = sum(1, 2);// 3
		sum = sum(1, 2, 3);// 6
		sum = sum(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12);// 다 더한값

		int result = Utils.parseStringToInt("10", 0); // 10 정수값 리턴

		result = Utils.parseStringToInt("aa10", 1); // 파싱할 수 없을 때 두번째 인자값 리턴
		result = Utils.parseStringToInt("aa10");// 0으로 리턴
		result = Utils.parseStringToInt("9");// 9나오게

		int[] arr = { 4, 5, 11, 223, 3, 10 };

		Utils.sortASC(arr); // 오름차순 정렬
		Utils.printArr(arr);// [3,4,5,10,11,223]
		Utils.sortDESC(arr); // 내림차순 정렬
		Utils.printArr(arr);// [223,11,10,5,4,3]

//		int[] rArr = Utils.createRandomArr(1, 9, 5);
//		Utils.printArr(rArr);
		// 1~9 랜덤한 값을 5칸 가지는 정수형 배열을 리턴하시오

		int[] rArr = Utils.createRandomArrNoDuplication(3, 7, 7);
		Utils.printArr(rArr);

		// 랜덤한 숫자가 나올 수 있는 범위보다 큰 칸을 요구하는 경우 null을 리턴
//		rArr = Utils.createRandomArrNoDuplication(5, 15, 13);
//		Utils.printArr(rArr);// null이 넘어오면 "arr is null"을 출력
		
		String star = makeStarTriangle(5);
		System.out.println(star);
		
		//*
		//**
		//***
		//****
		//***** 출력

	}
		


		public static String makeStarTriangle(int star) {
		
			String str = "";
			for(int i=0; i<star; i++) {
				for(int z=0; z<=i; z++) {
					str += "*";
				}
				str +="\n";
			}
			return str;
			
	}











	//	public static void gugudan(int dan, int dan2) {
//		for (int i = dan; i <= dan2; i++) {
//			for (int z = 1; z < 10; z++) {
//				if ((i * z) % 2 == 0) {
//					System.out.printf("%d * %d = %d\n", i, z, i * z);
//				}
//
//			}
////결과 값이 짝수만 출력
//			System.out.println();
//		}
//
//	}
	public static int sum(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;

		}
		System.out.println(sum);

		return sum;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
