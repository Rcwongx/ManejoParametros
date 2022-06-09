package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Obtenemos los parametros del formulario mandados por el metodo post
        String userName = req.getParameter("user");
        String userPass = req.getParameter("pass");
        
        //Esto se va a imprimir en la consola de glassfish
        System.out.println("User Name: " + userName);
        System.out.println("User Pass: " + userPass);
        
        //Nos permite escribir en el navegador 
        PrintWriter out = resp.getWriter();
        out.print("Bienvenido, " + userName);
        out.close();
    }
    
    
}
