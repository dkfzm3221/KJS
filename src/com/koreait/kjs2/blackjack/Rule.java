package com.koreait.kjs2.blackjack;

public class Rule {
	
	
	
	
	public static void whoIsWin(Gamer g, Dealer d) {
		
		int lastPoint = 21;
		int gamer = g.getTotalPoint();
		int dealer = d.getTotalPoint();
		
		
		
		if(gamer == dealer || (gamer > lastPoint && dealer >= lastPoint)) {
			System.out.println("비김");
		}else if(gamer <= lastPoint && gamer > dealer || dealer > lastPoint) {
			System.out.println("게이머 승");
		}else{
			System.out.println("딜러 승 ");
		}
		
	}

}
