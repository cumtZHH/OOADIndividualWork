<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>修改头像</title>
<link href="css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/register.css" rel="stylesheet"/>
<style type="text/css">
.reg-item{width:100px;}
#clipArea {
	margin: 20px;
	height: 300px;
}
#file,
#clipBtn {
	margin: 20px;
}
#view {
	margin: 0 auto;
	width: 200px;
	height: 200px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="panel panel-default">
					<div class="panel-body">
					<form action="addheadimg" method="post" enctype="multipart/form-data">
						<div class="register-box">
						
							<ul class="login list-unstyled">
								<li><span class="reg-item">选择头像：</span></li>
								<li><!-- <input name="upload" type="file"> -->
									<div id="clipArea"></div>
									<input type="file" id="file" name="upload">
									<input type="button" id="clipBtn" value="截取"/>
									<div id="view"></div>
								</li>
								
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
<script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
<script src="js/iscroll-zoom.js"></script>
<script src="js/hammer.js"></script>
<script src="js/lrz.all.bundle.js"></script>
<script src="js/jquery.photoClip.js"></script>
<script>
//document.addEventListener('touchmove', function (e) { e.preventDefault(); }, false);
var clipArea = new bjj.PhotoClip("#clipArea", {
	size: [260, 260],
	outputSize: [450, 450],
	file: "#file",
	view: "#view",
	ok: "#clipBtn",
	loadStart: function() {
		console.log("照片读取中");
	},
	loadComplete: function() {
		console.log("照片读取完成");
	},
	clipFinish: function(dataURL) {
		console.log(dataURL);
	}
});
//clipArea.destroy();
</script>
<!-- <script src="js/jquery-1.11.1.min.js"></script> -->
<script src="js/bootstrap.min.js"></script>
</body>