package systemDemo.testDb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = "myDatabase";
		String password = "myDatabase";

		String jdbcUrl = "jdbc:mysql://localhost:3306/bazaosiedla?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";

		try {
			PrintWriter out = response.getWriter();
			out.println("Connectiong to database: " + jdbcUrl);
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
			out.println("Success");
			myConn.close();
		} catch (Exception exp) {
			exp.printStackTrace();
			throw new ServletException(exp);
		}
	}

}
