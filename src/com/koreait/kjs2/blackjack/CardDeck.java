package com.koreait.kjs2.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList();
	//<> 제네릭 - 제약을 건다. 
	CardDeck() {
		init();
	}

	private void init() {
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int z = 1; z <= 13; z++) {
//				arr.add(new Card(Card.PATTERNS[i],getDeno(z)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(z);
				int point = getPoint(z);
				Card c = new Card(pattern, deno, point);
				arr.add(c);

			}

		}

	}

//	private int getPoint(int point) {
//		switch(point) {
//		case 11:
//			return 10;
//		case 12:
//			return 10;
//		case 13:
//			return 10;
//		default:
//			return point;
//				
//		}
//		
//		
//	}
	private int getPoint(int num) {
		return num > 10 ? 10 : num;
	}//if문과 유사 num이 10보다 크면 10을 출력 작으면 num값을 출력

	private String getDeno(int num) {
		switch (num) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return String.valueOf(num);
		}
	}

	@Override
	public String toString() {
		for (Card c : arr) {
			System.out.println(c);
		}
		return "";
	}

	public Card getCard() {
		int ran = (int) (Math.random() * arr.size());
		return arr.remove(ran);
	}

}
