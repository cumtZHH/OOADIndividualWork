<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理页面</title>
    <link href="css/default.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="mjs/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="mjs/themes/icon.css" />
    <script type="text/javascript" src="mjs/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="mjs/jquery.easyui.min-1.2.0.js"></script>
    <script type="text/javascript" src="mjs/outlook.js"> </script>
</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
    <div region="north" split="true" border="false" style="overflow: hidden; height: 40px;
        background: url(images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%;
        line-height: 30px; color: #fff; font-family: Verdana, 微软雅黑,黑体">
        <span style="float: right; padding-right: 20px;" class="head">欢迎 <a href="#" id="editpass">
            修改密码</a> <a href="#" id="loginOut">安全退出</a></span> <span style="padding-left: 10px;
                font-size: 16px; float: left;">
                     普菲克特</span>
        <ul id="css3menu" style="padding: 0px; margin: 0px; list-type: none; float: left;
            margin-left: 40px;">
            <li><a class="active" name="basic" href="javascript:;" title="常用菜单">常用菜单</a></li>
            <li><a name="point" href="javascript:;" title="邮件列表">邮件列表</a></li>
        </ul>
    </div>
    <div region="south" split="true" style="height: 30px; background: #D2E0F2;">
        <div class="footer">
            PERFECT</div>
    </div>
    <div region="west" hide="true" split="true" title="导航菜单" style="width: 180px;" id="west">
        <div id='wnav' class="easyui-accordion" fit="true" border="false">
            <!--  导航内容 -->
            <!-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ -->
            <ul id="tt" class="easyui-tree"></ul>
<script>    
$(document).ready(function(){ 
    $('#tt').tree({ 
        data:[{"id":0 , "text":"Folder"}],
        url: 'jsonx.action' 
    }); 
});
</script>
<!--+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  -->
        </div>
    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y: hidden">
        <div id="tabs" class="easyui-tabs" fit="true" border="false">
            <div title="欢迎使用" style="padding: 20px; overflow: hidden;" id="home">
                <h1>
                    Welcome !</h1>
            </div>
        </div>
    </div>
    <div id="mm" class="easyui-menu" style="width: 150px;">
        <div id="mm-tabupdate">
            刷新</div>
        <div class="menu-sep">
        </div>
        <div id="mm-tabclose">
            关闭</div>
        <div id="mm-tabcloseall">
            全部关闭</div>
        <div id="mm-tabcloseother">
            除此之外全部关闭</div>
        <div class="menu-sep">
        </div>
        <div id="mm-tabcloseright">
            当前页右侧全部关闭</div>
        <div id="mm-tabcloseleft">
            当前页左侧全部关闭</div>
        <div class="menu-sep">
        </div>
        <div id="mm-exit">
            退出</div>
    </div>
</body>
</html>
