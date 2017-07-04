<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>µÇÂ¼Ò³Ãæ</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/easyui/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/easyui/themes/default/easyui.css" />
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.2.3.min.js"></script> 
    <script type="text/javascript" src="<%=request.getContextPath()%>/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript">
	
		$(function(){
			$('#tt').tree({
				url: 'data/dept_tree.json',
				loadFilter: function(rows){
					return convert(rows);
				}
			});
		}); 
	</script>
</head>
<body>
	<select id="tt" class="easyui-combotree" style="width:200px;"></select>
</body>
</html>
