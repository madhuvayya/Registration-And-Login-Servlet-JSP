import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

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
            int i =0;
            try {
                i = ps.executeUpdate();
            } catch (MySQLIntegrityConstraintViolationException e) {
                request.setAttribute("message","Already registered just login");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }

            if(i > 0) {
                request.setAttribute("message","You are successfully registered login");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
