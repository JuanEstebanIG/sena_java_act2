package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("========== ENCABEZADO ==========");
    }

    public static void ejemploPasoParametros(String nombre) {
        System.out.println("Buenos dias, " + nombre + ".");
    }

    public static int ejemploRetornoValores() {
        return 42;
    }

    public static void ejemploSobrecarga() {
        System.out.println(5 * 3);
    }

    public static void ejemploSobrecarga(int n) {
        System.out.println(n * n);
    }
}