package Infrastructure.Entity;

public class Book {
	protected String BookId;
	protected String ISBN;
	protected String Title;
	protected Member LoanTo;
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String bookId) {
		BookId =bookId;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Member getLoanTo() {
		return LoanTo;
	}
	public void setLoanTo(Member loanTo) {
		LoanTo = loanTo;
	}
}
