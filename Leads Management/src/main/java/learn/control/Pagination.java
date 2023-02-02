//$Id$
package learn.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

import learn.model.Lead;
@WebServlet("/pagination")
public class Pagination extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int userId=(int)session.getAttribute("Id");
		int start=Integer.parseInt(request.getParameter("start"));
		int end=Integer.parseInt(request.getParameter("end"));
		LeadsControl controlObj=new LeadsControl();
		LinkedList<Lead> list=controlObj.selectLeadsById(userId, start, end);
		JSONObject obj = new JSONObject();
		obj.put("list", list);
		JSONArray jArray = obj.getJSONArray("list");
		PrintWriter out = response.getWriter();
		out.print(jArray);
		
	}
}