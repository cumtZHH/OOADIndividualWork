<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>111</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/reset.css" rel="stylesheet">
<link href="css/introduce.css" rel="stylesheet">
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="js/base.js" type="text/javascript"></script>
</head>
<body>
<div id="preview">
<div class="jqzoom" id="spec-n1" onclick="">
<img height="300" src="images/4.jpg" jqimg="images/4.jpg" width="300">
</div>
<div id="spec-n5">
<!-- <div class="control" id="spec-left">
<img src="http://keleyi.com/keleyi/phtml/jqtexiao/19/images/left.gif" />
</div> -->
<div id="spec-list">
<ul class="list-h">
<li>
<img src="images/1.jpg">
</li>
<li>
<img src="images/2.jpg">
</li>
<li>
<img src="images/3.jpg">
</li>
<li>
<img src="images/4.jpg">
</li>
</ul>
</div>
<!-- <div class="control" id="spec-right">
<img src="http://keleyi.com/keleyi/phtml/jqtexiao/19/images/right.gif" />
</div> -->
</div>
<script type="text/javascript">
$(function () {
$(".jqzoom").jqueryzoom({
xzoom: 400,
yzoom: 400,
offset: 10,
position: "right",
preload: 1,
lens: 1
});
$("#spec-list").jdMarquee({
deriction: "left",
width: 350,
height: 56,
step: 2,
speed: 4,
delay: 10,
control: true,
_front: "#spec-right",
_back: "#spec-left"
});
$("#spec-list img").bind("mouseover", function () {
var src = $(this).attr("src");
$("#spec-n1 img").eq(0).attr({
src: src.replace("\/n5\/", "\/n1\/"),
jqimg: src.replace("\/n5\/", "\/n0\/")
});
$(this).css({
"border": "2px solid #ff6600",
"padding": "1px"
});
}).bind("mouseout", function () {
$(this).css({
"border": "1px solid #ccc",
"padding": "2px"
});
});
})
</script>
<script src="http://keleyi.com/keleyi/phtml/jqtexiao/19/js/lib.js" type="text/javascript"></script>
<script src="http://keleyi.com/keleyi/phtml/jqtexiao/19/js/keleyi.js" type="text/javascript"></script>
</div>
<div style="text-align: center; clear: both">
</div>
</body>
</html>