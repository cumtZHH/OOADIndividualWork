<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="java.util.*" %>
<%@page import="cn.edu.cumt.ec.dao.BuyList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>购物车</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/buycar.css" rel="stylesheet">
</head>
<body>
	<div class="topBar">
		<div class="comWidth">
			<div class="fl">
				<a href="#" class="collection">收藏perfect</a>
			</div>
			<div class="fr">
				<%if(session.getAttribute("cuname")==null){ %>
				欢迎来到普菲克特超市！&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="loginForm">[登录]&nbsp;&nbsp;</a>
				<%}else{ %>
				本站访问次数为：${applicationScope.counter}&nbsp;&nbsp;&nbsp;&nbsp;
				欢迎来到普菲克特超市！&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="backdeal">[退出]&nbsp;&nbsp;</a>
				<%} %>
				<a href="registerForm">[免费注册]</a>
			</div>
		</div>
	</div>
	<div class="logoBar">
			<p class="perfect">perfect购物车页面</p>
	</div>
	<div class="mainBar">
	<form action="orderForm" method="post">
				<table id="cartTable">
						<thead>
							<tr>
								<th><label><input class="check-all check" type="checkbox"/>&nbsp;全选</label></th>
								<th>序号</th>
								<th>商品</th>
								<th>单价</th>
								<th>数量</th>
								<th>小计</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						    <%
    List shopList= (List) session.getAttribute("shop");

      if (shopList==null||shopList.size()==0) {
    %>
<script language="javascript" type="text/javascript">
   alert("购物车没有物品");
    window.location.href=document.referrer;
</script>
    <%
      } else {
        for (int t = 0; t < shopList.size(); t++) {
          BuyList shop = (BuyList) shopList.get(t);
    %>
							<tr>
								<td class="checkbox"><input class="check-one check" type="checkbox"/></td>
								<td class="operation"><%=t+1%></td>
								<td class="goods"><img src="<%=shop.photo%>" alt=""/><span><%=shop.warename%></span></td>
								<td class="price"><%=shop.price%></td>
								<td class="count">
									<span class="reduce"></span>
									<input name="<%=shop.id%>" class="count-input" type="text" value="1"/>
									<span class="add">+</span></td>
								<td class="subtotal"><%=shop.price%></td>
								<td class="operation"><span class="delete">删除</span></td>
							</tr>
							<%}%>
						</tbody>
					</table>
					<div class="foot" id="foot">
						<label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;全选</label>
						<a class="delete" id="deleteAll" href="javascript:;">清空</a>
						<div class="fr closing">
						<%if(session.getAttribute("cuname")!=null){ %>
						<button class="buttonformat" type="submit">去结算</button>
						<%}else{ %>
						<button class="buttonformat" type="button" onclick="alert('请先登录！')">去结算</button>
						<%} %>
						</div>
						<div class="fr total">合计：￥<input name="totalprice" id="priceTotal" value="0.0"/></div>
						<div class="fr selected" id="selected">已选商品
							<span id="selectedTotal">0</span>件
							
							<span class="arrow up">︽</span>
							<span class="arrow down">︾</span>
						</div>
						<div class="selected-view">
							<div id="selectedViewList" class="clearfix">
								<!--<div><img src="images/1.jpg"><span>取消选择</span></div>-->
							</div>
							<span class="arrow">◆<span>◆</span></span>
						</div>
					</div>
    <%}    %>
    </form>
	</div>
	<hr/>
	<div class="container">
		<div class="row">
			<div class="col-md-2">
			</div>
			<div class="col-md-8">
				<footer>
					<p class="alc">Copyright &copy;2016-2018  普菲克特perfect 版权所有</p>
				</footer>
			</div>
			<div class="col-md-2">
			</div>
		</div>
	</div>

<script src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>