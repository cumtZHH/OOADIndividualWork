package Infrastructure.Entity;


import java.util.Date;

public class Loan {
	protected String Id;
	protected Date LoanDate;
	protected Date DateForReturn;
	protected Date ReturnDate;
	protected Book book;
	protected Member member;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}	
	public Date getLoanDate() {
		return LoanDate;
	}
	public void setLoanDate(Date loanDate) {
		LoanDate = loanDate;
	}
	public Date getDateForReturn() {
		return DateForReturn;
	}
	public void setDateForReturn(Date dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public Date getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(Date returnDate) {
		ReturnDate = returnDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public boolean HasNotBeenReturned(){
		return ReturnDate==null;
	}
	public void MarkAsReturned(){
	     Date now=new Date();
		 ReturnDate=now;
	}
}
