/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.AccidenteDAO;
import ModeloVO.AccidenteVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "AccidenteControlador", urlPatterns = {"/Accidente"})
public class AccidenteControlador extends HttpServlet {

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
        //1. recogger los datos
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String idAccidente=request.getParameter("textId");
        String tipoAccidente=request.getParameter("textTipAccdiente");
        String fechaHora=request.getParameter("dateFechaHora");
        String dia=request.getParameter("dateDia");
        String jornada=request.getParameter("textJornada");
        String laborHabitual=request.getParameter("textLaborHabitual");
        String tiempoPA=request.getParameter("textTiempoPA");
        String cantHoras=request.getParameter("textHoras");
        String cantMinutos=request.getParameter("textMinutos");
        String empresa=request.getParameter("textEmpresa");
        String causaMuerte=request.getParameter("textCausaMuerte");
        
        String descripcion=request.getParameter("textDescripcion");
   AccidenteVO AciVO = new AccidenteVO(idAccidente, tipoAccidente, fechaHora, 
           dia, jornada, laborHabitual, tiempoPA, cantHoras, cantMinutos, empresa, causaMuerte, descripcion);
  AccidenteDAO AciDAO = new AccidenteDAO(AciVO);  
  
   switch(opcion){
            case 1://agregar regstro
            if(AciDAO.agregarRegistro()){
            request.setAttribute("mensajEXito", "El usuario del vehiculo se registro correctamente ");
            }else{
            request.setAttribute("mensajeError", "El usuario del vehiculo NO se registro correctamente ");
            }
            request.getRequestDispatcher("registrarVehiculo.jsp").forward(request, response);
        break;
            case 2:// actualizar registros
       if(AciDAO.actualizarRegistro()){
            request.setAttribute("mensajEXito", "El vehiculo se registro correctamente ");
            }else{
            request.setAttribute("mensajeError", "El vehiculo NO se actualizo correctamente ");
            }
            request.getRequestDispatcher("actualizarVehiculo.jsp").forward(request, response);
  
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
