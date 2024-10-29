package com.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.Repo.BookRepo;
import com.sec.entity.Book;

@Service
public class BookService implements BookServiceImpl{

	@Autowired
	BookRepo bookRepo;
	
	@Override
	public String saveBook(Book book) {
		bookRepo.save(book);
		return "Success";
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> all = bookRepo.findAll();
		return all;
	}

}
