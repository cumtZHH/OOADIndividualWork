<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.Product"%>
<%@ page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="prot" scope="request" class="cn.edu.cumt.ec.dao.ProductionDao"/>
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
                <div class="title">详细商品</div>
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
                            <tr>
                                <th width="8%">商品编号</th>
                                <th width="20%">商品名称</th>
                                <th width="8%">商品类编号</th>
								<th width="6%">库存</th>
								<th width="6%">销售数量</th>
								<th width="6%">价格</th>
								<th width="12%">入库时间</th>
								<th width="20%">首页图片</th>
                                <th>操作</th>
                            </tr>
                            </tr>
                        </thead>
                        <tbody>
                     	 <%
		List list =prot.ProductionShowpsid(request.getParameter("psid"));
		for(int i=0;i<list.size();i++){
  		Product info=(Product)list.get(i);
			%>
					
                            <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label"><%=info.getPid() %></label></td>
                                <td><%=info.getPname()%></td>
                                <td><%=info.getPsid()%></td>
								<td><%=info.getPstory()%></td>
								<td><%=info.getPnumber()%></td> 
 								<td><%=info.getPrice()%></td>
								<td><%=info.getPtime()%></td>
 								<td><img src="<%=info.getPimg()%>"/></td>            
								<td align="center"> 
								<form action="mindproduct" method="post" class="fl prot">
                                <input type="hidden" name="pid" value="<%=info.getPid()%>">
                                <input type="hidden" name="pname" value="<%=info.getPname()%>">
                                <input type="hidden" name="psid" value="<%=info.getPsid()%>">
                                <input type="hidden" name="pstory" value="<%=info.getPstory()%>">
                                <input type="hidden" name="pnumber" value="<%=info.getPnumber()%>">
                                <input type="hidden" name="price" value="<%=info.getPrice()%>">
                                <input type="hidden" name="ptime" value="<%=info.getPtime()%>">
                                <input type="hidden" name="pimg" value="<%=info.getPimg()%>">
                                <input type="submit" value="修改" class="btn"/></form>                       
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

