/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clubdeportivo.models.idao;

/**
 *
 */

import java.util.List;
import com.clubdeportivo.models.domain.Persona;
public interface IPersonaDao {
    public List<Persona> getAll();
    
    //Insertar un registro
    public boolean add(Persona persona);
    
    //Modificar un registro
    public boolean update(Persona persona);
    
    //Eliminar un registro
    public boolean delete(Persona persona);

}
