import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/Register")
public class Register extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String query = new String("INSERT INTO info VALUES(?,?,?,?,?)");

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String phonenumber = request.getParameter("phonenumber");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = null;
        try {
            assert con != null;
            ps = con.prepareStatement(query);
            ps.setString(1,firstname);
            ps.setString(2, lastname);
            ps.setString(3, phonenumber);
            ps.setString(4, email);
            ps.setString(5, password);
            int i = ps.executeUpdate();

            if(i > 0) {
                out.println("You are successfully registered");
                out.println("Login");
                response.sendRedirect("RegistrationLogin-JspServlet/web/login.jsp");
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
