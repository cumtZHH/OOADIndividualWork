<%@ page contentType="text/html; charset=GBK" language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<link href="CSS/styletwo.css" type="text/css" rel="stylesheet">
<title>�޸���Ʒ�����������ӹ��ﳵ����ȥָ����Ʒ</title>
</head>
<script language="javascript">
function checkEmpty(Form){
for(i=0;i<Form.length;i++){
if(Form.elements[i].value==""){
alert("����Ϣ����Ϊ��")
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
        <td width="98" height="30">������</td>
        <td width="265" height="30"><input type="text" name="orderNumber"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">�û���</td>
        <td height="30"><input type="text" name="name"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">��ʵ����</td>
        <td height="30"><input type="text" name="realName"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">Email</td>
        <td height="30"><input type="text" name="email"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">�û���ַ</td>
        <td height="30"><input type="text" name="address"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">�绰</td>
        <td height="30"><input type="text" name="tel"></td>
      </tr>
      <tr bgcolor="#EFEFEF" align="center">
        <td height="30">�ʱ�</td>
        <td height="30"><input type="text" name="post"></td>
      </tr>
    </table>
    <input type="submit" name="Submit2" value="�ύ">&nbsp;&nbsp;&nbsp;
    <input type="reset" name="Submit" value="����">&nbsp;&nbsp;&nbsp;
    <input type="button" name="Submit" value="����" onClick="javascript:history.back();">
  </form>
</div>

</body>
</html>
