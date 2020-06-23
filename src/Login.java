import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/Login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement
                    ("select * from info where email='" +email+ "' and password='"+password+"'");
            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                out.println("Invalid credentials...");
                out.println("Enter valid details.");
                response.sendRedirect("RegistrationLogin-JspServlet/web/login.jsp");
            }
            out.println("You successfully logged in...");
            out.println("You Name:"+rs.getString(1)+" your email: "+rs.getString(2));
            connection.close();
        }
        catch(Exception se) {
            se.printStackTrace();
        }
    }
}
