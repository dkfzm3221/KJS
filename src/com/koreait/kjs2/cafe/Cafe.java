package com.koreait.kjs2.cafe;

public class Cafe {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bas = new Barista();
		
		
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
		
		cus.drinkCoffee(coffee);
		
		
		
		
		
//		Menu menu = new Menu();
//		menu.showMenus();
//
//		Customer cus = new Customer();
//
//		
//		MenuItem mi = cus.order(menu);
//		System.out.println(mi);
//		
//		
//		Coffee coffee = new Coffee(mi);
//		 
//		
		
		
		
		
		
		
//		MenuItem mi = menu.choose(3);
//		System.out.println(mi);
	}

}
