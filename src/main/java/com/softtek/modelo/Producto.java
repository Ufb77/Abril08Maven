package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor


public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;



    public String comprobar() throws ProductoException {
        String respuesta = "";
        if(id == null || id.equals("")){
            throw new ProductoException("ERROR: Id no asignado");
        }else{
            respuesta = "Id asignado correctamente";
        }

        return respuesta;
    }


}
