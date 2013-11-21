package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JackyChantoc")
public class JackyChantoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public JackyChantoc() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1 align = center>Split-Soul</h1><br><h3 align = center>Table of Contents</h3>");
		out.println("<form action = JackyChantoc method = post>");
		out.println("<table border = 1 align = center width = 1000><tr><td>Name</td><td align = center>Page</td></tr>");
		out.println("<td>Chapter 1</td><td align = center><input type = submit name = s1 value= 1></input></td>");
		out.println("<tr><td>...Scene 1<br>...Scene 2<br>...Scene 3<br>...Scene 4</td><td align = center>" +
				    "<br align = center><input type = submit name = s2 value= 2>" +
				    "<br align = center><input type = submit name = s3 value= 3>" +
				    "<br align = center><input type = submit name = s4 value= 4>" +
				    "<br align = center><input type = submit name = s5 value= 5></td></tr>");
		out.println("<td>Chapter 2</td><td align = center><input type = submit name = s6 value= 6></input></td>");
		out.println("<tr><td>...Scene 1<br>...Scene 2<br>...Scene 3<br>...Scene 4<br>...Scene 5<br>...Scene 6<br>...Scene 7<br>...Scene 8<br>...Scene 9</td><td align = center>" +
				"<br align = center><input type = submit name = s7 value= 7>" +
			    "<br align = center><input type = submit name = s8 value= 8>" +
			    "<br align = center><input type = submit name = s9 value= 9>" +
			    "<br align = center><input type = submit name = s10 value= 10>" +
			    "<br align = center><input type = submit name = s11 value= 11>" +
			    "<br align = center><input type = submit name = s12 value= 12>" +
			    "<br align = center><input type = submit name = s13 value= 13>" +
			    "<br align = center><input type = submit name = s14 value= 14>" +
			    "<br align = center><input type = submit name = s15 value= 15>" +
				"</td></tr>");
		out.println("<td>Chapter 3</td><td align = center><input type = submit name = s16 value= 16></input></td>");
		out.println("<tr><td>...Scene 1<br>...Scene 2<br>...Scene 3<br>...Scene 4</td><td align = center>" +
				"<br align = center><input type = submit name = s17 value= 17>" +
			    "<br align = center><input type = submit name = s18 value= 18>" +
			    "<br align = center><input type = submit name = s19 value= 19>" +
			    "<br align = center><input type = submit name = s20 value= 20></td></tr>");
		out.println("<td>Chapter 4</td><td align = center><input type = submit name = s21 value= 21></input></td>");
		out.println("<tr><td>...Scene 1<br>...Scene 2<br>...Scene 3<br>...Scene 4</td><td align = center>" +
				"<br align = center><input type = submit name = s22 value= 22>" +
			    "<br align = center><input type = submit name = s23 value= 23>" +
			    "<br align = center><input type = submit name = s24 value= 24>" +
			    "<br align = center><input type = submit name = s25 value= 25></td></tr>");
		out.println("<td>Chapter 5</td><td align = center><input type = submit name = s26 value= 26></input></td>");
		out.println("<tr><td>...Scene 1<br>...Scene 2<br>...Scene 3<br>...Scene 4</td><td align = center>" +
				"<br align = center><input type = submit name = s27 value= 27>" +
			    "<br align = center><input type = submit name = s28 value= 28>" +
			    "<br align = center><input type = submit name = s29 value= 29>" +
			    "<br align = center><input type = submit name = s30 value= 30></td></tr>");
		
		out.println("</form>");
		if (request.getParameter("s1") != null) {
			RequestDispatcher rd = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Title.htvml");
			rd.forward(request, response); 
		}
		if (request.getParameter("s2") != null) {
			RequestDispatcher rd1 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt1_scene1.html");
			rd1.forward(request, response); 
		}
		if (request.getParameter("s3") != null) {
			RequestDispatcher rd2 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt1_scene2.html");
			rd2.forward(request, response); 
		}
		if (request.getParameter("s4") != null) {
			RequestDispatcher rd3 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt1_scene3.html");
			rd3.forward(request, response); 
		}
		if (request.getParameter("s5") != null) {
			RequestDispatcher rd4 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt1_scene4.html");
			rd4.forward(request, response); 
		}
		if (request.getParameter("s6") != null) {
			RequestDispatcher rd5 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene1.html");
			rd5.forward(request, response); 
    }
		if (request.getParameter("s7") != null) {
			RequestDispatcher rd6 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene1.html");
			rd6.forward(request, response); 
		}
		if (request.getParameter("s8") != null) {
			RequestDispatcher rd7 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene2.html");
			rd7.forward(request, response); 
		}
		if (request.getParameter("s9") != null) {
			RequestDispatcher rd8 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene3.html");
			rd8.forward(request, response); 
		}
		if (request.getParameter("s10") != null) {
			RequestDispatcher rd9 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene4.html");
			rd9.forward(request, response); 
		}
		if (request.getParameter("s11") != null) {
			RequestDispatcher rd10 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene5.html");
			rd10.forward(request, response); 
		}
		if (request.getParameter("s12") != null) {
			RequestDispatcher rd11 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene6.html");
			rd11.forward(request, response); 
    }
		if (request.getParameter("s13") != null) {
			RequestDispatcher rd12 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene7.html");
			rd12.forward(request, response); 
		}
		if (request.getParameter("s14") != null) {
			RequestDispatcher rd13 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene8.html");
			rd13.forward(request, response); 
		}
		if (request.getParameter("s15") != null) {
			RequestDispatcher rd14 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt2_scene9.html");
			rd14.forward(request, response); 
		}
		if (request.getParameter("s16") != null) {
			RequestDispatcher rd15 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt3_scene1.html");
			rd15.forward(request, response); 
		}
		if (request.getParameter("s17") != null) {
			RequestDispatcher rd16 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt3_scene1.html");
			rd16.forward(request, response); 
		}
		if (request.getParameter("s18") != null) {
			RequestDispatcher rd17 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt3_scene2.html");
			rd17.forward(request, response); 
    }
		if (request.getParameter("s19") != null) {
			RequestDispatcher rd18 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt3_scene3.html");
			rd18.forward(request, response); 
		}
		if (request.getParameter("s20") != null) {
			RequestDispatcher rd19 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt3_scene4.html");
			rd19.forward(request, response); 
		}
		if (request.getParameter("s21") != null) {
			RequestDispatcher rd20 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt4_scene1.html");
			rd20.forward(request, response); 
		}
		if (request.getParameter("s22") != null) {
			RequestDispatcher rd21 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt4_scene1.html");
			rd21.forward(request, response); 
		}
		if (request.getParameter("s23") != null) {
			RequestDispatcher rd22 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt4_scene2.html");
			rd22.forward(request, response); 
		}
		if (request.getParameter("s24") != null) {
			RequestDispatcher rd23 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt4_scene3.html");
			rd23.forward(request, response); 
    }
		if (request.getParameter("s25") != null) {
			RequestDispatcher rd24 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt4_scene4.html");
			rd24.forward(request, response); 
		}
		if (request.getParameter("s26") != null) {
			RequestDispatcher rd25 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt5_scene1.html");
			rd25.forward(request, response); 
		}
		if (request.getParameter("s27") != null) {
			RequestDispatcher rd26 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt5_scene1.html");
			rd26.forward(request, response); 
		}
		if (request.getParameter("s28") != null) {
			RequestDispatcher rd27 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt5_scene2.html");
			rd27.forward(request, response); 
		}
		if (request.getParameter("s29") != null) {
			RequestDispatcher rd28 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt5_scene3.html");
			rd28.forward(request, response); 
		}
		if (request.getParameter("s30") != null) {
			RequestDispatcher rd29 = request.getRequestDispatcher("SplitSoul_MarcAlexanderAlo_Chpt5_scene4.html");
			rd29.forward(request, response); 
    }
		out.println("</body></html>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
