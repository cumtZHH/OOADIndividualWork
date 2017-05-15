<%@page contentType="text/html; charset=GBK" language="java" import="java.sql.*" errorPage=""%>
<%@page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@page import="java.util.*"%>
<jsp:useBean id="connection" scope="request" class="com.edu.cumt.ec.dbutil.DbUtil"/>
<%
  request.setCharacterEncoding("GBK");
  String orderNumber = request.getParameter("orderNumber");
  String name = request.getParameter("name");
  String realName = request.getParameter("realName");
  String email = request.getParameter("email");
  String address = request.getParameter("address");
  String tel = request.getParameter("tel");
  String post = request.getParameter("post");
  String sqlOrderMan = "insert into tb_shop_orderMan values('" + orderNumber + "','" + name + "','" + realName + "','" + email + "','" + post + "','" + tel + "','" + address + "')";
  connection.executeUpdate(sqlOrderMan);
  List list = (List) session.getAttribute("shop");
  for (int i = 0; i < list.size(); i++) {
    BuyList buy = (BuyList) list.get(i);
    String sqlOrderPr = "insert into tb_shop_orderProduction values ('" + orderNumber + "','" + buy.warename + "','" + buy.id + "','" + buy.photo + "','" + buy.price + "','" + buy.number + "')";
     connection.executeUpdate(sqlOrderPr);
  }
  session.invalidate();
  connection.closeDBConnection();
  response.sendRedirect("index.jsp");
%>
