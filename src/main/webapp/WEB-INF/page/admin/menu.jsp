<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 左侧菜单 -->
<div id="menu" class="menu" style="width: 260px;">
	<div class="menu-title">
		<h1>
			<i>菜单</i>
		</h1>
	</div>
	<ul>
		<li class="menu-item"><a href="javascript:;"><span>分类管理</span><i
				class="my-icon menu-more"></i></a>
			<ul>
				<li><a href="${pageContext.request.contextPath}/type_info/typeList.action"><span>文章分类</span></a></li>
			</ul></li>
		<li class="menu-item"><a href="javascript:;"><span>文章管理</span><i
				class="my-icon menu-more"></i></a>
			<ul>
				<li><a href="javascript:;"><span>文章列表</span></a></li>
				<li><a href="javascript:;"><span>回收站</span></a></li>
			</ul></li>
	</ul>
</div>
<script>
	javaex.menu({
		id : "menu",
		isAutoSelected : true
	});
</script>