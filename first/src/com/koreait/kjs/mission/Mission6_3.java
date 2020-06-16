package com.koreait.kjs.mission;

public class Mission6_3 {
	public static void main(String[] args) {
		
		for(int i = 2; i<10; i++) {
			for(int r = 1; r<10; r++) {
				System.out.printf("%d * %d = %d\n",i, r, (i*r));
			}
			System.out.println("------------------");
		}
	}
}
