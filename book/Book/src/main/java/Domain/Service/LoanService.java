package Domain.Service;

import Domain.Repository.BookRepository;
import Domain.Repository.MemberRepository;
import Infrastructure.Entity.Book;
import Infrastructure.Entity.Loan;
import Infrastructure.Entity.Member;

public class LoanService {
	public BookRepository bookRepository;
	public MemberRepository memberRepository;
	public LoanService(BookRepository bookRepository,MemberRepository memberRepository){
		this.bookRepository=bookRepository;
		this.memberRepository=memberRepository;
	}
	//ΩË È
	public Loan LoanBook(String MemberId,String BookId){
		Loan loan=null;	
			Book book=bookRepository.FindBy(BookId);
			Member member=memberRepository.FindBy(MemberId);
		if(member.CanLoan(member,book)){
			loan=member.Loan(member,book);
			book.setLoanTo(member);
			bookRepository.Save(book);
		}
		return loan;
	}
	//ªπ È
	public void ReturnBook(Book book){
		if(book.getLoanTo()!=null){
			Member member = book.getLoanTo();
			member.Return(book);
			bookRepository.Save(book);
			memberRepository.Save(member);
		}
		
	}
}
