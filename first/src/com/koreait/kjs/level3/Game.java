package com.koreait.kjs.level3;

public class Game {
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(4);
		int val = ball.get(0);
		
		MyBall myBall = new MyBall(gameCnt);
		myBall.setNumbers();
		
		do {
			myBall.setNumbers();
		}while(Checker.check(gameCnt, ball, myBall));
		
		//숫자1:3
	}
}
