package Infrastructure.Specification;

import Infrastructure.Entity.Book;
import Infrastructure.Entity.Member;

public class LoanOnlyOneSpecification implements ISpecification<Member> {
	private Book wantBook;
	public LoanOnlyOneSpecification(Book book){
		wantBook=book;
	}
	public boolean IsSatisfiedBy(Member member) {		
		if(wantBook.getLoanTo().equals(member))
			return false;
		return true;
	}

}
