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
	
	public Boolean isDuplicateUrl(String url) {
		int count = bookmarkRepository.selectDuplicateByUrl(url);
//		if(count == 0) {
//			return false;
//		} else {
//			return true;
//		}
		return count != 0;
	}
	
	public int deleteUrl(int id) {
		return bookmarkRepository.deleteUrl(id);
	}
	
}
