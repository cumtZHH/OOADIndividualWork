package Infrastructure.Specification;

import java.util.Iterator;

import Infrastructure.Entity.Loan;
import Infrastructure.Entity.Member;

public class HasReachMaxSpecification implements ISpecification<Member> {
	public boolean IsSatisfiedBy(Member member) {
		int s=0;
		if(member.getLoans()==null){
			return true;
		}else{
		    for(Iterator<Loan> i=member.getLoans().iterator(); i.hasNext();){
    		    Loan loan=(Loan)i.next();
    		    if(loan==null)
                break;
    		    s++;
    		    }
		     if(s<3)
			    return true;
		}
		    return false;
	}	
}
