<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.OrderInformation"%>
<%@ page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.sql.Timestamp"%>
<jsp:useBean id="orderDao" scope="request" class="cn.edu.cumt.ec.dao.OrderDao"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> 订单查询 </TITLE>
  <META NAME="Generator" CONTENT="EditPlus">
  <META NAME="Author" CONTENT="">
  <META NAME="Keywords" CONTENT="">
  <META NAME="Description" CONTENT="">
  <link rel="stylesheet" href="mcss/backstage.css">
  <link rel="stylesheet" type="text/css" href="mcss/easyui.css">
	<link rel="stylesheet" type="text/css" href="mcss/icon.css">
	<link rel="stylesheet" type="text/css" href="mcss/demo.css">
	<script type="text/javascript" src="mjs/jquery.min.js"></script>
	<script type="text/javascript" src="mjs/jquery.easyui.min.js"></script>
	<style type="text/css">
/* button伪装成超链接形式  */
button{
    font-size: 1em;
    text-align: center;
    color:#000;
    background: none;
    margin: 10px;
    padding: 0;
    border: none;
    cursor: pointer;
    outline:none;
}
</style>
 </HEAD>
<body>
            <div class="cont">
                <div class="title">订单查询</div>
                <div class="details">
                    <div class="details_operation clearfix">
                        <div class="bui_select">
                            <!-- <button type="submit" class="add3" style="cursor:pointer" onclick="select(this)">查看订单详细信息</button> -->
                        </div>
                        <div class="fr">
                            <div class="text">
                                <span>订单编号：</span>
                                    <input type="text" class="search">
                            </div>
                            <div class="text">
                                <span>用户姓名：</span>
                                    <input type="text" class="search" >
                            </div>
                            <div class="text">
                                <span></span>
                                <input type="button" value="搜索" style="background-color:#BDD6FF;width:100px;height:30px;">
                            </div>
                        </div>
                    </div>
                    <!--表格-->
                    <table class="table" cellspacing="0" cellpadding="0">
                        <thead>
                            <tr>
                                <th width="16%">订单编号</th>
                                <th width="7%">用户名称</th>
                                <th width="7%">收货人</th>
								<th width="10%">送货地址</th>
								<th width="10%">收货人手机号</th>
								<th width="10%">订单生成时间</th>
								<th width="10%">订单总价</th>
								<th width="10%">订单状态</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>
                        <%
List list =orderDao.OrderShow();
for(int i=0;i<list.size();i++){
  OrderInformation info=(OrderInformation)list.get(i);
%>
                            <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label" ><button type="button" onclick="window.location.href='morderitemquery?oid=<%=info.getOid() %>'"><%=info.getOid()%></button></label></td>
                                <td><%=info.getOcuname()%></td>
                                <td><%=info.getOname()%></td>
								<td><%=info.getOaddress()%></td>
								<td><%=info.getOtel()%></td>
								<%DateFormat df = DateFormat.getDateTimeInstance(); %>
								<td><%=df.format(info.getOtime())%></td>
								<td><%=info.getOtotalprice()%></td>
								<form method="post" action="mendorder.action">
								<td>
									<select name="ostate" id="osate"> 
										<option value="<%=info.getOstate()%>"><%=info.getOstate()%></option> 
										<option value="货在途中">货在途中</option> 
										<option value="等待评价">等待评价</option>
										<option value="等待受理">等待受理</option>  
									</select> 
								</td>
								<input type="hidden" name="oid" value="<%=info.getOid() %>"/>
								<input type="hidden" name="otel" value="<%=info.getOtel() %>"/>
                                <td align="center">
                                <input type="submit" value="修改" class="btn"></form><input type="button" value="删除" class="btn" >
                                </td>
                            </tr>
                      <%} %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
		
<script>
</script>
</body>
</html>

