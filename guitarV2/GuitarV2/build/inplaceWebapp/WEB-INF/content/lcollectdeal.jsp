<%@page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage=""%>
<script type="text/javascript">
window.onload=function(){
	var conf=confirm("您尚未登录，请先登录！");
	if(conf){
		window.location.href="loginForm"; 
	}else{
		window.location.href="index";
	}
}
</script>