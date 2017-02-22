<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<%--登录页面/登录失败的响应页面 --%>
<title>宝宝淘论坛登录</title>
</head>

<body>
	${user.userName}，欢迎您进入宝宝淘论坛，您当前积分为${user.credits}；<br/>
</body>
</html>
