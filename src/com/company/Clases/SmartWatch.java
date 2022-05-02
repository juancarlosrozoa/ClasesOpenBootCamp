package com.company.Clases;

public class SmartWatch extends SmartDevice{
    //Atributos
    public String funciones;
    public boolean sumergible;


    //Constructor

    public SmartWatch() {
    }

    public SmartWatch(String funciones, boolean sumergible) {
        this.funciones = funciones;
        this.sumergible = sumergible;
    }

    public SmartWatch(String marca, String modelo, Double precio, String color, String funciones, boolean sumergible) {
        super(marca, modelo, precio, color);
        this.funciones = funciones;
        this.sumergible = sumergible;
    }
    //Metodos

}
