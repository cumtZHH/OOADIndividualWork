<%@page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage=""%>
<%@page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@page import="java.util.*"%>
<%
  request.setCharacterEncoding("utf-8");
  String name = request.getParameter("name");
  String price = request.getParameter("price");
  String photo = request.getParameter("photo");
  String id=request.getParameter("id");
  //=======================================
  BuyList buyList = new BuyList();
  buyList.id=id;
  buyList.number = 1;
  buyList.photo = photo;
  buyList.price = Float.parseFloat(price);
  buyList.warename = name;
  boolean flag = true;
  //========================================
  List shoplist=null;

 
if(session.getAttribute("shop")==null){
	shoplist=new ArrayList();

}else{
  shoplist=(List)session.getAttribute("shop");
	for(int i=0;i<shoplist.size();i++){
		BuyList buyitem=(BuyList)shoplist.get(i);
		if(buyitem.id.equals(buyList.id)){
			buyitem.number++;
			shoplist.set(i,buyitem);
			flag=false;
		}
	}
}
if(flag)shoplist.add(buyList);
session.setAttribute("yigou",shoplist.size());
session.setAttribute("shop",shoplist);
%>
<script language="javascript" type="text/javascript">
alert("商品已成功添加到购物车");
/* window.history.back(-1); */
window.location.href=document.referrer; 
</script>
