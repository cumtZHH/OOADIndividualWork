<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.Guitar"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> 后台查询页面 </TITLE>
  <META NAME="Generator" CONTENT="EditPlus">
  <META NAME="Author" CONTENT="">
  <META NAME="Keywords" CONTENT="">
  <META NAME="Description" CONTENT="">
  <link rel="stylesheet" href="mcss/backstage.css">
  <link rel="stylesheet" type="text/css" href="mcss/easyui.css">
	<link rel="stylesheet" type="text/css" href="mcss/icon.css">
	<link rel="stylesheet" type="text/css" href="mcss/demo.css">
	<script type="text/javascript" src="mjs/jquery.min.js"></script>
	<script type="text/javascript" src="mjs/jquery.easyui.min.js"></script>
 </HEAD>
<body>
            <div class="cont">
                <div class="title">产品管理</div>
                <div class="details">
                    <div class="details_operation clearfix">
                      <div class="bui_select">
                            <a href="maddproduct"><input type="button" value="添&nbsp;&nbsp;加" class="add2" style="cursor:pointer"></a>
                        </div>
                        <div class="fr">
                            <div class="text">
                                <span>商品编号：</span>
                                    <input type="text" value="" class="search">
                            </div>
                            <div class="text">
                                <span>商品类编号：</span>
                                    <input type="text" value="" class="search">
                            </div>
                            <div class="text">
                                <span>上架时间：</span>
                                    <input class="easyui-datetimebox" required style="width:200px">
                            </div>
                            <form action="consult" method="post" class="fr">
                            <div class="text">
                                <input type="submit" value="查询" class="search2"/>
                            </div>
                            </form>
                        </div>
                    </div>
                    <!--表格-->
                    <table class="table" cellspacing="0" cellpadding="0">
                    <tr>
	                   <td>serialNumber</td>
	                   <td>price</td>
	                   <td>builder</td>
	                   <td>model</td>
	                   <td>type</td>
	                   <td>backWood</td>
	                   <td>topWood</td>
	                   <td>option</td>
                     </tr>
                   <s:iterator value="#request.guitarAll" id="g" status="st">
	<tr>
       <td><s:property value="#g.serialNumber"/></td>
       <td><s:property value="#g.price"/></td>
       <td><s:property value="#g.spec.builder"/></td>
       <td><s:property value="#g.spec.model"/></td>
       <td><s:property value="#g.spec.type"/></td>
       <td><s:property value="#g.spec.backWood"/></td>
       <td><s:property value="#g.spec.topWood"/></td>
       <td><input type="button" data-pid="<s:property value="#guitar.serialNumber"/>" value="删除" class="btn" onclick="del_tr(this)" ></td>
     </tr>
</s:iterator>
                    </table>
                </div>
            </div>
        </div>
		
<script>
  function del_tr(obj) {
  	var conf = confirm('确定删除吗？');
	if(conf){
    $(obj).parent().parent().remove();
    var pid= obj.dataset.pid; 
    $.post("deleteproduct",{ pid: pid });
	}
  }
</script>
</body>
</html>

