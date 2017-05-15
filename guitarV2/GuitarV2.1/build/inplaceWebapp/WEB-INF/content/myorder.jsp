<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.OrderInformation"%>
<%@ page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<jsp:useBean id="orderDao" scope="request" class="cn.edu.cumt.ec.dao.OrderDao"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>欢迎注册</title>
<link href="css/bootstrap.min.css" rel="stylesheet"/>
<style type="text/css">
/* button伪装成超链接形式  */
button{
    font-size: 1em;
    text-align: center;
    color: #000;
    background: none;
    margin: 0;
    padding: 0;
    border: none;
    cursor: pointer;
    outline:none;
}
</style>

</head>
<body>
	<div class="container">
		<div class="row">
			 <table class="table table-striped table-bordered table-hover">
   <thead>
     <tr>
       <th>订单编号</th>
       <th>下单时间</th>
       <th>收货人</th>
       <th>订单金额</th>
       <th>订单状态</th>
       <th>订单详情</th>
     </tr>
   </thead>
   <tbody>
   <%
List list =orderDao.OrderShowuser(session.getAttribute("cuname").toString());
for(int i=0;i<list.size();i++){
  OrderInformation info=(OrderInformation)list.get(i);
%>

  <tr>
       <td><%=info.getOid() %></td>
       <%DateFormat df = DateFormat.getDateTimeInstance(); %>
       <td><%=df.format(info.getOtime()) %></td>
       <td><%=info.getOname()%></td>
       <td><%=info.getOtotalprice()%></td>
       <td><%=info.getOstate()%></td>
	   <td><form mehod="post" action="myitemorder" class="buttonhref"><input type="hidden" name="oid" value="<%=info.getOid() %>"><button type="submit" style="background:none;border:none;">查看订单详情</button></form></td>
     </tr>
     <%} %>
   </tbody>
 </table>
		</div>
	</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>