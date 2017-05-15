<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<link href="static/uploadify/uploadify.css" rel="stylesheet"  
    type="text/css" />  
<script type="text/javascript"  
    src="static/uploadify/jquery-1.4.2.min.js"></script>  
<script type="text/javascript" src="static/uploadify/swfobject.js"></script>  
<script type="text/javascript"  
    src="static/uploadify/jquery.uploadify.v2.1.4.min.js"></script>  
<script type="text/javascript">  
    $(document).ready(function() {  
        $("#uploadify").uploadify({  
            'uploader' : 'static/uploadify/uploadify.swf', //是组件自带的flash，用于打开选取本地文件的按钮  
            'script' : 'upload.action',//处理上传的路径，这里使用Struts2是XXX.action  
            'scriptData' :{'catId':$('#catId').val()},  
            'cancelImg' : 'static/uploadify/cancel.png',//取消上传文件的按钮图片，就是个叉叉  
            'folder' : 'uploads',//上传文件的目录  
            'fileDataName' : 'uploadify',//和input的name属性值保持一致就好，Struts2就能处理了  
            'queueID' : 'fileQueue',  
            'auto' : false,//是否选取文件后自动上传  
            'multi' : true,//是否支持多文件上传  
            'simUploadLimit' : 1,//每次最大上传文件数  
            'queueSizeLimit' : 50,  
            'removeCompleted' : true,  
            'buttonText' : 'BORWSE',//按钮上的文字  
            'displayData' : 'percentage',//有speed和percentage两种，一个显示速度，一个显示完成百分比  
            'fileDesc' : '支持格式:jpg/gif/jpeg/png/bmp.', //如果配置了以下的'fileExt'属性，那么这个属性是必须的  
            'fileExt' : '*.jpg;*.gif;*.jpeg;*.png;*.bmp',//允许的格式  
            'onComplete' : function(event, queueID, fileObj, response, data) {  
                //$("#result").html(response);//显示上传成功结果  
                //setInterval("showResult()", 2000);//两秒后删除显示的上传成功结果  
                window.location.href="photoManage/uploadPhoto.action?catId="+$('#catId').val();//上传成功后跳转，并传递参数  
            }  
        });  
    });  
  
    //function showResult() {//删除显示的上传成功结果  
    //  $("#result").html("");  
    //}  
    function uploadFile() {//上传文件  
        jQuery('#uploadify').uploadifyUpload();  
    }  
    function clearFile() {//清空所有上传队列  
        jQuery('#uploadify').uploadifyClearQueue();  
    }  
</script>  
                <input type="file" name="uploadify" id="uploadify"/>  
                <s:hidden name="catId"></s:hidden> //上传成功后要传递的参数值                 
                <div>                  
                        <div id="fileQueue"></div>                   
                </div>  
                <input type="button" onclick="uploadFile()"  value="开始上传">   
                <input type="button" onclick="clearFile()" value="取消所有上传">  