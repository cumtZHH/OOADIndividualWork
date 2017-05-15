<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.Product"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="productionDao" scope="request" class="cn.edu.cumt.ec.dao.ProductionDao"/>
<html>
<head>
<title>购物车</title>
</head>
<link href="CSS/styletwo.css" rel="stylesheet" type="text/css">
<body>
<jsp:include page="topc.jsp" flush="true"></jsp:include>
<table width="364" height="46" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td background="image/tejiaoshangpin.jpg">&nbsp;</td>
  </tr>
</table>
<%
List list =productionDao.productionShow();
for(int i=0;i<list.size();i++){
  Product info=(Product)list.get(i);
%>
<table width="351" height="101" border="0" align="center" cellpadding="0" cellspacing="0">
  <form name="form" method="post" action="addProductionc">
  <tr align="center" bgcolor="#EFEFEF">
    <td width="167"  rowspan="3"><img src="<%=info.getPimg()%>" width="150" height="88"></td>
    <td width="168" height="30"><%=info.getPname()%>
      <input type="hidden" name="name" value="<%=info.getPname()%>">
      <input type="hidden" name="price" value="<%=info.getPrice()%>">
      <input type="hidden" name="photo" value="<%=info.getPimg()%>">
      <input type="hidden" name="id" value="<%=info.getPid()%>"></td>
  </tr>
  <tr align="center">
    <td height="30" bgcolor="#EFEFEF"><%=info.getPrice()%>元</td>
  </tr>
  <tr align="center">
    <td height="30" bgcolor="#EFEFEF">
      <input type="submit" name="Submit" value="购买">   </td>
  </tr> </form>
</table>
<%}%>
</body>
</html>
