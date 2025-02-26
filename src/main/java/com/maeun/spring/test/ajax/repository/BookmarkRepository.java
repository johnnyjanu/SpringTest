package com.maeun.spring.test.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.maeun.spring.test.ajax.domain.Bookmark;

@Mapper
public interface BookmarkRepository {
	
	public int insertBookmark(
			@Param("name") String name
			, @Param("url") String url);
	public List<Bookmark> selectBookmark();
	public int selectDuplicateByUrl(@Param("url") String url);
}
