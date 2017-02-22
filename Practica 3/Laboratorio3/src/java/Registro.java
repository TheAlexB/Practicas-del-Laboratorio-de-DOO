/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LSTI-19
 */
public class Registro extends HttpServlet {

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
            String usuario = request.getParameter("usuario");
            String email = request.getParameter("email");
            String mes = request.getParameter("mes");
            String genero = request.getParameter("genero");
            String check = request.getParameter("check");
            String descripcion = request.getParameter("descripcion");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lista</h1>");
            out.println("<label>" + usuario + "</label><br><br>");
            out.println("<label>" + email + "</label><br><br>");
            out.println("<label>" + mes + "</label><br><br>");
            out.println("<label>" + genero + "</label><br><br>");
            out.println("<label>" + check + "</label><br><br>");
            out.println("<label>" + descripcion + "<label><br><br>");
            out.println("<a href =\"registro.html\">" + "Regresar" + "</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public void limpiar(HttpServletRequest request, HttpServletResponse response)
    {
        String usuario = request.getParameter("usuario");
        String contraseña = request.getParameter("contraseña");
        String email = request.getParameter("email");
        String descripcion = request.getParameter("descripcion");
        String nuevou= limpiar(usuario);
        String nuevoc= limpiar(contraseña);
        String nuevoe= limpiar(email);
        String nuevod= limpiar(descripcion);

    }
    private String limpiar(String viejo)
    {
        try
        {
            String nuevo = URLEncoder.encode(viejo, "UTF-8");
            return nuevo;
        }
        catch(Exception e)
        {
            return "";
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