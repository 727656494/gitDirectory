package TestAjax;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2015/1/17.
 */
public class TestAjax extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        //PrintWriter
        PrintWriter out=response.getWriter();
        System.out.print("vvvvv");
        out.write("00000");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        //PrintWriter
        PrintWriter out=response.getWriter();
        System.out.print("vvvvv");
        out.write("00000");
        System.out.print("vvvvv");
        out.write("00000");
        System.out.print("vvvvv");
        out.write("00000");
        System.out.print("vvvvv");
        out.write("00000");
        System.out.print("vvvvv");
        out.write("00000");

    }
}
