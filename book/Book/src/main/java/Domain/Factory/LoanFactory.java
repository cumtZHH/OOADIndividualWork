package Domain.Factory;

import java.util.Calendar;
import java.util.Date;

import Infrastructure.Entity.Book;
import Infrastructure.Entity.Loan;
import Infrastructure.Entity.Member;

public class LoanFactory {
     public static Loan CreateLoan(Book book,Member member){
    	 Loan loan= new Loan();
    	 loan.setBook(book);
    	 loan.setMember(member);
    	    Date date=new Date();
    	 loan.setLoanDate(date);
    	    Calendar calendar  =   Calendar.getInstance();   	 
    	    calendar.setTime(date); //��Ҫ��date����ת�Ƶ�Calender�����в���
    	    calendar.add(calendar.DATE, 10);//��������������n��.����������,������ǰ�ƶ� 
    	    date=calendar.getTime();   //���ʱ���������������һ��Ľ�� 
    	 loan.setDateForReturn(date);
    	 return loan;
     }
}

