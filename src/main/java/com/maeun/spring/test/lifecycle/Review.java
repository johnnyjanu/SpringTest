package com.maeun.spring.test.lifecycle;

public class Review {
	
	private String title;
	private String user;
	private String content;
	
	public Review(String title, String user, String content) {
		this.title = title;
		this.user = user;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "title : " + title + "\nuser : " + user + "\ncontent : " + content;
	}

	public String getTitle() {
		return title;
	}

	public String getUser() {
		return user;
	}

	public String getContent() {
		return content;
	}
	
	
	
}
