package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {        
        // TODO
        int edad = 30;
        System.out.println("La edad Es: " + edad);
        double estatura = 1.7;
        System.out.println("La estatura Es:" + estatura);
    }
    
    public static void demostrarConvencionesNombres() {
        // TODO
        int puntuacionMaximaJuegos = 1000;
        double presionPsi = 30.8;
        String nombreCompleto = "Juan Esteban";

        System.out.println("Puntuación máxima en juegos: " + puntuacionMaximaJuegos);
        System.out.println("Presión en psi: " + presionPsi);
        System.out.println("Nombre completo: " + nombreCompleto);
    }
    
    public static void demostrarConstantes() {
        // TODO
        final double PI = 3.1416;
        System.out.println("El Valor de pi es:" + PI);

        // PI = 4; Marca error.
    }
}