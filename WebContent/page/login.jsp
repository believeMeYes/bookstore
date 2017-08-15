<%@page import="javax.imageio.spi.RegisterableService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css" type="text/css"> --%>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/register.css" type="text/css"> 
</head>
<body>
<div id="title">登陆</div>
<form method="post" action="../login">
<label class="account">账号 :<input name="username"></label><br/><br/>
<label class="password">密码 :<input type="password" name="password"><br/></label>
<div class="button">
<label class="submit"><input type="submit" id="submit" value="登陆" /></label>
<label class="reset"><input type="reset" id="reset" vaule="取消" /></label>
</div>
</form>
</body>
</html>