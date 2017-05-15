<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<ul id="menuTree" class="easyui-tree" data-options="url:'<%=basePath%>menuAction!getTreeNode.action',parentField:'pid',lines:true,onLoadSuccess:function(node, data){$(this).tree('collapseAll')}"></ul>
