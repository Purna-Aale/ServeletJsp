package Simple;
//import java.io.IOException;
import java.io.*;
//import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
/*import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/
public class SevletTest  extends   HttpServlet{
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        //get the parameters for the two number to be added
        int num1=   Integer.parseInt(request.getParameter("num1"));
        int num2=   Integer.parseInt(request.getParameter("num2"));
        //add the number together
        int sum = num1 + num2;
        //set the response content type
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();

        out.println("<h2>"+num1+"+"+num2+"="+sum+"</h2>");
    }


}
