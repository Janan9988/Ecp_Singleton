package Web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet {  
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String user = req.getParameter("USERNAME");
        String pas = req.getParameter("PASSWORD");
        
        if (LoginDao.validate(user, pas)) {
            RequestDispatcher rd = req.getRequestDispatcher("WelcomeServlet");
            rd.forward(req, res);
        } else {
            out.print("Sorry username or password error");
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            rd.include(req, res);
        }
        
        out.close();
    }
}
