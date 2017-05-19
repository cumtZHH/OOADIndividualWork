<%@ page contentType="text/html; charset=GBK" language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<link href="CSS/styletwo.css" type="text/css" rel="stylesheet">
<title>修改商品购买数量及从购物车中移去指定商品</title>
</head>
<script language="javascript">
function checkEmpty(Form){
for(i=0;i<Form.length;i++){
if(Form.elements[i].value==""){
alert("表单信息不能为空")
return false;
}
}
}
</script>

<body><div align="center">
  <table width="356" height="44" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td background="image/jiezhao.jpg">&nbsp;</td>
    </tr>
  </table>
 <form name="form" method="post" action="checkoutDealwithc" onSubmit="return checkEmpty(form)">
    <table width="356" border="0" cellpadding="0" cellspacing="0"> 
      <tr bgcolor="#EFEFEF" align="center">
        <td width="98" height="30">订单号</td>
        <td width="265" height="30"><input type="text" name="orderNumber"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">用户名</td>
        <td height="30"><input type="text" name="name"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">真实姓名</td>
        <td height="30"><input type="text" name="realName"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">Email</td>
        <td height="30"><input type="text" name="email"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">用户地址</td>
        <td height="30"><input type="text" name="address"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">电话</td>
        <td height="30"><input type="text" name="tel"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">邮编</td>
        <td height="30"><input type="text" name="post"></td>
      </tr>
    </table>
    <input type="submit" name="Submit2" value="提交">&nbsp;&nbsp;&nbsp;
    <input type="reset" name="Submit" value="重置">&nbsp;&nbsp;&nbsp;
    <input type="button" name="Submit" value="返回" onClick="javascript:history.back();">
  </form>
</div>

</body>
</html>
