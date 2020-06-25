package com.koreait.kjs.level3;

import java.util.Arrays;

public class Baseball {
	private int[] rArr;

	public Baseball(int num) {
		rArr = new int[num];
		setRandom();
	}

	private void setRandom() {
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * 9 + 1);
				
			for(int z = 0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
	}
	public int get(int idx) {
		return rArr[idx];
	}
	
}

















