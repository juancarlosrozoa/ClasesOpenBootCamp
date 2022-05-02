package com.company.Clases;

public class SmartPhone extends SmartDevice {
    //Atributos
    public int ram;
    public String procesador;
    public String banda;


    //Constructores

    public SmartPhone() {
    }

    public SmartPhone(int ram, String procesador, String banda) {
        this.ram = ram;
        this.procesador = procesador;
        this.banda = banda;
    }

    public SmartPhone(String marca, String modelo, Double precio, String color, int ram, String procesador, String banda) {
        super(marca, modelo, precio, color);
        this.ram = ram;
        this.procesador = procesador;
        this.banda = banda;
    }
    //Metodos
}
