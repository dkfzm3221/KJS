package com.koreait.kjs.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();//<Integer>
		list.add(1);//1을 늘림
		list.add(2);
		list.add(3);
		
		list.add(2, 11);//2번째 자리에 11을 넣고 뒤로 밀려남
		
		list.remove(list.size() - 1);//마지막걸 지우겠다 2번쓰면 2번지운다.
		
		int value = list.get(2);
		System.out.println(value);
		//기본적으로 Object로 받음
		
//		for(int i=0; i<list.size(); i++) {
//			int val = (int)list.get(i);//강제형변환을 하기싫으면 <Integer>을 넣음
//			System.out.print(val + ", ");
//		}
		for(Object val : list) {
			System.out.print((int)val + ", ");//인덱스를 쓸수없음
		}
	}
}



//Object 는 최상위 부모
//Objcet obj = 1;
//obj = "aa";
//obj = 1.1; 다 사용가능 그러나 강제형변환이 필요함





