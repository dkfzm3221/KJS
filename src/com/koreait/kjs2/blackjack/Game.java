package com.koreait.kjs2.blackjack;

public class Game {

	public static void main(String[] args) {

		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();

		for (int i = 0; i < 2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		dealer.openCards();
		Rule.whoIsWin(gamer, dealer);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Card card = cd.getCard();
//		
//		dealer.receiveCard(cd.getCard());
//		dealer.receiveCard(cd.getCard());
//		dealer.moreCards(cd);
//		dealer.openCards();

//		gamer.receiveCard(card);
//		gamer.receiveCard(cd.getCard());
//		gamer.receiveCard(cd.getCard());
//		gamer.receiveCard(cd.getCard());
//		gamer.receiveCard(cd.getCard());
//		gamer.openCards();

//		Rule.whoIsWin(gamer,dealer);

//		Card c = cd.getCard();//랜덤한 카드를 1장 리턴 and 카드덱에서 삭제
//		System.out.println(c);
//		System.out.println(cd);
	}

}
