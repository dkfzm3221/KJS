package com.koreait.kjs2.cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
	private List<MenuItem> menus = new ArrayList();

	public Menu() {
		menus.add(new MenuItem("아메리카노", 1500));
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카페라떼", 2500));
		menus.add(new MenuItem("녹차라떼", 3000));

	}

	public void showMenus() {
		System.out.println("-메뉴-");
		for (int i = 0; i < menus.size(); i++) {
			MenuItem m = menus.get(i);
			System.out.println(m);
		}
		System.out.println();

	}

	public MenuItem choose(int number) {
		return menus.get(number);
	}

}
