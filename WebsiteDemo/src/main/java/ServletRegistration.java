

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRegistration
 */
@WebServlet("/ServletRegistration")
public class ServletRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Connection conn=null;
		PreparedStatement statement=null;
		PrintWriter pw=null;
		 pw=response.getWriter();
		ServletContext context=getServletContext();
		String url1=context.getInitParameter("url");
		String driver1=context.getInitParameter("driver");
		String userName1=context.getInitParameter("userName");
		String password1=context.getInitParameter("password");
		String userName=request.getParameter("name");
		String userEmail=request.getParameter("email");
		String userPassword=request.getParameter("password");
		String userContact=request.getParameter("contact");
		String dobUser=request.getParameter("dob");
		String userAddress=request.getParameter("address");
		try {
		Class.forName(driver1);
		 conn = DriverManager.getConnection(url1, userName1, password1);
		 statement=conn.prepareStatement("INSERT INTO user" + " (User_name, User_email, User_pass,User_contact, User_dob, address) VALUES (?, ?, ?,?,?,?)");
		 statement.setString(1, userName);
		 statement.setString(2, userEmail);
		 statement.setString(3, userPassword);
		 statement.setString(4, userContact);
		 statement.setString(5, dobUser);
		 statement.setString(6, userAddress);
		 int num=statement.executeUpdate();
		 if(num>0) {
			 pw.print("Data inserted successfully");
		 }else {
			 pw.print("Fail to insert data");
		 }
		 
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
