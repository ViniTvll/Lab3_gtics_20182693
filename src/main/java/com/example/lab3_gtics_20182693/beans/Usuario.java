package com.example.lab3_gtics_20182693.beans;

public class Usuario {

    private String nombres;
    private String apellidos;
    private String contraseña;


    // Constructor sin argumentos
    public Usuario() {
    }

    // Constructor con argumentos
    public Usuario(String nombres, String apellidos, String contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;


    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
