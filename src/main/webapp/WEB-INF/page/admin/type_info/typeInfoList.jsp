<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
</head>
<body>

	<div class="wrap">
		<!-- 头部 -->
		<div id="header">
			<c:import url="../header.jsp"></c:import>
		</div>
		<!-- 左侧菜单和主体内容 -->
		<div class="grid-1-7" style="flex: 1; margin: 0;">
			<c:import url="../menu.jsp"></c:import>
			<!-- 面包屑导航和主体内容 -->
			<div class="content">
				<div class="content-header">
					<div class="breadcrumb">
						<span>分类管理</span> <span class="divider">/</span> <span
							class="active">文章分类</span>
					</div>
				</div>
				<!--主体内容-->
				<div class="list-content">
					<!--块元素-->
					<div class="block">
						<!--页面有多个表格时，可以用于标识表格-->
						<h2>文章分类列表</h2>
						<!--正文内容-->
						<div class="main-20">
							<!--表格上方的操作元素，添加、删除、搜索等-->
							<div class="operation-wrap">
								<div class="buttons-wrap">
									<button id="add" class="button blue">
										<span class="icon-plus"></span> 添加
									</button>
									<button id="save" class="button green">
										<span class="icon-check"></span> 保存
									</button>
									<button id="delete" class="button red">
										<span class="icon-minus"></span> 删除
									</button>
								</div>
							</div>
							<table id="table" class="table">
								<thead>
									<tr>
										<th style="width: 40px;"><input type="checkbox"
											 /></th>
										<th style="width: 30%;">显示排序</th>
										<th>名称</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${typeInfoList}" var="entity" varStatus="status">
										<tr>
											<td><input type="checkbox"
												name="id" value="${entity.id}" /></td>
											<td><input type="text" class="text" name="sort"
												data-type="正整数" error-msg="必须输入正整数" value="${entity.sort}" /></td>
											<td><input type="text" class="text" name="name"
												data-type="必填" placeholder="请输入分类名称" value="${entity.name}" /></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>