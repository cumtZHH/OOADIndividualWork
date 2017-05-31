<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> 添加页面 </TITLE>
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
           <form action="addGuitar" method="post" >
						
							<table>
								<tr>
								<td><span>serialNumber：</span></td>
								<td class="fr"><input name="serialNumber" type="text"></td>
								</tr>
								<tr>
								<td><span>price：</span></td>
								<td class="fr"><input type="text" name="price"></td>
								</tr>
								<tr>
								<td><span>builder：</span></td>
								<td class="fr"><input name="builder" type="text"></td>
								</tr>
								<tr>
								<td><span>model：</span></td>
								<td class="fr"><input name="model" type="text" ></td>
								</tr>
								<tr>
								<td><span>type：</span></td>
								<td class="fr"><input name="type" type="text" value=></td>
								</tr>
								<tr>
								<td><span>backWood：</span></td>
								<td class="fr"><input name="backWood" type="text"></td>
								</tr>
								<tr>
								<td><span>topWood：</span></td>
								<td class="fr"><input name="topWood" type="text"></td>
								</tr>
							</table>
						<input class="btn btn-primary btn-lg btn-danger" value="添加" type="submit"/>
					</form>
					</div>
</body>
</html>

