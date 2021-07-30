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
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
	<form action="<%=request.getContextPath()%>/ccontroller" method="get">
		<c:forEach items="${ sessionScope.editState}" var="a">
		<h1><b><center>Edit State</center></b></h1>
		Select Country : <select name="cid" id="c" class="form-control">
				<c:forEach var="b" items="${sessionScope.country}">

					<c:if test="${b.id eq a.c.id}">
						<option value="${a.c.id}" selected="selected">${a.c.cn}</option>
					</c:if>
					<c:if test="${b.id ne a.c.id}">
						<option value="${b.id}">${b.cn}</option>
					</c:if>
				</c:forEach>
			</select>
			<br>
			<br> State Name : :<input type="text" value="${a.sn }"  class="form-control" name="sn">
			<br>
			<br> 
			State disc : :<input type="text" value="${a.sd }" class="form-control" name="sd">
			<br>
			<br>
			<input type="hidden" value="${a.id }" name="x">
		</c:forEach>
		<input type="hidden" value="updateState" name="flag"> 
		<input type="submit" class="btn btn-success">
	</form>
</div>
</body>
</html>