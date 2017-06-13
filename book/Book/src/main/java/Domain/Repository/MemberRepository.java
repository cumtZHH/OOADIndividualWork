package Domain.Repository;

import java.util.ArrayList;
import java.util.List;

import Domain.Factory.LoanFactory;
import Infrastructure.Entity.Book;
import Infrastructure.Entity.Loan;
import Infrastructure.Entity.Member;
import Infrastructure.Specification.HasReachMaxSpecification;
import Infrastructure.Specification.LoanOnlyOneSpecification;

public class MemberRepository {
	List<Member> members=new ArrayList();
	public MemberRepository(){		
		Member member1=new Member();
		    member1.setMemberId("1");
		    member1.setName("张三");
		    members.add(member1);
		Member member2=new Member();
		    member2.setMemberId("2");
		    member2.setName("李四");
		    members.add(member2);
	}
	//
	 public Member FindBy(String MemberId){
   	  for(java.util.Iterator<Infrastructure.Entity.Member> i=members.iterator(); i.hasNext();){
     		Member member=(Member)i.next();
     		if(member.getMemberId()==MemberId)
               return member;
     		}
   	  return null;
     }
	 //
     public void Save(Member member){
    	Member oldMember=FindBy(member.getMemberId());
    	int index=members.indexOf(oldMember);
    	if(index>=0) members.set(index, member);
     }
     
}
