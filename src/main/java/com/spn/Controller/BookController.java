package com.spn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spn.Model.Book;
import com.spn.Service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value= {"/","/index","/home"})
	public String allBook(Model model) {
		System.out.println("home controller");
		List<Book> listBook = bookService.findAllBook();
		model.addAttribute("listBook", listBook);
		return "index";
	}
	
	
	@RequestMapping(value="/book/{id}")
	public String bookDetail(@PathVariable("id") Integer id,Model model){
		Book book=bookService.findBookById(id);
		model.addAttribute("bookdetail", book);
		return "bookDetail";
	}
}
