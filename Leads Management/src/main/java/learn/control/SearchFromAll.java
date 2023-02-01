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
import org.json.JSONArray;
import org.json.JSONObject;
import learn.model.Lead;
@WebServlet("/searchFromAll")
public class SearchFromAll extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String column=request.getParameter("column");
		 String word=request.getParameter("word");
		 LeadsControl controlObj=new LeadsControl();
		 LinkedList<Lead> list=new LinkedList<Lead>();
		 switch(column) {
		 case "name":
			 list=controlObj.selectLeadsByName(word);
			 break;
		 case "id":
			 int newWord=Integer.parseInt(word);
			 list=controlObj.selectLeadsById(newWord);
			 break;
		 case "email":
			 list=controlObj.selectLeadsByEmail(word);
			 break;
		 case "region":
			 list=controlObj.selectLeadsByRegion(word);
			 break;
		 case "contact":
			 list=controlObj.selectLeadsByContact(word);
			 break;
		 case "userid":
			 int intWord=Integer.parseInt(word);
			list=controlObj.selectLeadsByUserId(intWord);
	 	}
		 JSONObject obj = new JSONObject();
			obj.put("list", list);
			JSONArray jArray = obj.getJSONArray("list");
			PrintWriter out = response.getWriter();
			out.print(jArray);
	}

}