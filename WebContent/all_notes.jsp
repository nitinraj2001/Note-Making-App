<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="mypack.helper.ConnectionProvider" %>
    
     <%@ page import="java.util.List" %>
     
     <%@ page import="org.hibernate.Session" %>
     
     <%@ page import="org.hibernate.Query" %>
     
      <%@ page import="mypack.entity.*" %>
    
    
    
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
  
  <p><h3 align="center">Welcome to the ViewNotes Page</h3></p>
  
  <br><br>
  
   <div class="row">
   
       <div class="col-12">
  
  <% 
  
 
  
  Session s=ConnectionProvider.getFactory().openSession();
  
  Query q=s.createQuery("From NoteEntity");
  
  List<NoteEntity> list=q.list();
  
  for(NoteEntity note:list){
	  
	  %>
	 
	  
	  <div class="card mt-3" >
	  
       <img class="card-img-top m-4 mx-auto" style="max-width:100px;" src="image/verify.png" alt="Card image cap">
 
          <div class="card-body mx-5">
          
             <h5 class="card-title"><%=note.getTitle() %></h5>
                 
                  <p class="card-text"><%=note.getContent() %></p>
                  
                  <p><b class="text-primary"><%=note.getAddedDate() %></b></p>
                  
                  <div class="container text-center m-2">
                       
                          <a href="DeleteServlet?note_id=<%=note.getUser_id() %>" class="btn btn-danger">Delete</a>
                          
                           <a href="Edit.jsp?note_id=<%=note.getUser_id() %>" class="btn btn-primary">Update</a>
                           
                   </div>        
           
            </div>
        
        </div>
        
        
	  
	  <%
	  
	  
	  s.close();
	  
	
	  
	  
  }
  
  
  %>


</div>
</div></div>

</body>

</html>