package mypack.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.entity.NoteEntity;
import mypack.helper.ConnectionProvider;


@WebServlet("/SavenoteServlet")
public class SavenoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SavenoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String title=request.getParameter("Name");
		
		String content=request.getParameter("report");
		
		
		NoteEntity note=new NoteEntity(title,content,new Date());
		
		
		Session session=ConnectionProvider.getFactory().openSession();
		
		Transaction t=session.beginTransaction();
		
		session.save(note);
		
		t.commit();
		
		session.close();
		
		
		
		out.println("<h1 style='text-align:center'>Successfully completed the update work</h1>");
		
		out.println("<h3 style='text-align:center'><a href='all_notes.jsp'>View All Notes Here</a></h3>");
		
		out.close();
		
		
		
		
	}

}
