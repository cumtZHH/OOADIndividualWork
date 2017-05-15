<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.OrderItem"%>
<%@ page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="orderitemdao" scope="request" class="cn.edu.cumt.ec.dao.OrderItemDao"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
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
 </HEAD>
<body>
            <div class="cont">
                <div class="title">详细订单</div>
                <div class="details">
                    <div class="details_operation clearfix">
                        <div class="bui_select">
                            <a href="maddproduct"><input type="button" value="添&nbsp;&nbsp;加" class="add2"></a>
                        </div>
                        <div class="fr">
                            <div class="text">
                                <span>商品编号：</span>
                                    <input type="text" value="" class="search">
                            </div>
                            <div class="text">
                                <span>上架时间：</span>
                                    <input class="easyui-datetimebox" required style="width:200px">
                            </div>
                            <div class="text">
                                <span>搜索</span>
                                <input type="text" value="" class="search">
                            </div>
                        </div>
                    </div>
                    <!--表格-->
                    <table class="table" cellspacing="0" cellpadding="0">
                        <thead>
                            <tr>
                            <th width="20%">订单编号</th>
                                <th width="10%">商品编号</th>
                                <th width="20%">商品名称</th>
                                <th width="10%">商品数量</th>
								<th width="10%">商品价格</th>
								
								
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>
                        <%
List list =orderitemdao.OrderShowid(request.getParameter("oid"));
for(int i=0;i<list.size();i++){
  OrderItem info=(OrderItem)list.get(i);
%>
					
                            <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label"><%=info.getOid() %></label></td>
                                <td><%=info.getOpid()%></td>
                                <td><%=info.getOpname() %></td>
								<td><%=info.getOpcount()%></td>
								<td><%=info.getOprice()%></td> 
 								
								                             
								<td align="center">      
								<input type="submit" value="修改" class="btn"/>                       
                                <input type="button" value="删除" class="btn" onclick="del_tr(this)" >
                                
                                </td>
                            </tr>
                      <%} %>
                            <!--  
                            <tr>
                                
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn"></td>
                            </tr>
                            --> 
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
		
<script>
  function del_tr(obj) {
  	var conf = confirm('确定删除吗？');
	if(conf){
    $(obj).parent().parent().remove();
    var pid= obj.dataset.pid; 
    $.post("deleteproduct",{ pid: pid });
	}
  }
</script>

</body>
</html>

