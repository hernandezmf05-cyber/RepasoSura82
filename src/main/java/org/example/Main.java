package org.example;

import com.google.protobuf.LazyStringArrayList;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Manzana
        String nombre="Manzana";
        Integer precio=5000;
        String descripcion= "Deliciosa manzana importada";
        Integer codigo= 4587986;

        //Arreglo primitivo
        String[] frutas= new String[5]; // el numero es la cantidad de posiciones

       //Arreglo evolucionado
        ArrayList<String> frutasDos= new ArrayList<>();
        frutasDos.add("Manzana");
        frutasDos.add("Pera");
        frutasDos.add("Sandia");
        System.out.println(frutasDos);

        //REALIZAR LO SIGUIENTE
        //ARREGLO DE NOMBRES DE CLIENTES (5)
        ArrayList<String> clientes= new ArrayList<>();// se crea el arreglo o lista
        clientes.add("Miguel");
        clientes.add("Andres");
        clientes.add("Jordan");
        clientes.add("Daniela");
        clientes.add("Oriana");
        System.out.println(clientes);//mostrar lista

        //ARREGLO DE NOMBRE DE PROVEEDORES (10)
        ArrayList<String> proveedores= new ArrayList<>();// se crea el arreglo o lista
        proveedores.add("Bimbo");
        proveedores.add("Coca-Cola");
        proveedores.add("Suministro Estrella");
        proveedores.add("Bavaria");
        proveedores.add("DistriDirecta");
        proveedores.add("Abastecimiento Elite");
        proveedores.add("Alpina");
        proveedores.add("AliExpress");
        proveedores.add("Colanta");
        proveedores.add("Comercializadora");
        System.out.println(proveedores);// mostrar lista

        //ARREGLO O LISTA DE VALORES DE SERVICIOS PUBLICOS (5 MESES)
        ArrayList<Double> valoresServiciosPublicos= new ArrayList<>(); // se crea el arreglo o lista
        valoresServiciosPublicos.add(120.456); //1 mes
        valoresServiciosPublicos.add(345.678); //2 mes
        valoresServiciosPublicos.add(234.789); //3 mes
        valoresServiciosPublicos.add(124.567); //4 mes
        valoresServiciosPublicos.add(432.678); //5 mes
        System.out.println("Valores de servicios públicos (5 meses):");
        System.out.println(valoresServiciosPublicos);



    }
}