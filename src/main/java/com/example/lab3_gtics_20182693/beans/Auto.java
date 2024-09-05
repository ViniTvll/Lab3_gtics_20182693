package com.example.lab3_gtics_20182693.beans;


public class Auto {
    private String modelo;
    private String color;
    private String kilometraje;
    private String sede;
    private String costo;

    // Constructor sin argumentos
    public Auto() {
    }

    // Constructor con argumentos
    public Auto(String modelo, String color, String kilometraje, String sede, String costo) {
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.sede = sede;
        this.costo = costo;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
