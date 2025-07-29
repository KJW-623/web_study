package com.app.service.book;

import java.util.List;

import com.app.dto.book.Book;

public interface BookService {

	public List<Book> getBookList();
	
    public Book getBook(int id);
    
    public int addBook(Book book);
    
    public int updateBook(Book book);
    
    public int deleteBook(int id);
    
}
