<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
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
	<link rel="stylesheet" type="text/css" href="mcss/maddproduct.css">
	<script type="text/javascript" src="mjs/jquery.min.js"></script>
	<script type="text/javascript" src="mjs/jquery.easyui.min.js"></script>
 </HEAD>
 <div >
<img class="img" src="<%=request.getParameter("pimg")%>">
 <div class="tianjia">
           <form method="post" action="mendproduct" enctype="multipart/form-data" >
							<table >
								<tr>
								<td><span>商品编号：</span></td>
								<td class="fr"><%=request.getParameter("pid")%><input name="pid" type="hidden" value="<%=request.getParameter("pid")%>" /></td>
								</tr>
								<tr>
								<td><span>商品名称：</span></td>
								<td class="fr"><input type="text" name="pname" value="<%=request.getParameter("pname")%>"></td>
								</tr>
								<tr>
								<td><span>商品类编号：</span></td>
								<td class="fr"><input name="psid" type="text" value="<%=request.getParameter("psid")%>"></td>
								</tr>
								<tr>
								<td><span>库存：</span></td>
								<td class="fr"><input name="pstory" type="text" value="<%=request.getParameter("pstory")%>"></td>
								</tr>
								<tr>
								<td><span>销售数量：</span></td>
								<td class="fr"><input name="pnumber" type="text" value="<%=request.getParameter("pnumber")%>"></td>
								</tr>
								<tr>
								<td><span>价格：</span></td>
								<td class="fr"><input name="price" type="text" value="<%=request.getParameter("price")%>"></td>
								</tr>
								<tr>
								<td><span>入库时间：</span></td>
								<td class="fr"><input name="ptime" type="text" value="<%=request.getParameter("ptime")%>"></td>
								</tr>
								<tr>
								<td><span>首页图片：</span></td><input name="pimg" type="hidden" value="<%=request.getParameter("pimg")%>" />
								<td class="fr"><s:file name="upload"/></td>
								</tr>
							</table>
						<input class="btn btn-primary btn-lg btn-danger" value="修改商品" type="submit"/>
					</form>
					</div>
					</div>
</body>
</html>

