package com.koreait.kjs.level2;

public class Method1 {
	public static void main(String[] args) {
		//main = method 이름 void = 리턴타입 (String[] args) = 매개변수(파라미터)
		//void main(String[] args) = method 선언부   {    } = method 구현부 
		//void형 = 결과없음 바로 출력 / not void형 =  결과가 일반변수이거나 주소값, 타입을 가짐
		
		sum(10,15); //이름옆에 ()소괄호가 있다면 method와 연관 /타입을 맞춰야함 / 원래는 Method1.sum(10,15);로 적어야 하나 같은파일이라 상관x
		//static이 없으면
		//Method1 me = new Method1();
		//me1.sum(15, 10); 이런식으로
		//소스를 효율적으로 만들 수 있다.(중복된 소스 줄일수있음)
		//중복된 소스는 죄!
		
		minus(20, 5);
		
		
		
	}
	//이곳에 method 정의 /method 안에는 method가 들어갈수 없음
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
		//return; 자동으로 들어감
	}
	
	public static void minus(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	
	
	
	
	
	
	
	
	
	
	
}
