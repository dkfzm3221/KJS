package com.koreait.kjs.mission;

public class MathodMission2 {
	public static void main(String[] args) {
	//	printStar(6);
	//	printStar(3);
	//	printStarSqure(4);
	//	printStarTriangle(5);
		printStarTriangleReverse(5);
		
	}
	public static void printStar(int printStar) {
		for(int i = 0; i<printStar; i++) {
		
			System.out.print("*");
		}
			System.out.println();
	}
	public static void  printStarSqure(int sq) {
		for(int i = 0; i<sq; i++) {
			printStar(sq);
		}
	}
	
	public static void printStarTriangle(int st) {
		for(int i = 1; i <= st ; i++) {
			printStar(i);
		}
	}
	public static void printStarTriangleReverse(int sr) {
		for(int i = sr-1; i>=0; i--) {
			printChar(' ', i);
			printStar(sr-1);
			
		
		}
	}
	public static void printChar(char ch, int cnt) {
		for(int i = 0; i<cnt; i++) {
			System.out.println(ch);
		}
	}
	
}
