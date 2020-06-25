package com.koreait.kjs.level3;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner scan;

	public MyBall(int num) {
		init(num);
	}

	private void init(int num) {
		myArr = new int[num];
		scan = new Scanner(System.in);

	}

	void setNumbers() {
		System.out.println("숫자를 입력하세요 >>> ");
		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("숫자%d: ", i + 1);
			String val = scan.nextLine();
			try {
				myArr[i] = Integer.parseInt(val);
			} catch (Exception e) {
				myArr[i] = 0;
			}
			if (myArr[i] < 1 || myArr[i] > 9) {
				System.out.println("1~9 값만 입력해주세요");
				i--;
			}
			for (int z = 0; z < i; z++) {
				if (myArr[i] == myArr[z]) {
					System.out.println("중복된 값이 존재합니다.");
					i--;
					break;

				}
			}
		}
		System.out.println(Arrays.toString(myArr));

	}
	public int get(int idx) {
		return myArr[idx];
	}
}




















