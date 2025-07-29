package com.app.dao.book;

import java.util.List;

import com.app.dto.book.Book;

public interface BookDAO {
    public List<Book> selectBookList();
    public Book selectBook(int id);
    public int insertBook(Book book);
    public int updateBook(Book book);
    public int deleteBook(int id);
}
