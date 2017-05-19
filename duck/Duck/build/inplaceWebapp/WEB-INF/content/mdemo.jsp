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
 </HEAD>
<body>
            <script type="text/javascript">
$(function(){
	var ctxMenu = $('#ctxMenu1');
	var tree = $('#tree1');
	tree.mac('dtree', {
		treeConfig: {
			title: 'All Regions',
			rootVisible: true
		},
		ctxMenu: ctxMenu,
		menuOffset: { x: 0, y: 0 },
		doInsert: function(dt, callback){
			var d = dt.data;
			d.level = d.level?d.level:0;
			var p = { level: 1, path: '/', parent: 'root' };
			if(d.level>0){
				p.parent = d.key;
				p.level = d.level + 1;
				if(d.level==1){
					p.path = '/'+ d.key + '/';
				}else{
					p.path = d.path + d.key + '/';
				}
				p.value = d.value;
			}
			App.open({
				action: 'editRegion',
				title: 'Add Region',
				modal: true,
				params: p
			}, function(dd){
				callback(dd);
				//dt.deactivate();
				//dt.activate();
			});
		},
		doUpdate: function(dt, callback){
			var d = dt.data;
			App.open({
				action: 'editRegion',
				title: 'Edit Region',
				modal: true,
				params: d
			}, function(dd){
				callback(dd);
			});
		},
		doDelete: function(dt, callback){
			App.confirm('Are you sure you want to delete?', function(){
				App.alert('Delete is not allowed in this demo.')
//				var p = { id: dt.data.key, level: dt.data.level };
//				$.post('delete.php', p, function(data){
//					var ro = App.eval(data);
//					if(ro.success){
//						App.alert(Msg.info.success, [ Msg.del ]);
//						callback();
//						var tx = tree.getNode(dt.data.parent);
//						tx.activate();
//					}else{
//						App.alert(ro.data, ro.params);
//					}
//				});
			});
		},
		loader: {
			url: '/javascript/dtree/list.php',
			params: { key: 'root' },
			autoLoad: true
		},
		onCtxMenu: function(el){
			var d = el.prop('dtnode').data;
			ctxMenu.enableContextMenuItems();
			if(!d.level){
				ctxMenu.disableContextMenuItems('update,delete');
			}
		}
	});
	$('.demoSource').val($('#demo').html());
	App.setLanguage();
});
</script>
            <div id="tree1"><div class="ui-dynatree-container"><span id="ui-dynatree-id-root" class="ui-dynatree-folder ui-dynatree-expanded ui-dynatree-has-children ui-dynatree-lastsib ui-dynatree-exp-el ui-dynatree-ico-ef"><span class="ui-dynatree-icon"></span><a href="#" class="ui-dynatree-title">All Regions</a></span><div><span id="ui-dynatree-id-_1" class="ui-dynatree-document ui-dynatree-lastsib ui-dynatree-statusnode-wait ui-dynatree-exp-cl ui-dynatree-ico-c"><span class="ui-dynatree-empty"></span><span class="ui-dynatree-connector"></span><span class="ui-dynatree-icon"></span><a href="#" class="ui-dynatree-title">Loading…</a></span></div></div></div>
<ul id="ctxMenu1" class="ctxMenu hidden">
	<li action="insert" class="add item clear">
		<span style="display: block">
			<span class="icon icon-plus"></span>
			<span>Add Region</span>
		</span>
	</li>
	<li action="update" class="edit item clear">
		<span style="display: block">
			<span class="icon icon-pencil"></span>
			<span>Edit Region</span>
		</span>
	</li>
	<li action="delete" class="delete item clear">
		<span style="display: block">
			<span class="icon icon-minus"></span>
			<span>Delete Region</span>
		</span>
	</li>
</ul>
</body>
</html>
