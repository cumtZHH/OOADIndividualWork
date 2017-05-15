<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
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
				欢迎来到普菲克特超市！&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="login.html">[登录]&nbsp;&nbsp;</a>
				<a href="register.html">[免费注册]</a>
			</div>
		</div>
	</div>
	<div class="logoBar">
			<p class="perfect">perfect购物车页面</p>
	</div>
	<div class="mainBar">
					<table id="cartTable">
						<thead>
							<tr>
								<th><label><input class="check-all check" type="checkbox"/>&nbsp;全选</label></th>
								<th>商品</th>
								<th>单价</th>
								<th>数量</th>
								<th>小计</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="checkbox"><input class="check-one check" type="checkbox"/></td>
								<td class="goods"><img src="images/1.jpg" alt=""/><span>Casio/卡西欧 EX-TR350</span></td>
								<td class="price">5999.88</td>
								<td class="count">
									<span class="reduce"></span>
									<input class="count-input" type="text" value="1"/>
									<span class="add">+</span></td>
								<td class="subtotal">5999.88</td>
								<td class="operation"><span class="delete">删除</span></td>
							</tr>
							<tr>
								<td class="checkbox"><input class="check-one check" type="checkbox"/></td>
								<td class="goods"><img src="images/2.jpg" alt=""/><span>Canon/佳能 PowerShot SX50 HS</span></td>
								<td class="price">3888.50</td>
								<td class="count"><span class="reduce"></span><input class="count-input" type="text" value="1"/><span class="add">+</span></td>
								<td class="subtotal">3888.50</td>
								<td class="operation"><span class="delete">删除</span></td>
							</tr>
							<tr>
								<td class="checkbox"><input class="check-one check" type="checkbox"/></td>
								<td class="goods"><img src="images/3.jpg" alt=""/><span>Sony/索尼 DSC-WX300</span></td>
								<td class="price">1428.50</td>
								<td class="count"><span class="reduce"></span><input class="count-input" type="text" value="1"/><span class="add">+</span></td>
								<td class="subtotal">1428.50</td>
								<td class="operation"><span class="delete">删除</span></td>
							</tr>
							<tr>
								<td class="checkbox"><input class="check-one check" type="checkbox"/></td>
								<td class="goods"><img src="images/4.jpg" alt=""/><span>Fujifilm/富士 instax mini 25</span></td>
								<td class="price">640.60</td>
								<td class="count"><span class="reduce"></span><input class="count-input" type="text" value="1"/><span class="add">+</span></td>
								<td class="subtotal">640.60</td>
								<td class="operation"><span class="delete">删除</span></td>
							</tr>
						</tbody>
					</table>
					<div class="foot" id="foot">
						<label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;全选</label>
						<a class="fl delete" id="deleteAll" href="javascript:;">删除</a>
						<div class="fr closing"><a href="order.html">去结算</a></div>
						<div class="fr total">合计：￥<span id="priceTotal">0.00</span></div>
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
<script src="js/scriptc.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>