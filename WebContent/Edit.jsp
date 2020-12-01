<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="org.hibernate.Session" %>
    
     <%@page import="mypack.helper.ConnectionProvider" %>
     
      <%@page import="mypack.entity.NoteEntity" %>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  
    <link href="CSS/style.css" rel="stylesheet"/>
    
    <%@ include file="ExternalContent.jsp" %>


<title>Insert title here</title>

</head>

<body>

 <div class="container">
  
  <%@ include file="Navbar.jsp" %>
  
  
  <br><br>
  
  <p><h3 align="center">Welcome to the Edit page</h3></p><br><br>
  
  <% int noteid=Integer.parseInt(request.getParameter("note_id").trim());
	
	
	
	Session s=ConnectionProvider.getFactory().openSession();
	
	
	
	NoteEntity note=(NoteEntity)s.get(NoteEntity.class,noteid);
	
  
  %>
  
  <form action="doc_UpdateServlet" method="post">
  
   <input value="<%=note.getUser_id() %>" name="user_id" type="hidden"/><br><br>
  
 
  <div class="form-group">
  
  
  
   
  
    <label for="Title">Enter Your Title</label>
  
    <input required type="text" name="title" class="form-control" id="Title" aria-describedby="emailHelp" placeholder="Enter your title here" value="<%=note.getTitle() %>">
  
  
  </div>
  
  <div class="form-group">
  
    <label for="Content">Enter Your Content</label>
  
    <textarea required type="text" name="content" class="form-control" id="Content" placeholder="Enter your content here"style="height:300px;"><%=note.getContent() %> </textarea>
  
  
  </div>
  
 
  <div class="container text-center">
  
  <button type="submit" class="btn btn-success">Save your notes</button>
  
  </div>
  
</form>

</div>

</body>

</html>