
package com.clubdeportivo.controllers;

/**
 *
 * @author juana
 */
import com.clubdeportivo.models.domain.Instalacion;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.List;
import com.clubdeportivo.models.dao.InstalacionDaoImpl;
@WebServlet("/ServletInstalacion")
public class ServletInstalacion extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
     
        String accion = request.getParameter("accion");
        
        if (accion != null){
            switch (accion){
                case "listar":
                    listarInstalaciones(request, response);
                    break;
                case "editar":
                    break;
                case "eliminar":
                    break;
                      
            }   
            }
        }
    private void listarInstalaciones(HttpServletRequest request, HttpServletResponse response) throws IOException{
        List<Instalacion> listaInstalaciones = new InstalacionDaoImpl().getAll();
        HttpSession sesion= request.getSession();
        sesion.setAttribute("data", listaInstalaciones);
        response.sendRedirect("instalaciones/instalacion.jsp");
    }
    }