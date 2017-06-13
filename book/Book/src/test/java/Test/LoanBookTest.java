package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Repository.BookRepository;
import Domain.Repository.MemberRepository;
import Domain.Service.LoanService;
import Infrastructure.Entity.Book;
import Infrastructure.Entity.Loan;

public class LoanBookTest {
	
	@Test
	public void test1() {
		BookRepository bookRepository=new BookRepository();
		MemberRepository memberRepository=new MemberRepository();
		LoanService loanService=new LoanService(bookRepository,memberRepository);
	    Loan loan=loanService.LoanBook("1", "1");
	    assertNotNull(loan);
	    System.out.println("ΩË È≥…π¶");
	    Book book=bookRepository.FindBy("1");
	    loanService.ReturnBook(book);
	}
	
}