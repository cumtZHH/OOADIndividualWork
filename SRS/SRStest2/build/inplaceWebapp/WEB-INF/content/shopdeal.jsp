
<%@page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@page import="java.util.*"%>
<%
 List shoplist=new ArrayList();
shoplist=(List)session.getAttribute("shop");
request.setCharacterEncoding("UTF-8"); 
Integer t =Integer.parseInt(request.getParameter("t")) ; 
shoplist.remove(t-1);
session.setAttribute("shop",shoplist);
//session.getAttribute("shop");
response.sendRedirect("buycar");
%>