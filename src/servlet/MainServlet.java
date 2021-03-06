package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Student;
import service.StudentAction;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		System.out.println(request.getServerName());
		String select = request.getParameter("select");
		System.out.println("Main" + select);
		
		if(select.equals("QueryAll")){
			//response.sendRedirect("Showreport");
			queryAll(request,response);
		}
		else if(select.equals("QueryByName")){
			response.sendRedirect("QueryByName.jsp");
		}
		else if(select.equals("Add")){
			response.sendRedirect("Add.jsp");
		}
		else if(select.equals("Delete")){
			response.sendRedirect("Delete.jsp");
		}
		else{
			response.sendRedirect("Update.jsp");
		}
	}
	private void queryAll(HttpServletRequest request, HttpServletResponse response) throws IOException{
		List<Student> list = new ArrayList<Student>();
		StudentAction stua = new StudentAction();
		try {
			list = stua.queryAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("StudentName", list);
		response.sendRedirect("QueryAll.jsp");
	}
	
	

}
