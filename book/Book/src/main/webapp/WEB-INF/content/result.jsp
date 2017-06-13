<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>½á¹û</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/buycar.css" rel="stylesheet">
</head>
<body>
<table style="border: 1px solid black;">
<tr>
	<td>serialNumber</td>
	<td>price</td>
	<td>builder</td>
	<td>model</td>
	<td>type</td>
	<td>backWood</td>
	<td>topWood</td>
</tr>
<s:iterator value="#request.guitarInfo" id="guitar" status="st">
	<tr>
       <td><s:property value="#guitar.serialNumber"/></td>
       <td><s:property value="#guitar.price"/></td>
       <td><s:property value="#guitar.spec.builder"/></td>
       <td><s:property value="#guitar.spec.model"/></td>
       <td><s:property value="#guitar.spec.type"/></td>
       <td><s:property value="#guitar.spec.backWood"/></td>
       <td><s:property value="#guitar.spec.topWood"/></td>
     </tr>
</s:iterator>
</table>

<script src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
