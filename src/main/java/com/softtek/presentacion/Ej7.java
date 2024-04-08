package com.softtek.presentacion;

import com.softtek.modelo.Producto;
import com.softtek.modelo.ProductoException;

public class Ej7 {
    public static void main(String[] args) {
        Producto p1 = new Producto("1", "Aceite", 500.0, "AAA", "Muy caro");


        try {
            System.out.println(p1.comprobar());
        } catch (ProductoException e) {
            System.out.println(e.getMessage());
        }
    }
}
