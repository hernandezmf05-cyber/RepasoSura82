package org.example;

import com.google.protobuf.LazyStringArrayList;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*//1.variables primitivas
        int precio=5000;
        double peso=2.5;
        boolean estaPodrida= false;

        //2.variables tipo envoltura
        String nombre="Juan";*/

        //Manzana
        String nombre="Manzana";
        Integer precio=5000;
        String descripcion= "Deliciosa manzana importada";
        Integer codigo= 4587986;

        //Arreglo primitivo
        String[] frutas= new String[5]; // el numero es la cantidad de posiciones

       //
        ArrayList<String> frutasDos= new ArrayList<>();
        frutasDos.add("Manzana");
        frutasDos.add("Pera");
        frutasDos.add("Sandia");
        System.out.println(frutasDos);

    }
}