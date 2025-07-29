package com.app.service.book.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.dao.book.BookDAO;
import com.app.dto.book.Book;
import com.app.service.book.BookService;

@Repository
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Autowired
	BookDAO bookDAO;

	@Override
	public List<Book> getBookList() {
		return bookDAO.selectBookList();
	}

	@Override
	public Book getBook(int id) {
		return bookDAO.selectBook(id);
	}

	@Override
	public int addBook(Book book) {
		return bookDAO.insertBook(book);
	}

	@Override
	public int updateBook(Book book) {
		return bookDAO.updateBook(book);
	}

	@Override
	public int deleteBook(int id) {
		return bookDAO.deleteBook(id);
	}

}