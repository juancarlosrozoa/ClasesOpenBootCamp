package com.company.Clases;

abstract class SmartDevice {
    //atributos
    public String marca;
    public String modelo;
    public Double precio;
    public String color;


    //Constructores

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, Double precio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
    }
//Metodos

}
