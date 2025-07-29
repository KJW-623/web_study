package com.app.controller.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dto.book.Book;
import com.app.service.book.BookService;



@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/list")
    public String bookList(Model model) {
        List<Book> list = bookService.getBookList();
        model.addAttribute("bookList", list);
        return "book/bookList";
    }

    @GetMapping("/detail/{id}")
    public String bookDetail(@PathVariable int id, Model model) {
        Book book = bookService.getBook(id);
        model.addAttribute("book", book);
        return "book/bookDetail";
    }

    @GetMapping("/add")
    public String bookAddForm() {
        return "book/bookForm";
    }

    @PostMapping("/add")
    public String bookAdd(Book book) {
        bookService.addBook(book);
        return "redirect:/book/list";
    }

    @GetMapping("/edit/{id}")
    public String bookEditForm(@PathVariable int id, Model model) {
        Book book = bookService.getBook(id);
        model.addAttribute("book", book);
        return "book/bookEdit";
    }

    @PostMapping("/edit")
    public String bookEdit(Book book) {
        bookService.updateBook(book);
        return "redirect:/book/list";
    }

    @GetMapping("/delete/{id}")
    public String bookDelete(@PathVariable int id) {
        bookService.deleteBook(id);
        return "redirect:/book/list";
    }

}
