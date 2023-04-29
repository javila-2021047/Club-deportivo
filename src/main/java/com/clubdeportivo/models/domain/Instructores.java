/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.clubdeportivo.models.domain;

/**
 *
 */
public class Instructores {
    private int id;
    private int tipoInstructorId;
    private int personaId;

    public Instructores() {
    }

    public Instructores(int id) {
        this.id = id;
    }

    public Instructores(int tipoInstructorId, int personaId) {
        this.tipoInstructorId = tipoInstructorId;
        this.personaId = personaId;
    }

    public Instructores(int id, int tipoInstructorId, int personaId) {
        this.id = id;
        this.tipoInstructorId = tipoInstructorId;
        this.personaId = personaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoInstructorId() {
        return tipoInstructorId;
    }

    public void setTipoInstructorId(int tipoInstructorId) {
        this.tipoInstructorId = tipoInstructorId;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    @Override
    public String toString() {
        return "Instructores{" + "id=" + id + ", tipoInstructorId=" + tipoInstructorId + ", personaId=" + personaId + '}';
    }
    
    
}
