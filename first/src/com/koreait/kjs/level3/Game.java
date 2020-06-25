package com.koreait.kjs.level3;

public class Game {
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		
		do {
			myBall.setNumbers();
		}while(Checker.check(gameCnt, ball, myBall));
		
		System.out.println("게임 종료!");
		
		//숫자1:3
	}
}
