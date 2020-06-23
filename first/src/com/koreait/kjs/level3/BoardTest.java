package com.koreait.kjs.level3;

public class BoardTest {
	public static void main(String[] args) {
		BoardVO bv1 = new BoardVO("제목1", "내용1", 1);
		
		BoardVO bv2 = new BoardVO();
		bv2.setTitle("제목");
		bv2.setContent("내용");
		bv2.setWriteId(2);
		
		System.out.println("bv2 제목 : " + bv2.getTitle());
	
				
	}
	
	
}

//            접근지시어                     \\
// private : 같은 class 안에서만 사용가능
// default : private + 같은 package에서만 상속가능
// protected : default + 상속관계에서만 상속가능
// public :
// 생성자 값이 없을때