package com.koreait.kjs.mission;

public class Mission6_7 {
	public static void main(String[] args) {
		int star = 8;

		for (int i = 1; i <= star; i++) {
			for (int r = star; r > 0; r--) {
				if (i < r) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
