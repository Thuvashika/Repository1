package learn.entry;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import learn.control.UserControl;
import learn.model.User;
import java.io.IOException;
import java.util.Scanner;
@WebServlet("/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    UserControl controlObj=new UserControl();
		    HttpSession session=request.getSession();
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			User obj=new User(name,email, password);
			if(controlObj.isUserExist(email)) {
				request.setAttribute("error","user already exist");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else {
				controlObj.insertUser(obj);
				int userId=controlObj.selectUserByEmail(email);
				session.setAttribute("Id",userId);
				response.sendRedirect("LeadsView.jsp");
			}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Name 1:");
		String name1=scanner.nextLine();
		System.out.print("Email 1");
		String email1=scanner.nextLine();
		System.out.print("Password 1");
		String password1=scanner.nextLine();
		System.out.print("Name 2:");
		String name2=scanner.nextLine();
		System.out.print("Email 2");
		String email2=scanner.nextLine();
		System.out.print("Password 2");
		String password2=scanner.nextLine();
		MultipleUser newObj1=new MultipleUser(name1,email1,password1);
		MultipleUser newObj2=new MultipleUser(name2,email2, password2);
		Thread t1=new Thread(newObj1);
		Thread t2=new Thread(newObj2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		
		
		
		
		
		
//		UserControl controlObj=new UserControl();
//		for (int i = 0; i < 1000; i++) {
//			String username = "name-"+i;
//			String email = "email-"+i;
//			User obj=new User(username,email, "pass");
//			
//			/** First Attempt **/
//			if(controlObj.isUserExist(email)) {
////				System.out.println("User Exists");
//			}
//			else {
//				controlObj.insertUser(obj);
//				controlObj.setId(obj);
//			}
//			
//			if(controlObj.isUserExist(email)) {
////				System.out.println("User Exists");
//			}
//			else {
//				controlObj.insertUser(obj);
//				controlObj.setId(obj);
//			}
//			
//			if(controlObj.isUserExist(email)) {
////				System.out.println("User Exists");
//			}
//			else {
//				controlObj.insertUser(obj);
//				controlObj.setId(obj);
//			}
//		}
		
	}
}
