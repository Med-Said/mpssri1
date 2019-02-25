/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Med Said M'bareck
 */
public class Action extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            
            String q1 = request.getParameter("q1");
            String q2 = request.getParameter("q2");
            String q3 = request.getParameter("q3");
            String q4 = request.getParameter("q4");
            
            String rep1,rep2,rep3,rep4;
            
            
            if(q1.equals("client lourd")){
                rep1="vrai";
            }else{
                rep1="faux";
            }
            
            if(q2.equals("un descripteur de deploiement")){
                rep2="vrai";
            }else{
                rep2="faux";
            }
            if(q3.equals("les requetes http")){
                rep3="vrai";
            }else{
                rep3="faux";
            }
            
            if(q4.equals("des services de communication et d'insfrastructure")){
                rep4="vrai";
            }else{
                rep4="faux";
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(
                    	"<style type='text/css'>.vrai{ color : #00f;} .faux{ color : #f00;} </style>");
            out.println("<title>Servlet Action</title>");            
            out.println("</head>");
            out.println("<body>");            
            out.println("Resultats: </br>") ;
            out.print(""
                    + "Q1 : Que represente une applet ? --> client lourd </br>" + 
                    "<p class="+rep1+">votre reponse : " + q1 + "</p></br></br>"

                    + "Q2 : De quoi est compose un conteneur web ? --> un descripteur de deploiement</br></br></br>"+
                            "<p class="+rep2+">votre reponse : " + q2 + "</p></br></br>"
                                    
                                    
                    + "Q3 : Un serveur web gere ? --> les requetes http</br></br></br>"+
                                    "<p class="+rep3+">votre reponse : " + q3 + "</p></br></br>"
                                            
                                            
                    + "Q4 : un serveur d'aplication JEE est compose de  ? --> des services de communication et d'insfrastructure</br></br></br>"+
                                            "<p class="+rep4+">votre reponse : " + q4 + "</p></br></br>"
                    + ""
                    + "");
                
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
