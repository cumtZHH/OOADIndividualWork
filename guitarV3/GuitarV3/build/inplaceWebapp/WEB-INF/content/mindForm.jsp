<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>密码修改</title>
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
			<p class="perfect">密码修改页面</p>
	</div>
<hr/>

<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="login-box">
						<p style="color:red">${requestScope.tip}</p>
						<form action="mind.action" method="post">
							<ul class="login list-unstyled">
								<li class="l-tit"><span class="glyphicon glyphicon-user"></span> 账户名：</li>
								<li><input name="cuname" type="text" class="form-control" placeholder="请输入您的用户名"></li>
								<li class="l-tit"><span class="glyphicon glyphicon-envelope"></span> 邮箱：</span></li>
								<li><input name="cemail" type="text" class="form-control" placeholder="请输入您的邮箱"></li>
								<li class="l-tit"><span class="glyphicon glyphicon-phone-alt"></span> 电话号码：</span></li>
								<li><input name="ctel" type="text" class="form-control" placeholder="请输入您的电话号码"></li>
								<li class="l-tit"><span class="glyphicon glyphicon-lock"></span>新密码：</span></li>
								<li><input name="cpassword" type="password" class="form-control" placeholder="请输入您的新密码"></li><br/>
							</ul>
						</div>
						 <input class="btn btn-primary btn-lg btn-block l-button btn-danger" type="submit" value="修 改 密 码&gt;&gt;" />	 
					</form>
					</div>
					
				</div>
			</div>
			<div class="col-md-3"></div>			
		</div>
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