//$Id$
package learn.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learn.model.Lead;
@WebServlet("/EditControl")
public class EditControl extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt((request.getParameter("id")));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String region=request.getParameter("region");
		String contact=request.getParameter("contact");
		Lead leadObj=new Lead(name,email,region,contact);
		LeadsControl controlObj=new LeadsControl();
		controlObj.updateLead(leadObj,id);
		response.sendRedirect("LeadsView.jsp");
	}


}
