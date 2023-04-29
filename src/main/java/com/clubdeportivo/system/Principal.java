
package com.clubdeportivo.system;

/**
 *
 * @author juana
 */
import com.clubdeportivo.models.dao.InstalacionDaoImpl;
public class Principal {
     public static void main(String[] args) {
        InstalacionDaoImpl instalaciones = new InstalacionDaoImpl();
        
        System.out.println(instalaciones.getAll());
    }
}
