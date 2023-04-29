/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.clubdeportivo.models.domain;

/**
 *
 */
public class TipoInstructor {
    private int id;
    private String descripcionTipoInstructor;

    public TipoInstructor() {
    }

    public TipoInstructor(int id) {
        this.id = id;
    }

    public TipoInstructor(String descripcionTipoInstructor) {
        this.descripcionTipoInstructor = descripcionTipoInstructor;
    }

    public TipoInstructor(int id, String descripcionTipoInstructor) {
        this.id = id;
        this.descripcionTipoInstructor = descripcionTipoInstructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionTipoInstructor() {
        return descripcionTipoInstructor;
    }

    public void setDescripcionTipoInstructor(String descripcionTipoInstructor) {
        this.descripcionTipoInstructor = descripcionTipoInstructor;
    }

    @Override
    public String toString() {
        return "TipoInstructor{" + "id=" + id + ", descripcionTipoInstructor=" + descripcionTipoInstructor + '}';
    }
    
    
}
