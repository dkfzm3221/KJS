package com.koreait.kjs.level3;

import java.util.*;

public class MyListTest { // class 앞에 public을 붙이고 싶으면 class 이름이 같아야함
	public static void main(String[] args) {
		MyList list = new MyList();
		// list.add(10);
		// list.add(30);
		// list.add(40);
		// list.add(12);
		// list.add(2, 100); // 10, 15, 20 > 10, 30, 100, 15, 20
		list.add(10);
		list.add(1200);
		list.add(15);
//		int delVal = list.remove(2);
//		System.out.println(delVal);
		// int delVal = list.remove(); // 지우는 값을 리턴(20)
//		MyArrays.print(list); // [10, 1200, 15] 출력되도록
		String str = MyArrays.toString(list);
		System.out.println("str : " + str);

		int len = list.size(); // 2
		int val = list.get(1); // 15
		val = list.get(0); // 10

	}

}

class MyArrays {

//	static void print(MyList list) {
//		System.out.print("[");
//		for(int i = 0; i<list.size(); i++) {
//			System.out.printf(i < list.size() -1 ? "%d, " : "%d]", list.get(i));
//			
//		}
//	}
	static String toString(MyList list) {
		String str = "";
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) {
				str += ", ";
			}
			str += list.get(i);
		}
		return String.format("[%s]", str);
	}

}

class MyList {
	private int[] arr;
	private Object list;

	MyList() {
		init();
	}

	private void init() {
		arr = new int[0];
	}

	int size() {
		return arr.length;
	}

	int get(int num) {
		return arr[num];
	}

	void add(int idx, int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i < idx ? i : i + 1] = arr[i];
			temp[(i < idx) ? i : i + 1] = arr[i];
		}
		temp[idx] = num;
		arr = temp;

	}

	int remove(int idx) {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < temp.length - 1; i++) {
			if (i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i - 1] = arr[i];
			}

		}
		int delVal = arr[idx];
		arr = temp;
		return delVal;

	}

	int remove() {
		return remove(arr.length - 1);

	}

	void add(int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];

		}
		temp[arr.length] = num;

		arr = temp;

		System.out.println(Arrays.toString(arr));

	}

//	void add(int idx, int num) {
//		int[] temp = new int[arr.length + 1];
//		for (int i = 0; i < arr.length; i++) {
//			if (i < idx) {
//				temp[i] = arr[i];
//			} else {
//				temp[i + 1] = arr[i];
//			}
//
//		}
//		temp[idx] = num;
//		arr = temp;
//
//		System.out.println(Arrays.toString(arr));
//
//	}

}
