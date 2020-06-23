package com.koreait.kjs.level3;

import java.util.Arrays;

public class MyListTest { //class 앞에 public을 붙이고 싶으면 class 이름이 같아야함
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(30);
		list.add(80);
		
		int len = list.size(); //2
		int val = list.get(1); //15
		val = list.get(0); // 10
		
		
		list.remove();
	
	}

}

class MyList {
	private int[] arr;
	private Object list;
	
	MyList(){
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
	void remove() {
		int [] rm = new int [arr.length-1];
		for(int i = 0; i<arr.length-1; i++) {
			rm[i] = arr[i];
		}
		arr = rm;
		
		System.out.println(Arrays.toString(arr));
	}
	
	void add(int num) {
		int [] temp = new int[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		
		}
		temp[arr.length] = num;
		
		arr = temp;  
		
		System.out.println(Arrays.toString(arr));
		
		
	
	}
	
	
	
}










