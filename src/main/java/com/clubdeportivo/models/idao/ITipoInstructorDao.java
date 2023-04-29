/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clubdeportivo.models.idao;

/**
 *
 */
import java.util.List;
import com.clubdeportivo.models.domain.TipoInstructor;

public interface ITipoInstructorDao {
    public List<TipoInstructor> getAll();
    
    //Insertar un registro
    public boolean add(TipoInstructor tipoInstructor);
    
    //Modificar un registro
    public boolean update(TipoInstructor tipoInstructor);
    
    //Eliminar un registro
    public boolean delete(TipoInstructor tipoInstructor);
}
