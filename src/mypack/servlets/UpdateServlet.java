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

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		
		int user_id=Integer.parseInt(request.getParameter("user_id"));
		
		String title=request.getParameter("title");
		
		String content= request.getParameter("content");
		
Session session=ConnectionProvider.getFactory().openSession();
		
		Transaction t=session.beginTransaction();
		
		NoteEntity note=session.get(NoteEntity.class, user_id);
		
		note.setTitle(title);
		
		note.setContent(content);
		
		note.setAddedDate(new Date());
		
		t.commit();
		
		session.close();
		
		
		response.sendRedirect("all_notes.jsp");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
