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
    	    calendar.setTime(date); //需要将date数据转移到Calender对象中操作
    	    calendar.add(calendar.DATE, 10);//把日期往后增加n天.正数往后推,负数往前移动 
    	    date=calendar.getTime();   //这个时间就是日期往后推一天的结果 
    	 loan.setDateForReturn(date);
    	 return loan;
     }
}

