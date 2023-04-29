/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.clubdeportivo.models.domain;

/**
 *
 */
public class Usuarios {
    
    private String user;
    private String password;
    private int instructorId;

    public Usuarios() {
    }

    public Usuarios(String user) {
        this.user = user;
    }
    
    

    public Usuarios(String password, int instructorId) {
        this.password = password;
        this.instructorId = instructorId;
    }

    public Usuarios(String user, String password, int instructorId) {
        this.user = user;
        this.password = password;
        this.instructorId = instructorId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "user=" + user + ", password=" + password + ", instructorId=" + instructorId + '}';
    }
    
    

}
