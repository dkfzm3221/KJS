package com.koreait.kjs2.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	private List<Card> arr;

	public Gamer() {
		arr = new LinkedList(); // ArrayList(); 상관x
	}

	public void receiveCard(Card card) {
		arr.add(card);
	}

	public void openCards() {
		int point = 0;
		for (Card c : arr) {
			System.out.println(c);
		}
		System.out.printf("점수 : %d\n", getTotalPoint());

	}

	public int getTotalPoint() {
		int point = 0;

		for (Card c : arr) {
			point += c.getPoint();
		}
		return point;
	}
	public void moreCards(CardDeck cd) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			this.openCards();
			System.out.println("카드를 더 받으시겠습니까? (y/n)>>> ");
			
			String answer = scan.nextLine();
			
			if(answer.equals("n")) {
				break;
			}else if(answer.equals("y")) {
				receiveCard(cd.getCard());	
			}else {
				System.out.println("잘 못입력하셨습니다.");
				
			}
		
		}
		
}


	
	
	
	
	
	
	
	
	
}





