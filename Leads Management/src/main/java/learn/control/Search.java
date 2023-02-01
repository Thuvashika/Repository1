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
@WebServlet("/search")
public class Search extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int userId=(int)session.getAttribute("Id");
		 String column=request.getParameter("column");
		 String word=request.getParameter("word");
		 LeadsControl controlObj=new LeadsControl();
		 LinkedList<Lead> list=new LinkedList<Lead>();
		 switch(column) {
		 case "name":
			 list=controlObj.selectLeadsByName(userId,word);
			 break;
		 case "id":
			 int newWord=Integer.parseInt(word);
			 list=controlObj.selectLeadsById(userId,newWord);
			 break;
		 case "email":
			 list=controlObj.selectLeadsByEmail(userId,word);
			 break;
		 case "region":
			 list=controlObj.selectLeadsByRegion(userId,word);
			 break;
		 case "contact":
			 list=controlObj.selectLeadsByContact(userId,word);
		 }
		 JSONObject obj = new JSONObject();
			obj.put("list", list);
			JSONArray jArray = obj.getJSONArray("list");
			PrintWriter out = response.getWriter();
			out.print(jArray);
	}

}
