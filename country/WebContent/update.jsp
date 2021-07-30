<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container ml-5">
<h1><b><center>Update country</center></b></h1>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<c:forEach items="${ sessionScope.update }" var="a">
<c:set value="${ a.id }" var="x"></c:set>
<c:set value="${ a.cn }" var="y"></c:set>
<c:set value="${ a.cd }" var="z"></c:set>
</c:forEach>
<form action="<%=request.getContextPath() %>/ccontroller" method="post">
Country name :<input type="text" name="cname" class="form-control" value="${ y }"><br><br>
Country disc : :<input type="text" name="cdes" class="form-control" value="${ z }"><br><br>
<input type="hidden" value="${ x }" name="x">
<input type="hidden" value="update" name="flag">
<input type="submit" class="btn btn-success">
</body>
</html>