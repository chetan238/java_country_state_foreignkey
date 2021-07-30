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
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1><b><center>Listed States</center></b></h1>

<table class="table"><br>
<tr>
	<th>State id</th>
	<th>State_Name</th>
	<th>State_Desc</th>
	<th>Country</th>
	<th>Action</th>
</tr>

 <c:forEach items="${ sessionScope.viewState}" var="a">
<tr>
 
  <td>${a.id }</td>
  <td>${a.sn }</td>
  <td>${a.sd }</td>
  <td>${a.c.cn }</td>
   <td><a href ="<%=request.getContextPath()%>/ccontroller?id_delete=${a.id}&flag=deleteState">delete /</a>
   <a href ="<%=request.getContextPath()%>/ccontroller?id_edit=${a.id}&flag=editState">edit..</a></td>
  </tr>
   </c:forEach>

</table>
<button ><a href ="index.jsp">BACK</a></button>
</div>

</body>
</html>