package mypack.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import mypack.entity.NoteEntity;
import mypack.helper.ConnectionProvider;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		
		try {
			
			int noteid=Integer.parseInt(request.getParameter("note_id").trim());
			
		
			
			Session s=ConnectionProvider.getFactory().openSession();
			
			Transaction t=s.beginTransaction();
			
			NoteEntity note=(NoteEntity)s.get(NoteEntity.class,noteid);
			
		s.delete(note);
			
			
			t.commit();
			
			response.sendRedirect("all_notes.jsp");
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		out.println("<h1 align='center'>Welcome to the delete page</h1>");
		
		
		
		
		
		
	}

}
