<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>个人账户</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/order.css" rel="stylesheet">
<style type="text/css">
.nav1{
width:140px;
height:1000px;
margin-right:10px;
float:left;
overflow:auto;
border:none;
position:fixed;
}
.nav1 a{text-decoration:none;color:#666666;}
.nav2{
margin-left:140px;
width:1600px;
float:left;
border:none;
}
#myframe{
width:100%;
height:1000px;
overflow:hidden;
border:none;
}
 
</style>
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
			<p class="perfect">perfect个人账户页面</p>
	</div>
<div class="media">
    <a class="pull-left" href="myheadimg" target="myframe">
        <img class="media-object img-circle" src="<%=session.getAttribute("touxiang") %>" alt="..." style="width:140px;height:140px;margin-left:150px;">
  	</a>
  	<div class="media-body">
    	<h3 class="media-heading" style="margin-top:50px;margin-left:50px;"><%=session.getAttribute("cuname") %></h3>
  	</div>
</div>
<hr/>
<div class="nav1">
<ul>
<li><a href="myinformation" target="myframe">修改个人信息</a></li>
<li><a href="myorder.action" target="myframe">我的订单</a></li>
<li><a href="mycollection.action" target="myframe">我的收藏</a></li>
<li><a href="mindForm">修改密码</a></li>
<li><a href="buycar">我的购物车</a></li>
<li><a href="index">回首页</a></li>
</ul>
</div>
<div class="nav2" id="main">
<iframe src="myorder" id="myframe" name="myframe">
</iframe>
</div>
</body>
</html>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>