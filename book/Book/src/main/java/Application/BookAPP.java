package Application;

import Domain.Service.LoanService;
import Infrastructure.Entity.Book;
import Infrastructure.Entity.Member;

public class BookAPP {
	private Member member;
	private Book book;
	private LoanService loanService;
	public void BookApp(){
		if(member==null && book != null)
			loanService.ReturnBook(book);
		if(member!=null && book!=null)
		    loanService.LoanBook(member.getMemberId(),book.getBookId());		
	}
	
}
