package com.spn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.spn.Model.Book;

@Service
public class BookService {
	private List<Book> listBook = new ArrayList<>();

	public BookService() {
		listBook.add(new Book(1, "Head First Java, 2nd Edition", "2005", "Kathy Sierra", 720,
				"http://whatpixel.com/images/2017/05/head-first-java.jpg"));
		listBook.add(new Book(2, "Java: A Beginner’s Guide", "2010", "Herbert Schildt", 700,
				"http://whatpixel.com/images/2017/05/java-a-beginners-guide.jpg"));

		listBook.add(new Book(3, "Java SE8 for the Really Impatient", "2010", "Cay S.Horstmann", 800,
				"http://whatpixel.com/images/2017/05/java-se8-impatient.jpg"));
		listBook.add(new Book(4, "Beginning Programming with Java For Dummies", "2001", "Dummies", 720,
				"http://whatpixel.com/images/2017/05/for-dummies-beginning-java.jpg"));
		listBook.add(new Book(5, "Core Java Volume I", "2000", "Cay S.Horstmann", 1000,
				"http://whatpixel.com/images/2017/05/core-java-book.jpg"));
		listBook.add(new Book(6, "Sams Teach Yourself Java", "2008", " Sams", 1050,
				"http://whatpixel.com/images/2017/05/sams-teach-yourself-java.jpg"));
		listBook.add(new Book(7, "Learn Java in One Day and Learn It Well", "2001", "Jamie Chan", 230,
				"http://whatpixel.com/images/2017/05/learn-java-one-day.jpg"));
		listBook.add(new Book(8, "Murach’s Beginning Java with Eclipse", "2015", "Murach", 700,
				"http://whatpixel.com/images/2017/05/murachs-beginning-java.jpg"));
		listBook.add(new Book(9, "Java Programming 24-Hour Trainer", "2004", "Yakov Fan", 550,
				"http://whatpixel.com/images/2017/05/java-programming-24hr-training.jpg"));
		listBook.add(new Book(10, "Java 8 in Action", "2002", "Java 8 ", 420,
				"http://whatpixel.com/images/2017/05/java8-in-action.jpg"));

	}

	public List<Book> findAllBook() {
		return listBook;
	}

	public Book findBookById(Integer id) {
		for (Book book : listBook) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}
}
