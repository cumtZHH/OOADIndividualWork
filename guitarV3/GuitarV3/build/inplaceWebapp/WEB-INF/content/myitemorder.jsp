<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.OrderItem"%>
<%@ page import="cn.edu.cumt.ec.dao.BuyList"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<jsp:useBean id="orderitemDao" scope="request" class="cn.edu.cumt.ec.dao.OrderItemDao"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品详情</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link type="text/css" href="css/lrtk.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/lrtk.js"></script>
<style type="text/css">
a,img{border:0;}
p{margin:20px 0 10px 0;}
</style>
<script src="js/lrtk.js"></script>
<script src="js/jquery.js"></script>
</head>
<body>
	<div class="panel panel-default">
    	<div class="panel-heading">订单编号：<%=request.getParameter("oid") %></div>
			<div class="panel-body">
        	</div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>商品名称</th>
						<th>商品价格</th>
						<th>商品数量</th>
						<th>商品评价</th>
					</tr>
				</thead>
				<tbody>
			 	<%
					List list =orderitemDao.OrderShowid(request.getParameter("oid"));
					for(int i=0;i<list.size();i++){
  					OrderItem info=(OrderItem)list.get(i);
				%>
					<tr>
						<td><%=info.getOpname() %></td>
						<td><%=info.getOprice() %></td>
						<td><%=info.getOpcount() %></td>
						<td><button name="confirmgoods" data-cpid="<%=info.getOpid() %>" >确认收货</button></td>
					</tr>
				
				<%} %>
				</tbody>
			</table>
	</div>
	<div class="modal" id="mymodal">
    	<div class="modal-dialog">
        	<div class="modal-content">
            	<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				<h4 class="modal-title">商品评价</h4>
				</div>
			
			<div class="modal-body">
			请您打分：
		<form method="post" action="addcomment.action" enctype="multipart/form-data">
			<ul class="list-unstyled">
        		<li>物流：
        			<!--代码开始-->
					<div id="xzw_starSys" class="fr">
						<div id="xzw_starBox">
							<ul class="star" id="star">
								<li><a href="javascript:void(0)" title="1" class="one-star">1</a></li>
								<li><a href="javascript:void(0)" title="2" class="two-stars">2</a></li>
								<li><a href="javascript:void(0)" title="3" class="three-stars">3</a></li>
								<li><a href="javascript:void(0)" title="4" class="four-stars">4</a></li>
								<li><a href="javascript:void(0)" title="5" class="five-stars">5</a></li>
							</ul>
						<div class="current-rating" id="showb"></div>
					</div>
					<div>
					<input type="text" name="cspeed" class="description" style="border:none;width:20px;"/>
					</div>
					</div>
					<!--代码结束-->
        		</li>
        		<li><hr/></li>
       		  	<li>质量:
					<!--代码开始-->
					<div id="xzw_starSys" class="fr">
						<div id="xzw_starBox">
							<ul class="star2" id="star2">
								<li><a href="javascript:void(0)" title="1" class="one-star">1</a></li>
								<li><a href="javascript:void(0)" title="2" class="two-stars">2</a></li>
								<li><a href="javascript:void(0)" title="3" class="three-stars">3</a></li>
								<li><a href="javascript:void(0)" title="4" class="four-stars">4</a></li>
								<li><a href="javascript:void(0)" title="5" class="five-stars">5</a></li>
							</ul>
							<div class="current-rating" id="showb2"></div>
							</div>
						<div>
					<input type="text" name="cquality" class="description2" style="border:none;width:20px;"/>
					</div>
					</div>
					<!--代码结束-->
				</li>
				<li><hr/></li>
        		<li>服务:
					<!--代码开始-->
					<div id="xzw_starSys" class="fr">
						<div id="xzw_starBox">
							<ul class="star3" id="star3">
								<li><a href="javascript:void(0)" title="1" class="one-star">1</a></li>
								<li><a href="javascript:void(0)" title="2" class="two-stars">2</a></li>
								<li><a href="javascript:void(0)" title="3" class="three-stars">3</a></li>
								<li><a href="javascript:void(0)" title="4" class="four-stars">4</a></li>
								<li><a href="javascript:void(0)" title="5" class="five-stars">5</a></li>
							</ul>
						<div class="current-rating" id="showb3"></div>
					</div>
					<div>
					<input type="text" name="cservice" class="description3" style="border:none;width:20px;"/>
					</div>
					</div>
					<!--代码结束-->
				</li>
       	 </ul>
        <hr/>
		请留下您的评价：
<textarea type="text" name="cphrase" style="width:100%;" rows="3"></textarea>
		<hr/>
		图片评论：
		<input name="upload" type="file">
			</div>
			<input type="hidden" id="superspecial" name="cpid"/>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="submit" class="btn btn-primary">提交</button>
			</div>
			</form>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
$("[name='confirmgoods']").click(function(){
	$(this).text("等待评价");
	$(function(){
	    $("[name='confirmgoods']").click(function(){
	      $("#mymodal").modal("toggle");
	      $("#superspecial").val(this.dataset.cpid);
	    });
	  });
	})
</script>
</body>