package Domain.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Infrastructure.Entity.Book;
import Infrastructure.Entity.Member;

public class BookRepository{
      List<Book> books;
      public BookRepository(){
    	  books=new ArrayList<Book>();
    	  Book book1=new Book();
    	      book1.setBookId("1");
    	      book1.setISBN("I001");
    	      book1.setTitle("系统分析与设计");
    	      books.add(book1);
    	  Book book2=new Book();
    	      book2.setBookId("2");
    	      book2.setISBN("I002");
    	      book2.setTitle("数据结构");
    	      books.add(book2);
    	  Book book3=new Book();
    	      book3.setBookId("3");
    	      book3.setISBN("I003");
    	      book3.setTitle("网络金融");
    	      books.add(book3);
      }
      public Book FindBy(String BookId){
    	  for(Iterator<Book> i=books.iterator(); i.hasNext();){
      		Book book=(Book)i.next();
      		if(book.getBookId()==BookId)
                return book;
      		}
    	  return null;
      }
      public void Save(Book book){
      	Book oldBook=FindBy(book.getBookId());
      	int index=books.indexOf(oldBook);
      	if(index>=0) books.set(index, book);
       }
}
