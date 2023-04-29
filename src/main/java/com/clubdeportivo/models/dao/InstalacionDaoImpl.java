

package com.clubdeportivo.models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.clubdeportivo.models.domain.Instalacion;
import com.clubdeportivo.db.Conexion;
import com.clubdeportivo.models.idao.IInstalacionDao;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.sql.*;
/**
 *
 *
 * Codigo Tecnico: IN5m
 */
public class InstalacionDaoImpl implements IInstalacionDao{
    private static final String SQL_SELECT = "SELECT id, nombre_instalacion, pais, capacidad, inauguracion FROM instalaciones";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Instalacion instalacion = null;
    private List<Instalacion> listaInstalaciones = new ArrayList<>();

  @Override
    public List<Instalacion> getAll() {
        try{
           con = Conexion.getConnection();
           pstmt = con.prepareStatement(SQL_SELECT);
           rs = pstmt.executeQuery();
           
           while(rs.next()){
               System.out.println("Entre jejejej");
               instalacion = new Instalacion(rs.getInt("id"),rs.getString(2),rs.getString("pais"),rs.getInt("capacidad"),rs.getTimestamp("inauguracion").toLocalDateTime());
               listaInstalaciones.add(instalacion);
           }
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaInstalaciones;
        
    }

     @Override
    public boolean add(Instalacion instalacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

       @Override
    public boolean update(Instalacion estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public boolean delete(Instalacion instalacion) {
        return false;
    }
}
