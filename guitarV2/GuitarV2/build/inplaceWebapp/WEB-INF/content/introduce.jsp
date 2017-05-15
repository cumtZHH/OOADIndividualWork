<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.Images"%>
<%@ page import="cn.edu.cumt.ec.entity.Product"%>
<%@ page import="cn.edu.cumt.ec.entity.Comment"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="img" scope="request" class="cn.edu.cumt.ec.dao.ImagesDao"/>
<jsp:useBean id="cmt" scope="request" class="cn.edu.cumt.ec.dao.CommentDao"/>
<jsp:useBean id="prot" scope="request" class="cn.edu.cumt.ec.dao.ProductionDao"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>普菲克特超市</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/reset.css" rel="stylesheet">
<link href="css/introduce.css" rel="stylesheet">
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="js/base.js" type="text/javascript"></script>
</head>
<body>
<!--整个头部-->
<div class="headerBar" id="top">
    <!--顶部-->
    <div class="topBar">
		<div class="comWidth">
			<div class="leftArea">
				<a href="#" class="collection">收藏perfect</a>
			</div>
			<div class="rightArea">
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
<!--logo和搜索-->
	<div class="container">
	<div class="row">
	<div class="col-md-11">
	<div class="logoBar">
		<div class="comWidth">
			<div class="logo fl">
			 	<a href="index"><img src="images/logo.jpg" alt="perfect"></a>
			</div>
			<div class="search-box fl">
				<input type="text" class=" form-control search-text fl"/>
				<button class="btn btn-danger search-btn fr" href="#"><span class="glyphicon glyphicon-search"></span></button>
			</div>
			<a href="buycar">
			    <div class="shopCar fr">
				<span class="shopText fl">购物车</span>
				<%if(session.getAttribute("yigou")==null){%>
				<span class="shopNum fl">0</span>
				<%}else{ %>
				<span class="shopNum fl"><%=session.getAttribute("yigou") %></span>
				<%} %>
				<span class="glyphicon glyphicon-menu-down fr"></span>
			</div></a>
		</div>
	</div>
	</div>
	<div class="col-md-1" style="margin-right:-15px;">
		<%if(session.getAttribute("cuname")!=null){ %>
		<div style="margin-right:-200px;margin-top:15px;margin-left:10px;" class="fr">
		<a href="mycount"><img src="<%=session.getAttribute("touxiang")%>" class="img-circle fl" alt="" style="width:50px;height:50px;"/></a>
		<a href="mycount" class="fl" style="font-size:20px;margin-left:10px;"><%= session.getAttribute("cuname")%></a>
		</div>
		<%} %>
	</div>
	</div>
	</div>
	<!--导航-->
	<div class="navbar navbar-default" role="navigation">
  <div class="navbar-header">
     　<!-- .navbar-toggle样式用于toggle收缩的内容，即nav-collapse collapse样式所在元素 -->
       <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".navbar-responsive-collapse">
         <span class="sr-only">Toggle Navigation</span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
       </button>
       <!-- 确保无论是宽屏还是窄屏，navbar-brand都显示 -->
       <a href="##" data-toggle="dropdown" class="dropdown-toggle shopclass">全部商品分类<span class="caret"></span></a>
              		<ul class="dropdown-menu">
        				<li><a href="##">家用电器</a></li>
						 <li role="presentation" class="divider"></li>
        				<li><a href="##">手机数码</a></li>
						 <li role="presentation" class="divider"></li>
        				<li><a href="##">家居家具、厨具</a></li>
						 <li role="presentation" class="divider"></li>
						<li><a href="##">服装饰品</a></li>
						 <li role="presentation" class="divider"></li>
						<li><a href="##">鞋靴箱包、珠宝</a></li>
						 <li role="presentation" class="divider"></li>
						<li><a href="##">个人护理、清洁用品</a></li>
          			</ul>
  </div>
  <!-- 屏幕宽度小于768px时，div.navbar-responsive-collapse容器里的内容都会隐藏，显示icon-bar图标，当点击icon-bar图标时，再展开。屏幕大于768px时，默认显示。 -->
  <div class="collapse navbar-collapse navbar-responsive-collapse">
    	<ul class="nav navbar-nav">
      		<li><a href="index">网站首页</a></li>
           		<li><a href="##">新品上架</a></li>
      		 	<li><a href="##">特价商品</a></li>
      	 		<li><a href="##">团购</a></li>
				<li><a href="##">二手特卖</a></li>
				<li><a href="##">海外产品</a></li>
				<li><a href="##">关于我们</a></li>
	 	</ul>
  </div>
</div>
</div>
<!--商品介绍主体部分-->
<!-- <div class="userPosition comWidth">
	<strong><a href="#">首页</a></strong>
	<span>&nbsp;&gt;&nbsp;</span>
	<a href="#">平板电脑</a>
	<span>&nbsp;&gt;&nbsp;</span>
	<em>MD531CH/A</em>
</div> -->
<div class="description_info comWidth">
	<div class="description clearfix">
		<div class="leftArea">
		<!--=========================================================  -->
<div id="preview">
<div class="jqzoom" id="spec-n1">
<%
List list =img.imgitemShow(request.getParameter("ipid"));
for(int i=0;i<list.size();i++){
  Images info=(Images)list.get(i);
%>
<img height="340" src="<%=info.getImgtwo()%>" jqimg="<%=info.getImgtwo()%>" width="300">
</div>
<div id="spec-n5">
<div id="spec-list">
<ul class="list-h">

<li>
<img src="<%=info.getImgone()%>">
</li>
<li>
<img src="<%=info.getImgtwo()%>">
</li>
<li>
<img src="<%=info.getImgthree()%>">
</li>
<li>
<img src="<%=info.getImgfour()%>">
</li>
<li>
<img src="<%=info.getImgfive()%>">
</li>

</ul>
</div>
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
<script src="js/lib.js" type="text/javascript"></script>
<script src="js/leyi.js" type="text/javascript"></script>
</div>
</div>
		<!--==================================  -->
		<div class="rightArea">
			<div class="des_content">
				<h3 class="des_content_tit"><%=info.getIname()%></h3>
				<%} %>
				<div class="dl clearfix">
					<div class="dt">perfect价</div>
					<div class="dd clearfix"><span class="des_money"><em>￥</em>78.00</span></div>
				</div>
				<div class="dl clearfix">
					<div class="dt">优惠</div>
					<div class="dd clearfix"><span class="hg"><i class="hg_icon">满换购</i><em>加价购，买就送</em></span></div>
				</div>
				<div class="des_position">
					<div class="dl clearfix">
						<div class="dt">送到</div>
						<div class="dd clearfix">
							<div class="select">
								<h3>徐州市区</h3><span></span>
								<ul class="show_select">
									<li>铜山区</li>
									<li>泉山区</li>
									<li>云龙区</li>
								</ul>
							</div>
							<span class="theGoods">有货，可当日出货</span>
						</div>
					</div>
					<div class="dl clearfix">
						<div class="dt colorSelect">选择颜色</div>
						<div class="dd clearfix">
							<div class="des_item des_item_acitve">
								军绿
							</div>
							<div class="des_item">
								大地
							</div>
							<div class="des_item">
								海蓝
							</div>
						</div>
						<div class="dt colorSelect">选择尺码</div>
						<div class="dd clearfix">
							<div class="des_item des_item_acitve">
								175
							</div>
							<div class="des_item">
								170
							</div>
							<div class="des_item">
								165
							</div>
						</div>
					</div>
				</div>
				<div class="des_select">
					已选择 <span>军绿</span>
				</div>
				<div class="shop_buy">
					<p>
<%
List listthree =prot.productionShowpid(request.getParameter("ipid"));
for(int i=0;i<listthree.size();i++){
  Product info=(Product)listthree.get(i);
%>
					<form name="form" method="post" action="addProductionc">
					<input type="hidden" name="name" value="<%=info.getPname()%>">
      				<input type="hidden" name="price" value="<%=info.getPrice()%>">
      				<input type="hidden" name="photo" value="<%=info.getPimg()%>">
      				<input type="hidden" name="id" value="<%=info.getPid()%>">
					<input type="submit" class="buy-box " value="加入购物车" />
					</form>
					<%} %>
					<a href="##"><input type="button" class="buy-box1" value="立即购买" style="margin-left:150px;margin-top:-40px;float:left;"/></a>
					</p>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="hr_15"></div>
<div class="des_info comWidth clearfix">
	<div class="leftArea">
		<div class="recommend">
			<h3 class="tit">同价位</h3>
			<div class="item">
				<div class="item_cont">
					<div class="img_item">
						<a href="#"><img src="images/shopImg.jpg" alt=""></a>
					</div>
					<p><a href="#">吴磊明星同款 衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</a></p>
					<p class="money">￥78.00</p>
				</div>
			</div>
			<div class="item">
				<div class="item_cont">
					<div class="img_item">
						<a href="#"><img src="images/shopimage.jpg" alt=""></a>
					</div>
					<p><a href="#">吴磊明星同款 衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</a></p>
					<p class="money">￥78.00</p>
				</div>
			</div>
			<div class="item">
				<div class="item_cont">
					<div class="img_item">
						<a href="#"><img src="images/shoimg.jpg" alt=""></a>
					</div>
					<p><a href="#">吴磊明星同款 衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</a></p>
					<p class="money">￥78.00</p>
				</div>
			</div>
			<div class="item">
				<div class="item_cont">
					<div class="img_item">
						<a href="#"><img src="images/shopimage.jpg" alt=""></a>
					</div>
					<p><a href="#">吴磊明星同款 衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</a></p>
					<p class="money">￥78.00</p>
				</div>
			</div>
		</div>
		<div class="hr_15"></div>
		<!-- <div class="recommend">
			<h3 class="tit">同价位</h3>
			<div class="item">
				<div class="item_cont">
					<div class="img_item">
						<a href="#"><img src="images/shopimage.jpg" alt=""></a>
					</div>
					<p><a href="#">吴磊明星同款 衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</a></p>
					<p class="money">￥78.00</p>
				</div>
			</div>
			<div class="item">
				<div class="item_cont">
					<div class="img_item">
						<a href="#"><img src="images/shopImg.jpg" alt=""></a>
					</div>
					<p><a href="#">吴磊明星同款 衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</a></p>
					<p class="money">￥78.00</p>
				</div>
			</div>
			<div class="item">
				<div class="item_cont">
					<div class="img_item">
						<a href="#"><img src="images/shoimg.jpg" alt=""></a>
					</div>
					<p><a href="#">吴磊明星同款 衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</a></p>
					<p class="money">￥78.00</p>
				</div>
			</div>
		</div> -->
	</div>
	<div class="rightArea">
		<div class="des_infoContent">
			<!-- 选项卡组件（菜单项nav-tabs）-->
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			    <li class="active"><a href="#bulletin" role="tab" data-toggle="tab">&nbsp;&nbsp;&nbsp;&nbsp; 商品介绍 &nbsp;&nbsp;&nbsp;&nbsp;    </a></li>
			    <li><a href="#rule" role="tab" data-toggle="tab">&nbsp;&nbsp;&nbsp;&nbsp; 商品评论&nbsp;&nbsp;&nbsp;&nbsp; </a></li>
			   
			</ul>
			<!-- 选项卡面板 -->
			<div id="myTabContent" class="tab-content">
				<div class="tab-pane active" id="bulletin">
						<div class="info_text">
							<div class="info_tit">
								<h3>强烈推荐</h3><h4>货比三家，还选</h4>
							</div>
							<div class="hr_45"></div>
							<img src="images/leo.jpg" class="center">
							<div class="hr_45"></div>
						</div>
				</div>
				<div class="tab-pane" id="rule">
					<h3 class="shopDes_tit">商品评价</h3>
					<div class="score_box clearfix">
						<div class="score">
							<span>4.7</span><em>分</em>
						</div>
						<div class="score_speed">
							<div class="progress">
							 	<div class="progress-bar progress-bar-warning" style="width:80%"></div>
							</div> 
							<div class="score_num">
								4.7<i></i>
							</div>
						</div>
					</div>
					<div class="review_tab">
						<ul class="review fl">
							<li><a class="active">全部</a></li>
							<li><a>满意（3121）</a></li>
							<li><a>一般（321）</a></li>
							<li><a>不满意（1121）</a></li>
						</ul>
						<div class="review_sort fr">
							<a href="#" class="review_time">时间排序</a><a href="#" class="review_reco">推荐排序</a>
						</div>
					</div>
					<div class="review_listBox">
					<%
List listone =cmt.CommentShow(request.getParameter("ipid"));
for(int i=0;i<listone.size();i++){
  Comment info=(Comment)listone.get(i);
%>
						<div class="review_list clearfix">
							<div class="review_userHead fl">
								<div class="review_user">
									<img src="uploadFiles/moren.jpg" alt="">
									<p><%=info.getCusername() %></p>
									<p>金色会员</p>
								</div>
							</div>
							<div class="review_cont">
								<div class="review_t clearfix">
									<div class="starsBox fl"><span class="stars"></span><span class="stars"></span><span class="stars"></span><span class="stars"></span><span class="stars"></span></div>
									<span class="stars_text fl">物流：<%=info.getCspeed() %></span>
									<span class="stars_text fl">质量：<%=info.getCquality() %></span>
									<span class="stars_text fl">服务：<%=info.getCservice() %> </span>
								</div>
								<p><%=info.getCphrase()%></p>
								<p><img src="<%=info.getCimage()%>"/></p>
								<p><a href="#" class="ding">顶(0)</a><a href="#" class="cai">踩(0)</a></p>
							</div>
						</div>
						<%} %>
						<!-- <div class="review_list clearfix">
							<div class="review_userHead fl">
								<div class="review_user">
									<img src="images/userhead.jpg" alt="">
									<p>61***42</p>
									<p>金色会员</p>
								</div>
							</div>
							<div class="review_cont">
								<div class="review_t clearfix">
									<div class="starsBox fl"><span class="stars"></span><span class="stars"></span><span class="stars"></span><span class="stars"></span><span class="stars"></span></div>
									<span class="stars_text fl">5分 满意</span>
								</div>
								<p>赖慕课挺不错的信赖慕课挺不错的，信赖慕课</p>
								<p><a href="#" class="ding">顶(0)</a><a href="#" class="cai">踩(0)</a></p>
							</div>
						</div> -->
						<div class="hr_25"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!--底部版权-->
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
<!-- <script src="js/jquery-1.11.1.min.js"></script>-->
<script src="js/bootstrap.min.js"></script> 
</body>