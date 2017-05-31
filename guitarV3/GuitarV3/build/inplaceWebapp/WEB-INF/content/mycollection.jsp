<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>个人收藏</title>
<link href="css/bootstrap.min.css" rel="stylesheet"/>
<style type="text/css">
.fl{float:left;}
.price{color:#CC0000;font-size:18px;font-weight:bold;}
/* button伪装成超链接形式  */
button{
    font-size: 1em;
    text-align: center;
    color:#000;
    background: none;
    margin: 10px;
    padding: 0;
    border: none;
    cursor: pointer;
    outline:none;
}
</style>

</head>
<body>
	<div class="container">
		<div class="row">
<p></p>
			 <table class="table">
   <thead>
     <tr>
       <th width="10%">序号</th>
       <th>商品</th>
	<th width="20%">操作</th>
     </tr>
   </thead>
   <tbody>
<s:iterator value="#request.lcollect" id="lcollection" status="st">
	<tr>
       <td><s:property value="#st.count"/></td>
       <td>
		<img src="<s:property value="#lcollection.lpimg"/>" class="fl"/>	
		<div class="fl">
		<p><s:property value="#lcollection.lpname"/></p>	
		<p class="price">￥<s:property value="#lcollection.lprice"/></p>
		</div>
       </td>
       <td>
       <form name="form" method="post" action="addProductionc">
								<input type="hidden" name="name" value="<s:property value="#lcollection.lpname"/>"/>
      							<input type="hidden" name="price" value="<s:property value="#lcollection.lprice"/>"/>
      							<input type="hidden" name="photo" value="<s:property value="#lcollection.lpimg"/>"/>
      							<input type="hidden" name="id" value="<s:property value="#lcollection.lpid"/>"/>
       <button type="submit" >加入购物车</button>
       </form>
       <button type="submit" data-lpid="<s:property value="#lcollection.lpid"/>" onclick="del_tr(this)">删除</button>
       </td>
     </tr>
</s:iterator>
   </tbody>
 </table>
		</div>
	</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
function del_tr(obj) {
  	var conf = confirm('确定删除吗？');
	if(conf){
    $(obj).parent().parent().remove();
    var lpid= obj.dataset.lpid; 
    $.post("deletecollection",{ lpid: lpid });
	}
  }
</script>
</body>