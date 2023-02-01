package learn.entry;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import learn.control.UserControl;
import learn.model.User;
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    UserControl controlObj=new UserControl();
	    HttpSession session=request.getSession();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		if(controlObj.isUserExist(email)) {
			int userId=controlObj.selectUserByEmail(email);
			session.setAttribute("Id",userId);
			String actualPassword=controlObj.getPassword(userId);
			if(!(actualPassword.equals(password))) {
				request.setAttribute("error","password mismatch");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else{
				response.sendRedirect("LeadsView.jsp");
			}
		}
		else {
			request.setAttribute("error","user does'nt exist");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
}

}
 