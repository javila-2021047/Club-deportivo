/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.clubdeportivo.models.domain;

/**
 *
 */

import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre1;
    private String nombre2;
    private String nombre3;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String telefono;
    private String email;

    public Persona() {
    }

    public Persona(int id) {
        this.id = id;
    }

    public Persona(String nombre1, String nombre2, String nombre3, String apellido1, String apellido2, LocalDate fechaNacimiento, String nacionalidad, String telefono, String email) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona(int id, String nombre1, String nombre2, String nombre3, String apellido1, String apellido2, LocalDate fechaNacimiento, String nacionalidad, String telefono, String email) {
        this.id = id;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", nombre3=" + nombre3 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
}
