<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.Psorts"%>
<%@ page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="psorts" scope="request" class="cn.edu.cumt.ec.dao.PsortsDao"/>
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
                <div class="title">产品管理</div>
                <div class="details">
                    <div class="details_operation clearfix">
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
                    <hr/>
                    <div class="addtop">
                    <form method="post" action="addpsorts.action">
                    	<div class="fl">
                    	商品类别编号：<input name="sid" type="text" style="border:1px solid #DDDDDD;font-size:20px;"/>
						商品类别名称：<input name="sname" type="text" style="border:1px solid #EEEEEE;font-size:20px;"/>
						</div>
						<div class="">
						<input type="submit" value="添&nbsp;&nbsp;加" class="add" style="cursor:pointer">
						</div>
					</form>
                    </div>
                    <!--表格-->
                    <table class="table" cellspacing="0" cellpadding="0">
                        <thead>
                            <tr>
                                <th width="30%">分类编号</th>
                                <th width="30%">分类名称</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>
                        <%
List list =psorts.psortsShow();
for(int i=0;i<list.size();i++){
  Psorts info=(Psorts)list.get(i);
%>
					
                            <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label"><button type="button" onclick="window.location.href='mproductitemquery?psid=<%=info.getSid() %>'"><%=info.getSid()%></button></label></td>
                                <td><%=info.getSname() %></td>
                                <td align="center">
                                <form action="mendpsorts" method="post" class="fl prot">
                                <input type="hidden" name="sid" value="<%=info.getSid()%>">
                                <input type="hidden" name="sname" value="<%=info.getSname()%>">
                                <input type="submit" value="修改" class="btn" style="margin-left:150px;"/></form>                             
                                <input type="button" data-sid="<%=info.getSid()%>" value="删除" class="btn" onclick="del_tr(this)" >
                                </td>
                            </tr>
                      <%} %>
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
    var sid= obj.dataset.sid; 
    $.post("deletepsorts",{ sid: sid });
	}
  }
</script>
</body>
</html>

