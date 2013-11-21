package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<form method=post>");
		out.println("Username: <input type=text name=user><br>" + "Password: <input type=password name=pass><br>" +
		"<input type = submit value=login>");
		String vuser = request.getParameter("user");
		String vpass = request.getParameter("pass");
		if(vuser == null || vpass == null){
			out.println("<br><br>Pls. fill-out the form...");
			return;
		}
		if(vuser.equals("Jacky") && vpass.equals("password")){
			out.println("<br>Login is corret");
			RequestDispatcher rd = request.getRequestDispatcher("/JackyChantoc");
			rd.forward(request, response);
			return;
		}else{
			out.println("<br>Login is incorrect");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
