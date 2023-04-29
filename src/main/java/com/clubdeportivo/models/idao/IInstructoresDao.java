/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clubdeportivo.models.idao;

/**
 *
 */

import java.util.List;
import com.clubdeportivo.models.domain.Instructores;
public interface IInstructoresDao {
    public List<Instructores> getAll();
    
    //Insertar un registro
    public boolean add(Instructores instructor);
    
    //Modificar un registro
    public boolean update(Instructores instructor);
    
    //Eliminar un registro
    public boolean delete(Instructores instructor);

}
