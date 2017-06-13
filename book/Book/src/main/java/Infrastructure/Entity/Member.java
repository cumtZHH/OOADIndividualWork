package Infrastructure.Entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Domain.Factory.LoanFactory;
import Infrastructure.Specification.HasReachMaxSpecification;
import Infrastructure.Specification.LoanOnlyOneSpecification;

public class Member {
	private String MemberId;
	protected String Name;
	protected List<Loan> Loans;
    public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		MemberId = memberId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Loan> getLoans() {
		return Loans;
	}
	public void setLoans(List<Loan> loans) {
		Loans = loans;
	}
	//从借书记录中找出相关的书籍
			public Loan FindCurrentLoanFor(Book book){
				if(Loans==null)
					return null;
					for(Iterator<Infrastructure.Entity.Loan> i=getLoans().iterator(); i.hasNext();){
			    		Loan loan=(Loan)i.next();
			    		if(loan.getBook().getBookId()==book.getBookId())
			    			return loan;
			    	}
				return null;
		    }
		//还书消除记录
	    public void Return(Book book){
	    	if (FindCurrentLoanFor(book)==null){
	    		System.out.println("这本书没有借书记录");	    		
	    	}else{
	    		Loan loan=FindCurrentLoanFor(book);
	    		loan.MarkAsReturned();
	    		book.setLoanTo(null);
	    	}	    	
	    }
	  //判断此书是否可借
	    public boolean CanLoan(Member member,Book book){
	    	if(book.getLoanTo()!=null){
	    		HasReachMaxSpecification HS=new HasReachMaxSpecification();
		    	LoanOnlyOneSpecification LS=new LoanOnlyOneSpecification(book);
		    	return (HS.IsSatisfiedBy(member))&&(LS.IsSatisfiedBy(member));
	    	}else{
	    		return true;
	    	}	    	
	    }
	    //创建借书记录
	    public Loan Loan(Member member,Book book){
	    	    Loan loan = null;
	    	    List<Loan> loans=new ArrayList();
	    		loan=LoanFactory.CreateLoan(book,member);
	    		if(getLoans()==null){
	    			loans.add(loan);
	    			member.setLoans(loans);
	    		}else{
	    			getLoans().add(loan);
	    		}
	    		return loan;
	    }
	   
}
