/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.userservices;
/**
 *
 * @author 643507
 */
@WebServlet(name = "LogingServlet", urlPatterns = {"/LogingServlet"})
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        String userName = request.getParameter("username");
        String Password = request.getParameter("password");
        if(userName == null || userName.isEmpty()
                || Password == null || Password.isEmpty()){
             request.setAttribute("errormessage", "You must create a username and password.");
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
                forward(request, response);
             return;
        }
            userservices us = new userservices();
            boolean isValid = us.loging(userName,Password);
   
        if(!isValid){
            request.setAttribute("errormessage", "Username or password is incorrect.");
        request.setAttribute("username", userName);
             request.setAttribute("password", Password);
              getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
                forward(request, response);
              return;
        }
        request.setAttribute("username", userName);
         getServletContext().getRequestDispatcher("/WEB-INF/main.jsp").
                forward(request, response);
    }

}