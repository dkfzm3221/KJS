package com.koreait.kjs;

public class Printf {

	public static void main(String[] args) {
		String name = "김재섭";
		int age = 27;
		float vision = 0.8f;
		String bloodType = "AB";
		
		System.out.println("나의 이름은 " + name + "입니다" + " 나이는" + age + " 입니다."
				+ " 시력은" + vision + "입니다." + "혈액형은 " + bloodType + "입니다.");
		
		System.out.printf("나의 이름은 %s 입니다.나이는%,d시력은%.1f입니다.혈액형은 %s입니다.\n",
				name, age, vision, bloodType);
		
		
		char v1 = '0';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		int v2 = 57;
		System.out.printf("%c : %d\n", (char)v2, v2);

	}

}
