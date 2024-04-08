package com.softtek.presentacion;

import com.softtek.modelo.Calculadora;

public class Ej8 {
    public static void main(String[] args) {

        Calculadora c1 = new Calculadora();

        System.out.println(c1.sumar(1, 1));
        System.out.println(c1.restar(1, 1));
        System.out.println(c1.multiplicar(2, 2));
        try {
            System.out.println(c1.dividir(5, 0));
        }catch (ArithmeticException error){
            System.out.println(error);
        }finally{
            System.out.println(c1.dividir(6, 2));
        }


    }





}
