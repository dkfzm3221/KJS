package com.koreait.kjs2;

import java.util.Arrays;

public class Utils {

	public static int parseStringToInt(String s, int a) {
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
		}
		return a;

	}

	public static int parseStringToInt(String s) {
		return parseStringToInt(s, 0);
	}

	public static void sortASC(int[] arr) {
		sort(arr, true);

	}

	public static void sortDESC(int[] arr) {
		sort(arr, false);
	}

	private static void sort(int[] arr, boolean asc) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int z = i + 1; z < arr.length; z++) {
				if (asc == (arr[i] > arr[z])) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}

			}

		}

	}

	public static void printArr(int[] arr) {
		if(arr == null) {
			System.out.println("arr is null");
		}else {
			System.out.println(Arrays.toString(arr));
		}
		
	}

	public static int[] createRandomArr(int a, int b, int c) {
		int[] rArr = new int[c];

		for (int i = 0; i < c; i++) {
			rArr[i] = (int) (Math.random() * ((b-a)+1) + a);
		}
		return rArr;
	}

	public static int[] createRandomArrNoDuplication(int a, int b, int c) {
		
		int[] rArr = new int[c];
		if((b-a+1)<c) {
			return null;
		} 		
		for(int i=0; i<c; i++) {
				
				rArr[i] = (int) (Math.random() * ((b-a)+1) + a);
				for(int z=0; z<i; z++) {
					if(rArr[i]==rArr[z]) {
						i--;
						break;
					}
				} 
			} 
		 return rArr;	
	}
}	

	




