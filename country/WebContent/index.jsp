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
<h1><b><center>State-Country(Foreign-Key)</center></b></h1><br>

<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Manage Country</th>
      <th scope="col">Manage State</th>
     
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
       <td><ul><li><a href="Country.jsp">Add Country</a></li></ul></td>
        <td><ul><li><a href="<%=request.getContextPath()%>/ccontroller?flag=addstate">Add state</a></li></ul></td>
       
    </tr>
    <tr>
      <th scope="row">2</th> 
      <td><ul><li><a href="<%=request.getContextPath()%>/ccontroller?flag=view">View Country</a></li></ul></td>
      <td><ul><li><a href="<%=request.getContextPath()%>/ccontroller?flag=viewstate">View state</a></li></ul></td>
    </tr>
    
  </tbody>
</table>
</div>
</body>
</html>