<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <meta charset="utf-8">
    
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


<title>Insert title here</title>

 <link href="CSS/style.css" rel="stylesheet"/>
 
 
  <%@ include file="ExternalContent.jsp" %>
  

</head>

<body>

<div class="container">

 <%@ include file="Navbar.jsp" %>
  
 

<p><h3 align="center">Here you can add your specific notes </h3></p>


<form action="SavenoteServlet">
 
  <div class="form-group">
  
    <label for="Title">Enter Your Title</label>
  
    <input required type="text" name="title" class="form-control" id="Title" aria-describedby="emailHelp" placeholder="Enter your title here">
  
  
  </div>
  
  <div class="form-group">
  
    <label for="Content">Enter Your Content</label>
  
    <textarea required type="text" name="content" class="form-control" id="Content" placeholder="Enter your content here" style="height:300px;"></textarea>
  
  </div>
  
 
  <div class="container text-center">
  
  <button type="submit" class="btn btn-primary">Submit</button>
  
  </div>
  
</form>

</div>

</body>

</html>