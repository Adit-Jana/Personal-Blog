/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.FeedbackDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Adit Jana
 */


@WebServlet("/Feedback")
public class Feedback extends HttpServlet {
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        System.out.print("Hi im in feedback");
       /*here create the LoginDao class object dao by which we can call the check method*/
        FeedbackDao dao = new FeedbackDao();
        
        /*##################Contact Form#######################*/
        /* Here we fetch the login values from the already user */
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String service = request.getParameter("service");
        String subject = request.getParameter("subject");
        
        if(dao.Insert(name,email,service,subject))
        {
            response.sendRedirect("welcome.jsp");
        }
        else
        {
           
           //response.sendRedirect("index.jsp");
        }
        /* here end of the login form */
        
        
        
        
        
        
        
        
    }
        
        
    }

    
    

