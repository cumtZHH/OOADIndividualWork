<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> 商品查询 </TITLE>
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
 <div class="tianjia">
           <form action="addimages" method="post" enctype="multipart/form-data" >
							<table>
								<tr>
								<td><span>商品编号：</span></td>
								<td class="fr"><input name="ipid" type="text"></td>
								</tr>
								<tr>
								<td><span>商品名称：</span></td>
								<td class="fr"><input type="text" name="iname"></td>
								</tr>
							<%-- 	<tr>
									<input type="button" onclick="add();" value="添加" style="width:50px"/>
								</tr>
								<tr>
								<td> <span>商品图片:</span></td>
								<td><div id="fileDiv">
									<s:file name="upload"></s:file>
									</div>
								</td>
								</tr> --%>
								<tr>
								<td><span>商品图片：</span></td>
								<td class="fr"><input type="file" name="upload"/></td>
								</tr>
							    <tr>
								<td><span>商品图片：</span></td>
								<td class="fr"><input type="file" name="upload"/></td>
								</tr>
								<tr>
								<td><span>商品图片：</span></td>
								<td class="fr"><input type="file" name="upload"/></td>
								</tr>
								<tr>
								<td><span>商品图片：</span></td>
								<td class="fr"><input type="file" name="upload"/></td>
								</tr>
								<tr>
								<td><span>商品图片：</span></td>
								<td class="fr"><input type="file" name="upload"/></td>
								</tr>
							</table>
						<!-- <div id="fileDiv">
						<p style="color:red;font-size:20px;">最少添加5张图片，点击按钮可增加！</p>
						<input type="button" onclick="add();" value="添加" style="width:150px;background-color:#BDD6FF;"/>
						</div> -->
						
						<input class="btn btn-primary btn-lg btn-danger" value="添加商品" type="submit"/>
					</form>
					</div>
</body>
 <script type="text/javascript">
/* function add() {
 $("#fileDiv").append($("<tr><td><span>商品图片：</span></td><td class='fr'><input type='file' name='upload'/></td><input type='button' value='删除' style='width:100px;background-color:#BDD6FF;' onclick='removeButton(this);'/></tr>"));
}  */
/* function add() {
	 $("#fileDiv").append($("<div style="font-size:14px;">商品图片:<input type='file'/><input type='button' value='删除' style='width:80px;background-color:#BDD6FF;padding-left:20px;' onclick='removeButton(this);'/></div>"));
	} 
function removeButton(obj) {
 $(obj).parent("div").remove();
} */
</script>
</html>
								
