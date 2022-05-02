package com.company;

import com.company.Clases.SmartPhone;
import com.company.Clases.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Apple","iphone13",999.9,"azul",128,"bionic","5G");
        SmartWatch huawei = new SmartWatch("Huawei","fit",100.2,"rojo","deportivo",true);

        System.out.println("Smartphone iphone = " + "Marca:"+ iphone.marca +", Modelo:" + iphone.modelo +", Precio:" + iphone.precio + ", Color:" + iphone.color + ", RAM:" + iphone.ram + ", Procesador:" + iphone.procesador + ", Tecnologia:" + iphone.banda);
        System.out.println("SmartWatch Huawei = " + "Marca:"+ huawei.marca +", Modelo:" + huawei.modelo +", Precio:" + huawei.precio + ", Color:" + huawei.color + ", Tipo:" + huawei.funciones + ", Resistencia al agua:" + huawei.sumergible);
    }
}
