/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clubdeportivo.models.idao;

import java.util.List;
import com.clubdeportivo.models.domain.Instalacion;
/**
 *
 */
public interface IInstalacionDao {
   
    //listar todos los registros
    public List<Instalacion> getAll();
    
    //Insertar un registro
    public boolean add(Instalacion instalacion);
    
    //Modificar un registro
    public boolean update(Instalacion instalacion);
    
    //Eliminar un registro
    public boolean delete(Instalacion instalacion);

}
