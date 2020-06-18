package com.koreait.kjs.mission;

public class MethodMission1 {
	public static void main(String[] args) {
		guguDan(2);
		guguDan(3);
		
		guguDan(4, 9);

	}
	public static void guguDan(int sDan, int eDan) {
		for(int i = sDan; i < eDan+1; i++) {
			guguDan(i);
		}

	}

	public static void guguDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
		System.out.println();

	}
}
//똑같은 메소드 사용할수있는 기법 오버로딩