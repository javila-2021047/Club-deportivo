/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.clubdeportivo.models.domain;

/**
 *
 */
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Instalacion {
    private int id;
    private String nombreInstalacion;
    private String pais;
    private int capacidad;
    private LocalDateTime inauguracion;

    public Instalacion() {
    }

    public Instalacion(int id) {
        this.id = id;
    }

    public Instalacion(String nombreInstalacion, String pais, int capacidad, LocalDateTime inauguracion) {
        this.nombreInstalacion = nombreInstalacion;
        this.pais = pais;
        this.capacidad = capacidad;
        this.inauguracion = inauguracion;
    }

    public Instalacion(int id, String nombreInstalacion, String pais, int capacidad, LocalDateTime inauguracion) {
        this.id = id;
        this.nombreInstalacion = nombreInstalacion;
        this.pais = pais;
        this.capacidad = capacidad;
        this.inauguracion = inauguracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreInstalacion() {
        return nombreInstalacion;
    }

    public void setNombreInstalacion(String nombreInstalacion) {
        this.nombreInstalacion = nombreInstalacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDateTime getInauguracion() {
        return inauguracion;
    }

    public void setInauguracion(LocalDateTime inauguracion) {
        this.inauguracion = inauguracion;
    }

    @Override
    public String toString() {
        return "Instalacion{" + "id=" + id + ", nombreInstalacion=" + nombreInstalacion + ", pais=" + pais + ", capacidad=" + capacidad + ", inauguracion=" + inauguracion + '}';
    }
   
    
}
