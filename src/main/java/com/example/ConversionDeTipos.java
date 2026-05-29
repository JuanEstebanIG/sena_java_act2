package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        // TODO
        int entero = 15;
        double decimal = entero;
        System.out.println(decimal);

    }

    public static void demostrarCastingExplicito() {
        // TODO
        double precioMotoDecimal = 500.984;
        int  precioMotoEntero = (int)precioMotoDecimal;

        System.out.println("El double a entero paso a:" + precioMotoEntero + " Desaparecen los decimales"); 
    }

    public static void demostrarProblemasDePrecision() {
        // TODO
        long enteroGrande = 1756981358;
        System.out.println("El entero grande es: " + enteroGrande);
        short enteroReducido = (short)enteroGrande;
        System.out.println("El entero reducido es: " + enteroReducido); 
    }
}