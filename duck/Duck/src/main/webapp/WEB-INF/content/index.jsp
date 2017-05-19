<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>查找</title>
	<script type="text/javascript" src="mjs/jquery.min.js"></script>
	<script type="text/javascript" src="mjs/jquery.easyui.min.js"></script>
</head>
<body>
<h1>What do you want?</h1>
<form id="gd" action="index" method='post' onchange="submitForm();">
 <select id="sl" name="sl"> 
 <option value="moren" name=""><%if(request.getParameter("sl")==null){
                                   out.print("请选择一个选项");}else{out.print(request.getParameter("sl"));}
 
 %></option> 
<option value="builder" name="">builder</option> 
<option value="type" name="">type</option> 
<option value="model" name="">model</option> 
<option value="backWood" name="">backWood</option> 
<option value="topWood" name="">topWood</option>
</select> 
</form>
<form method="post" action="guitar">
   <input id="tt" type="text" name="<%=request.getParameter("sl")%>"/>
   <input id="btn" type="submit" value="search"/>
</form>
<script>
function submitForm(){
	//获取form表单对象
	    var form = document.getElementById("gd");
	    form.submit();//form表单提交
	}
</script>

</body>
</html>