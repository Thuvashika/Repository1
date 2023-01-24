//$Id$
package learn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import learn.model.Lead;
import learn.model.User;
@WebServlet("/ViewControl")
public class ViewControl extends HttpServlet{
	private static final long serialVersionUID = 2202158416956274475L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String region=request.getParameter("region");
		String contact=request.getParameter("contact");
		Lead leadObj=new Lead(name,email,region,contact);
		LeadsControl controlObj=new LeadsControl();
		HttpSession session=request.getSession();
		 User UserObj=(User)session.getAttribute("obj");
		 int id=UserObj.getId();
		controlObj.insertLead(leadObj,id);
		response.sendRedirect("LeadsView.jsp");
	}

}
