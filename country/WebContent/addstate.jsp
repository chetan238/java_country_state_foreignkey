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
<%@taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt"%>
<h1><b><center>Add State</center></b></h1>

<form action="<%=request.getContextPath()%>/ccontroller" method="get">

Select State :
<select name="cid" id="c">
<c:forEach items="${ sessionScope.country}" var="a">
<c:set value="${a.id}" var="x" ></c:set>
<c:set value="${a.cn}" var="y"></c:set>
<c:set value="${a.cd}" var="z"></c:set>

<option value="${x}">${y}</option>

</c:forEach> 
   
</select><br><br>
State Name : :<input type="text" name="sn" class="form-control"><br><br>
State disc : :<input type="text" name="sd"class="form-control"><br><br>
<input type="hidden" value="insertState" name="flag">
<input type="submit" class="btn btn-success">
</form><br>
<button ><a href ="index.jsp">BACK</a></button>
</div>
</body>
</html>