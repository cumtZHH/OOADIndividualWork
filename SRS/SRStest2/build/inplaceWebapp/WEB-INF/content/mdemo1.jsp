<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE> New Document </TITLE>
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
                            <input type="button" value="添&nbsp;&nbsp;加" class="add">
                        </div>
                        <div class="fr">
                            <div class="text">
                                <span>商品编号：</span>
                                <div class="bui_select">
                                    <select name="" id="" class="select">
                                        <option value="1">测试内容</option>
                                        <option value="1">测试内容</option>
                                        <option value="1">测试内容</option>
                                    </select>
                                </div>
                            </div>
                            <div class="text">
                                <span>上架时间：</span>
                                    <input class="easyui-datetimebox" required style="width:200px">
                            </div>
                            <div class="text">
                                <span>搜索</span>
                                <input type="text" value="" class="search">
                            </div>
                        </div>
                    </div>
                    <!--表格-->
                    <table class="table" cellspacing="0" cellpadding="0">
                        <thead>
                            <tr>
                                <th width="5%">商品编号</th>
                                <th width="20%">商品名称</th>
                                <th width="5%">商品类编号</th>
								<th width="5%">库存</th>
								<th width="10%">价格</th>
								<th width="15%">入库时间</th>
								<th width="20%">首页图片</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">p00001</label></td>
                                <td>衣品天成 2016夏装新品 T恤男短袖 潮韩版男士短袖T恤</td>
                                <td>00001</td>
								<td>10</td>
								<td>78</td>
								<td> </td>
								<td> </td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn" ></td>
                            </tr>
                             <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn"></td>
                            </tr>
                            <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn"></td>
                            </tr>
                             <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn" onclick="del_tr(this)"></td>
                            </tr>
                             <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn"></td>
                            </tr>
                             <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn"></td>
                            </tr>
                             <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn"></td>
                            </tr>
                            <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn"></td>
                            </tr>
                            <tr>
                                <!--这里的id和for里面的c1 需要循环出来-->
                                <td><input type="checkbox" id="c1" class="check"><label for="c1" class="label">001</label></td>
                                <td>后台设计</td>
                                <td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
								<td>测试内容</td>
                                <td align="center"><input type="button" value="修改" class="btn"><input type="button" value="删除" class="btn"></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
		
<script>
  function del_tr(obj) {
  	var conf = confirm('确定删除吗？');
	if(conf){
    $(obj).parent().parent().remove();
	}
  }
</script>
</body>
</html>

