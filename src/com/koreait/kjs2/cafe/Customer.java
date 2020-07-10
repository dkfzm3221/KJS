package com.koreait.kjs2.cafe;

import java.util.Scanner;

public class Customer {

	public MenuItem order(Menu menu) {
		menu.showMenus();
		Scanner scan = new Scanner(System.in);

		MenuItem mi = null;

		while (mi == null) {
			try {
				System.out.println("메뉴 번호를 입력해 주세요 : ");
				String menuNo = scan.nextLine();
				int intMenuNo = Integer.parseInt(menuNo);
				return menu.choose(intMenuNo - 1);
			} catch (NumberFormatException e) {
				System.out.println("숫자 입력");
			} catch (Exception e) {
				System.out.println("메뉴를 잘못 선택");
			}
		}
		scan.close();
		return mi;
	}

	public static void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getName() + "를 마신다");

	}

}
