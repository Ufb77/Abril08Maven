package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class Calculadora {


    public double sumar(double op1, double op2){
        return op1 + op2;
    }

    public double restar(double op1, double op2){
        return op1 - op2;
    }

    public double multiplicar(double op1, double op2){
        return op1 * op2;
    }

    public double dividir(double op1, double op2) throws ArithmeticException{
        double resultado = 0;

        if(op2 == 0){
            throw new ArithmeticException("No dividas por 0");
        }else{
            resultado = op1/op2;
        }
        return resultado;
    }

}
