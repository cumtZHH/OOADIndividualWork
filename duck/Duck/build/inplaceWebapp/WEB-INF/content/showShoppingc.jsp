<%@page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage=""%>
<%@page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@page import="java.util.*"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <link href="CSS/styletwo.css" rel="stylesheet" type="text/css">
    <title>修改商品购买数量及从购物车中移去指定商品</title>
  </head>
  <body>
    <table width="562" height="43" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr align="center">
        <td height="43" background="image/gouwuche.jpg" bgcolor="#EFEFEF">&nbsp;</td>
      </tr>
  </table><form name="form" method="post" action="addProductionNumberc">
    <table width="562" border="1" align="center" cellpadding="0" cellspacing="0">

      <tr align="center" bgcolor="#EFEFEF">
        <td width="39" height="22">序号</td>
        <td width="112">商品名称</td>
        <td width="98">价格</td>
        <td width="112">数量</td>
        <td width="109">总金额</td>
      </tr>
    <%
    List shopList= (List) session.getAttribute("shop");

      if (shopList==null||shopList.size()==0) {
    %>
<script language="javascript" type="text/javascript">
   alert("购物车没有物品");
    window.location.href="indexc";
</script>
    <%
      } else {

        float num=0;
        int pric=0;
        for (int i = 0; i < shopList.size(); i++) {
          BuyList shop = (BuyList) shopList.get(i);
		  num=num+shop.number*shop.price;

    %>
<script language="javascript" type="text/javascript">
function check(){
if(isNaN(form.number<%=i%>.value)){
alert("请不要输入非法字符");
return false;
history.back();
}
if(form.number<%=i%>.value==""){
alert("请输入修改的数量");
return false;
history.back();
}
}
</script>

      <tr align="center" bgcolor="#EFEFEF">
        <td height="21"><%=i+1%></td>
        <td><%=shop.warename%></td>
        <td><%=shop.price%><input name="id<%=i%>" type="hidden" size="10" value="<%=shop.id%>"></td>
        <td><input name="number<%=i%>" type="text" size="10" value="<%=shop.number%>"></td>
        <td><%=shop.number*shop.price%></td>
      </tr>
 <%}%>
  </table>
    <table width="562" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr align="right">
        <td height="31" bgcolor="#EFEFEF">总合计金额：<%=num%></td>
      </tr>
  </table>
    <table width="303" border="0" align="center">
      <tr align="center" bgcolor="#EFEFEF">
      <td width="61" height="27">
        <input type="submit" name="Submit" value="修改数量" onClick="return check()">       </td>
        <td width="75"><a href="indexc">继续购物</a></td>
        <td width="74"><a href="putinc">清空购物车</a></td>
        <td width="75"><a href="checkoutc">去收银台</a></td>
      </tr>
    </table> </form>
    <%}    %>
  </body>
</html>
