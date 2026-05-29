package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {
        // TODO
        Byte mesesDelAño = 12;
        Short díasDeLaSemana = 7;
        int horasDelDía = 24;
        long segundosEnUnAño = 31536000L;

        System.out.println("Meses del año: " + mesesDelAño);
        System.out.println("Días de la semana: " + díasDeLaSemana);
        System.out.println("Horas del día: " + horasDelDía);
        System.out.println("Segundos en un año: " + segundosEnUnAño);
    }

    public static void demostrarFlotantes() {
        // TODO
        float precioCafeNegro = 10.800f;
        double precioCafeConLeche = 20.800;
        System.out.println("Precio del café negro: " + precioCafeNegro);
        System.out.println("Precio del café con leche: " + precioCafeConLeche);
    }

    public static void demostrarCaracteres() {
        // TODO
        char inicial = 'J';
        System.out.println("Inicial: " + inicial);
    }

    public static void demostrarBooleanos() {
        // TODO
        boolean estadoLuz = false;
        System.out.println("Estado de la luz: " + estadoLuz);
        estadoLuz = true;
        System.out.println("Estado de la luz: " + estadoLuz);
    }

    public static void demostrarValoresPorDefecto() {
        // TODO
        int numero;
        float decimal;
        char caracter;
        boolean logico;

        // System.out.println("Número: " + numero);
        // System.out.println("Decimal: " + decimal);
        // System.out.println("Carácter: " + caracter);
        // System.out.println("Lógico: " + logico);
    }
}