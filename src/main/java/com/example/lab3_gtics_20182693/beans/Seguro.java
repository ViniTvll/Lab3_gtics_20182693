package com.example.lab3_gtics_20182693.beans;

public class Seguro {

    private String empresa;
    private String cobertura;
    private String tarifa;


    // Constructor sin argumentos
    public Seguro() {
    }

    // Constructor con argumentos
    public Seguro(String empresa, String cobertura, String tarifa) {
        this.empresa = empresa;
        this.cobertura = cobertura;
        this.tarifa = tarifa;


    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
}
