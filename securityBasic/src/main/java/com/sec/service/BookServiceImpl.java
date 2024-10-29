package com.sec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sec.entity.Book;

@Service
public interface BookServiceImpl {

	String saveBook(Book book);
	
	List<Book> getAllBook();
	
}
