package com.maeun.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maeun.spring.test.ajax.domain.Bookmark;
import com.maeun.spring.test.ajax.repository.BookmarkRepository;

@Service
public class BookmarkService {
	
	@Autowired
	private BookmarkRepository bookmarkRepository;
	
	public int addBookmark(String name, String url) {
		return bookmarkRepository.insertBookmark(name, url);
	}
	
	public List<Bookmark> getBookmark() {
		return bookmarkRepository.selectBookmark();
	}

}
