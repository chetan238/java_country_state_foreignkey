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
<h1><b><center>Listed Countries</center></b></h1>
<table class="table">
<br>
 <tr>
 <th>ID</th>
 <th>Country Name</th>
 <th>Country Desc</th>
 <th>Action</th>
 </tr>
<c:forEach items="${sessionScope.view }" var="a">
	 <tr>
 <td>${a.id}</td>
 <td>${a.cn}</td>
 <td>${a.cd}</td>
  <td><a href ="<%=request.getContextPath()%>/ccontroller?id_delete=${a.id}&flag=delete">delete /</a>
 <a href ="<%=request.getContextPath()%>/ccontroller?id_edit=${a.id}&flag=edit">edit</a>
 </tr> 
</c:forEach>

</table>
<button ><a href ="index.jsp">BACK</a></button>
</div>
</body>
</body>
</html>