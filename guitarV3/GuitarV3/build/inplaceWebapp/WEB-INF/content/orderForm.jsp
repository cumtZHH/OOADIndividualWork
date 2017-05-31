<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="java.text.DateFormat" %>
<%@page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@page import="cn.edu.cumt.ec.dao.BuyList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>订单结算</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/order.css" rel="stylesheet">
<link href="css/styletwo.css" rel="stylesheet">
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
			<p class="perfect">perfect订单结算页面</p>
	</div>
	<div class="containerBar">
	<form method="post" action="order.action">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="panel panel-default ">
						<div class="panel-heading">收货信息</div>
						<div class="panel-body">
							<div class="shopping-cont padding-shop">
								<ul class="list-unstyled">
									<li>
										<span class="order-item"><em>*</em>选 择 地 区：</span>
										<div class="select">
											<select>  
											  <option value ="1">&nbsp; &nbsp; 上 海 &nbsp; &nbsp; </option>  
											  <option value ="2">&nbsp; &nbsp; 北 京 &nbsp; &nbsp; </option>  
											  <option value ="3">&nbsp; &nbsp; 江 苏 &nbsp; &nbsp; </option>  
											  <option value ="4">&nbsp; &nbsp; 浙 江 &nbsp; &nbsp; </option>  
											</select>  
										</div>
									</li><br/>
									<%int r1=(int)(Math.random()*(10));//产生2个0-9的随机数
									int r2=(int)(Math.random()*(10));
									long now = System.currentTimeMillis();//一个13位的时间戳
									String oid =String.valueOf(r1)+String.valueOf(r2)+String.valueOf(now);// 订单ID %>
									<li><span class="order-item"><em>*</em></span>订  单  号：
										<input name="oid" type="text" class="form-control fr" value="<%=oid%>">
									</li><br/>
									<li><span class="order-item"><em>*</em></span>详 细 地 址：
										<input name="oaddress" type="text" class="form-control fr" placeholder="最多输入20个汉字">
									</li><br/>
									<li><span class="order-item"><em>*</em></span>用  户  名：
										<input name="ocuname" type="text" class="form-control fr" placeholder="最多输入10个汉字" value="<%=session.getAttribute("cuname") %>">
									</li><br/> 
									<li><span class="order-item"><em>*</em></span>收  货  人：
										<input name="oname" type="text" class="form-control fr" placeholder="最多输入10个汉字">
									</li><br/> 
									<li><span class="order-item"><em>*</em></span>联 系 方 式：
										<input name="otel" type="text" class="form-control fr" placeholder="如12345678901">
									</li><br/>
								</ul>
							</div>
						</div>
					</div>	
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="panel panel-default ">
						<div class="panel-heading">支付方式</div>
						<div class="panel-body">
							<div class="shopping-cont padding-shop">
								<input type="radio" name="pay"/> &nbsp;&nbsp; &nbsp;&nbsp;<img src="images/icon/weixin.jpg" class="inmag-responsive" alt=""/>微信支付 扫一扫
							    <img src="images/icon/erweima.png" class="inmag-responsive" alt=""/><br/>
								<input type="radio" name="pay"/><img src="images/icon/alipay.jpg" class="inmag-responsive" alt=""/><br/>
								<input type="radio" name="pay"/><span>货到付款</span>
							</div>
						</div>
					</div>	
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="panel panel-default ">
						<div class="panel-heading">发票信息</div>
						<div class="panel-body">
								<div class="shopping-order padding-shop">
									<input type="checkbox"> 需要发票<br/>
									<ul class="list-unstyled">
										<li><span class="order-item"><em>*</em>发票类型：</span>
										<div class="select-order">
											<select>  
											  <option value ="1">商业零售发票 </option>  
											  <option value ="2"> 增值发票  </option>  
											  <option value ="3">企业发票 </option>  
											  <option value ="4">电子发票</option>  
											</select>  
										</div>
										</li><br/>
										<li><span class="order-item"><em>*</em>发票抬头：</span>
										<div class="select-order">
											<select>  
											  <option value ="1">个人</option>  
											  <option value ="2"> 企业</option>
											</select> 
											<input type="text" placeholder="请填写详细抬头"/> 
										</div>
										</li><br/>
										
									</ul>
							</div>
						</div>
					</div>	
				</div>
			</div>
		</div>
		<input type="hidden" name="ototalprice" value="<%=request.getParameter("totalprice")%>"/>
		 <%List shopList= (List) session.getAttribute("shop");
        for (int t = 0; t < shopList.size(); t++) {
          BuyList shop = (BuyList) shopList.get(t);%>
          <input type="hidden" name="<%=shop.id %>" value="<%=request.getParameter(shop.id)%>"/>
          
          <%} %>
		<button class="btn btn-primary btn-lg btn-block btn-danger" type="submit">提交订单</button> 
		</form>
	<!--  	<div class="modal" id="mymodal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
    			<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				<h4 class="modal-title">订单完成</h4>
			</div>
			<div class="modal-body">
				<p>订单已成功提交,期待您的再次光临</p><br/>
				<p><span class="glyphicon glyphicon-arrow-left fl"></span><span class="fl"><a href="index"> 回首页</a></span><span class="glyphicon glyphicon-arrow-right fr"></span></span><span class="fr"><a href=""> 查询订单状态</a></p>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default btn-danger" data-dismiss="modal">确定</button>
				<button type="button" class="btn btn-primary">取消</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
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
<script src="js/bootstrap.min.js"></script>
<!--  <script>
  $(function(){
    $(".btn").click(function(){
      $("#mymodal").modal("toggle");
    });
  });
</script>-->
</body>
</html>