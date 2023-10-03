package Web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String User_name=request.getParameter("USERNAME");  
    out.print("Welcome "+User_name);  
    request.getRequestDispatcher("welcome.html").forward(request, response);
          
    out.close();  
    }  
  
}  