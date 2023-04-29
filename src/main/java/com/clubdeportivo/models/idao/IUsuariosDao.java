/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clubdeportivo.models.idao;

/**
 *
 */

import java.util.List;
import com.clubdeportivo.models.domain.Usuarios;
public interface IUsuariosDao {
    public List<Usuarios> getAll();
    
    //Insertar un registro
    public boolean add(Usuarios usuario);
    
    //Modificar un registro
    public boolean update(Usuarios usuario);
    
    //Eliminar un registro
    public boolean delete(Usuarios usuario);
}
