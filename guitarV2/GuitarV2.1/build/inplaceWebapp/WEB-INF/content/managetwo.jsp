<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
    <title>普菲克特后台管理</title>
    <link href="mcss/default.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="mjs/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="mjs/themes/icon.css" />
	<link rel="stylesheet" href="mcss/login.css" media="all">
<script src="mjs/jquery.min.js"></script>
    <script type="text/javascript" src="mjs/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="mjs/jQuery.easyui.js"></script>
	<script type="text/javascript" src="mjs/outlook2.js"> </script>
	<script>
jQuery(document).ready(function($) {
	$('.theme-login').click(function(){
		$('.theme-popover-mask').fadeIn(100);
		$('.theme-popover').slideDown(200);
	})
	$('.theme-poptit .close').click(function(){
		$('.theme-popover-mask').fadeOut(100);
		$('.theme-popover').slideUp(200);
	})

})
</script>

    <script type="text/javascript">
	
	 var _menus = {"menus":[
						/*{"menuid":"1","icon":"icon-sys","menuname":"系统管理",
							"menus":[
									{"menuname":"添加用户","icon":"icon-add","url":"demo.html"},
									{"menuname":"用户管理","icon":"icon-users","url":"demo2.html"},
									{"menuname":"角色管理","icon":"icon-role","url":"demo2.html"},
									{"menuname":"权限设置","icon":"icon-set","url":"demo.html"},
									{"menuname":"系统日志","icon":"icon-log","url":"demo.html"}
								]
						},*/{"menuid":"28","icon":"icon-sys","menuname":"商品管理",
							"menus":[{"menuname":"商品分类","icon":"icon-nav","url":"mdemo"},
									{"menuname":"商品列表","icon":"icon-nav","url":"mdemo1"},
									{"menuname":"图片上传","icon":"icon-nav","url":"mdemo"}
								]
						},/*{"menuid":"8","icon":"icon-sys","menuname":"会员管理",
							"menus":[{"menuname":"添加会员","icon":"icon-nav","url":"demo.html"},
									{"menuname":"视频监控","icon":"icon-nav","url":"demo1.html"}
								]
						},*/{"menuid":"56","icon":"icon-sys","menuname":"订单管理",
							"menus":[{"menuname":"订单查询","icon":"icon-nav","url":"demo1.html"},
									{"menuname":"状态通知","icon":"icon-nav","url":"demo2.html"}
								]
						},{"menuid":"28","icon":"icon-sys","menuname":"采购管理",
							"menus":[{"menuname":"收支分类","icon":"icon-nav","url":"demo.html"},
									{"menuname":"报表统计","icon":"icon-nav","url":"demo1.html"},
									{"menuname":"添加支出","icon":"icon-nav","url":"demo.html"}
								]
						},{"menuid":"39","icon":"icon-sys","menuname":"库存管理",
							"menus":[{"menuname":"商品库存","icon":"icon-nav","url":"/shop/productcatagory.aspx"}/*,
									{"menuname":"商品列表","icon":"icon-nav","url":"/shop/product.aspx"},
									{"menuname":"商品订单","icon":"icon-nav","url":"/shop/orders.aspx"}*/
								]
						}
				]};
        //设置登录窗口
        function openPwd() {
            $('#w').window({
                title: '修改密码',
                width: 300,
                modal: true,
                shadow: true,
                closed: true,
                height: 160,
                resizable:false
            });
        }
        //关闭登录窗口
        function close() {
            $('#w').window('close');
        }

        

        //修改密码
        function serverLogin() {
            var $newpass = $('#txtNewPass');
            var $rePass = $('#txtRePass');

            if ($newpass.val() == '') {
                msgShow('系统提示', '请输入密码！', 'warning');
                return false;
            }
            if ($rePass.val() == '') {
                msgShow('系统提示', '请在一次输入密码！', 'warning');
                return false;
            }

            if ($newpass.val() != $rePass.val()) {
                msgShow('系统提示', '两次密码不一至！请重新输入', 'warning');
                return false;
            }

            $.post('/ajax/editpassword.ashx?newpass=' + $newpass.val(), function(msg) {
                msgShow('系统提示', '恭喜，密码修改成功！<br>您的新密码为：' + msg, 'info');
                $newpass.val('');
                $rePass.val('');
                close();
            })
            
        }

        $(function() {

            openPwd();
            //
            $('#editpass').click(function() {
                $('#w').window('open');
            });

            $('#btnEp').click(function() {
                serverLogin();
            })

           

            $('#loginOut').click(function() {
                $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {

                    if (r) {
                        location.href = '/ajax/loginout.ashx';
                    }
                });

            })
			
			
			
        });
		
		

    </script>

</head>
<body class="easyui-layout" style="overflow-y: hidden"  scroll="no">
<noscript>
<div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
    <img src="images/noscript.gif" alt='抱歉，请开启脚本支持！' />
</div></noscript>
    <div region="north" split="true" border="false" style="overflow: hidden; height: 30px;
        background: url(images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%;
        line-height: 20px;color: #fff; font-family: Verdana, 微软雅黑,黑体">
        <span style="float:right; padding-right:20px;" class="head">您好，<a href="javascript:;" class="theme-login">请登录</a> </span>
        <span style="padding-left:10px; font-size: 16px; ">普菲克特超市</span>
    </div>
    <div region="south" split="true" style="height: 30px; background: #D2E0F2; ">
        <div class="footer">PERFECT</div>
    </div>
    <div region="west" split="true" title="导航菜单" style="width:180px;" id="west">
<div class="easyui-accordion" fit="true" border="false">
		<!--  导航内容 -->
				
			</div>

    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
			<div title="欢迎使用" style="padding:20px;overflow:hidden;" id="home">
				
			<h1>Welcome to jQuery UI!</h1>

			</div>
		</div>
    </div>
    
    
    <!--修改密码窗口-->
    <div id="w" class="easyui-window" title="修改密码" collapsible="false" minimizable="false"
        maximizable="false" icon="icon-save"  style="width: 300px; height: 150px; padding: 5px;
        background: #fafafa;">
        <div class="easyui-layout" fit="true">
            <div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
                <table cellpadding=3>
                    <tr>
                        <td>新密码：</td>
                        <td><input id="txtNewPass" type="password" class="txt01" /></td>
                    </tr>
                    <tr>
                        <td>确认密码：</td>
                        <td><input id="txtRePass" type="password" class="txt01" /></td>
                    </tr>
                </table>
            </div>
            <div region="south" border="false" style="text-align: right; height: 30px; line-height: 30px;">
                <a id="btnEp" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)" >
                    确定</a> <a class="easyui-linkbutton" icon="icon-cancel" href="javascript:void(0)"
                        onclick="closeLogin()">取消</a>
            </div>
        </div>
    </div>

	<div id="mm" class="easyui-menu" style="width:150px;">
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">退出</div>
	</div>
	<div class="theme-popover">
     <div class="theme-poptit">
          <a href="javascript:;" title="关闭" class="close">×</a>
          <h3>登录</h3>
     </div>
     <div class="theme-popbod dform">
           <form class="theme-signin" name="loginform" action="" method="post">
                <ol>
                     <li><strong>用户名：</strong><input class="ipt" type="text" name="log" placeholder="请输入用户名" size="20" /></li>
                     <li><strong>密码：</strong><input class="ipt" type="password" name="pwd" placeholder="请输入密码" size="20" /></li>
                     <li><input class="btn btn-primary" type="submit" name="submit" value=" 登 录 " /></li>
                </ol>
           </form>
     </div>
</div>
</body>
</html>