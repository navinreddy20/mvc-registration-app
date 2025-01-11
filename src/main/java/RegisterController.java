

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

 
@WebServlet("/regst")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int rst=0;
		String name=request.getParameter("uname");
		String email=request.getParameter("uemail");
		String password=request.getParameter("upassword");
		String city=request.getParameter("ucity");
		RegisterDao dao=new RegisterDao();
		
		try {
		  rst=dao.registerInfo(name, email, password, city);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(rst!=0) {
			response.sendRedirect("success.jsp");
		}
		else {
			response.sendRedirect("failure.jsp");
		}
	}

}
