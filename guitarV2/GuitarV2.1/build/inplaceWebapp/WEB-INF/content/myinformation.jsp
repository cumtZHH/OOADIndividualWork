<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>欢迎注册</title>
<link href="css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/register.css" rel="stylesheet"/>
<style type="text/css">
.reg-item{width:100px;}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="panel panel-default">
					<div class="panel-body">
					<form action="" method="post">
						<div class="register-box">
						
							<ul class="login list-unstyled">
								<li><span class="reg-item">修改头像：</span></li>
								<li><input type="button" class="btn-primary form-control" value="修改" onclick="window.location.href='myheadimg'"></li><br/>
								<li><span class="reg-item">姓名：</span></li>
								<li><input name="cname" type="text" class="form-control" placeholder="请输入您的姓名"></li><br/>
								<li><span class="reg-item">性别：</span></li>
								<li><input name="csex" type="text" class="form-control" placeholder="请输入您的性别"></li><br/>
								<li><span class="reg-item"><i>*</i><span class="glyphicon glyphicon-user"></span>账户名：</span></li>
								<li><input name="cuname" type="text" class="form-control" placeholder="请输入您的账户名"></li><br/>
								<li><span class="reg-item"><i>*</i><span class="glyphicon glyphicon-envelope"></span> 邮箱：</span></li>
								<li><input name="cemail" type="text" class="form-control" placeholder="请输入您的邮箱"></li><br/>
								<li><span class="reg-item"><i>*</i><span class="glyphicon glyphicon-home"></span> 地址：</span></li>
								<li><input name="caddress" type="text" class="form-control" placeholder="请输入您的默认收获地址"></li><br/>
								<li><span class="reg-item"><i>*</i><span class="glyphicon glyphicon-phone-alt"></span> 电话：</span></li>
								<li><input name="ctel" type="text" class="form-control" placeholder="请输入您的电话号码"></li><br/>
								
							</ul>
						</div>
						 <a href=""> <input class="btn btn-primary btn-lg btn-danger" value="修改&gt;&gt;" type="submit"/></a>
					</form>
					</div>
					
				</div>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>