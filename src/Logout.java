import java.io.*;
import javax.servlet.http.*;

public class Logout extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie[] cookie =request.getCookies();
            out.print("Hello "+cookie[0].getValue());

            out.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }


}
