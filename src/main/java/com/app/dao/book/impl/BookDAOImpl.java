package com.app.dao.book.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.dao.book.BookDAO;
import com.app.dto.book.Book;

@Repository
@Service
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<Book> selectBookList() {
        return sqlSessionTemplate.selectList("book_mapper.selectBookList");
    }

    @Override
    public Book selectBook(int id) {
        return sqlSessionTemplate.selectOne("book_mapper.selectBook", id);
    }

    @Override
    public int insertBook(Book book) {
        return sqlSessionTemplate.insert("book_mapper.insertBook", book);
    }

    @Override
    public int updateBook(Book book) {
        return sqlSessionTemplate.update("book_mapper.updateBook", book);
    }

    @Override
    public int deleteBook(int id) {
        return sqlSessionTemplate.delete("book_mapper.deleteBook", id);
    }

}
