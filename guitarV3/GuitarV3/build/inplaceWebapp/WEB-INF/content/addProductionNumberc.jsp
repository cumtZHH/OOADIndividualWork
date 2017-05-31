<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.util.*"%>
<%@ page import="cn.edu.cumt.ec.dao.BuyList"%>
<%
List list=(List)session.getAttribute("shop");


for(int i=0;i<list.size();i++){
	String number=request.getParameter("number"+i);
        int changeNumber=Integer.parseInt(number);
        System.out.println(changeNumber<0);
 if(changeNumber<0){
%>
<script language="javascript" type="">history.back();</script>
 <%
 }  else{
        String id=request.getParameter("id"+i);
	BuyList buyList=(BuyList)list.get(i);
        if(id.equals(buyList.id)){
   	try{
        int newnum=Integer.parseInt(request.getParameter("number"+i));
	if(newnum!=0){
          buyList.number=newnum;
     }else{
     list.remove(buyList);
     }
     	}catch(Exception e){
out.println("<script language='javascript'>alert('您输入的数量不是有效的整数!');history.back();</script>");
        return;
	}
}}}
session.setAttribute("shop",list);
response.sendRedirect("showShoppingc");
%>

