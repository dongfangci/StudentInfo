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
 * Servlet implementation class Showreport
 */
@WebServlet("/Showreport")
public class Showreport extends HttpServlet {
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init...");
	}

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Showreport() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		queryAll(request,response);
//		System.out.println("post");
//		try {
//			queryByName(request,response);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	}
	private void queryByName(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String name = request.getParameter("name");
		List<Student> list = new ArrayList<Student>();
		System.out.println(name);
		StudentAction stua = new StudentAction();
		try {
			list = stua.queryByName(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("StudentName", list);
		response.sendRedirect("QueryAll.jsp");
				
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
		response.sendRedirect("index.jsp");
	}

}
