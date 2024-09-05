package com.example.lab3_gtics_20182693.beans;

public class Sede {

    private String distrito;
    private String direccion;



    // Constructor sin argumentos
    public Sede() {
    }

    // Constructor con argumentos
    public Sede(String distrito, String direccion) {
        this.distrito = distrito;
        this.direccion = direccion;



    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
