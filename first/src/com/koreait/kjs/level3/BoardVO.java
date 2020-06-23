package com.koreait.kjs.level3;

public class BoardVO {
	private String title; 
	private String content;
	private int writeId;
	
	public BoardVO() {}
	
	public BoardVO(String title, String content, int writeID) {
		super();
		this.title = title; //this를 넣지않으면 지역변수값을 넣기때문에
		this.content = content;
		this.writeId = writeId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public int getWriteId() {
		return writeId;
	}
	
}
//set 무조건 void
//private에 값넣을때 생성자를 통해서, set을 통해서 값을뺄때는 get을통해서


