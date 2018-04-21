<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--字体图标样式-->
<link
	href="${pageContext.request.contextPath}/static/javaex/pc/css/icomoon.css"
	rel="stylesheet" />
<!--动画样式-->
<link
	href="${pageContext.request.contextPath}/static/javaex/pc/css/animate.css"
	rel="stylesheet" />
<!--核心样式-->
<link
	href="${pageContext.request.contextPath}/static/javaex/pc/css/style.css"
	rel="stylesheet" />
<!--jquery，当前版本不可更改jquery版本-->
<script
	src="${pageContext.request.contextPath}/static/javaex/pc/lib/jquery-1.7.2.min.js"></script>
<!--全局动态修改-->
<script
	src="${pageContext.request.contextPath}/static/javaex/pc/js/common.js"></script>
<!--核心组件-->
<script
	src="${pageContext.request.contextPath}/static/javaex/pc/js/javaex.min.js"></script>
<!--表单验证-->
<script
	src="${pageContext.request.contextPath}/static/javaex/pc/js/javaex-formVerify.js"></script>
	<!--左侧logo-->
			<div>
				<a href="#"> <img class="logo-img"
					src="${pageContext.request.contextPath}/static/javaex/pc/images/logo.png">
				</a>
			</div>
			<!--右侧功能-->
			<ul class="pull-right header-right">
				<li><a class="pull-left user-photo" href="#"><img
						src="${pageContext.request.contextPath}/static/javaex/pc/images/user.jpg"
						alt=""></a>
					<p class="pull-left margin-left-10">
						欢迎您，<span>管理员</span>
					</p> <label class="margin-left-10 margin-right-10">|</label> <a
					href="${pageContext.request.contextPath}/admin/login_out.action">退出</a></li>
				<li><a href="#"> <span class="icon-commenting-o"
						style="font-size: 20px; position: relative; top: 2px;"> <i
							style=""><span>31</span></i>
					</span>
				</a></li>
				<li><a href="#">用户中心</a></li>
			</ul>