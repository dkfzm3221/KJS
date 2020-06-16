package com.koreait.kjs.mission;

public class Mission6_4 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int r = 2; r < 10; r++) {
				System.out.printf("%d * %d = %d\t", r, i, (i * r));
			}
			System.out.println();
		}
	}

}
