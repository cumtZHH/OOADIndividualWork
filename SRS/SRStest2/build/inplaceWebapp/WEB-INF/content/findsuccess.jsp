<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>密码找回</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/find.css" rel="stylesheet">
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
			<p class="perfect">密码找回页面</p>
	</div>
<hr/>
<div class="find-back">
<p class="special">您的密码是:${requestScope.tip}</p>
<p class="special-p"><span><a href="index">回首页</a></span><span class="special-s"><em><a href="mindForm">建议修改密码</a></em></span></p>
</div>
	<hr class="divider"/>
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
<script src="js/bootstrap.min.js"></script>
</body>