package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero");
        }
    }

    public static void ejemploTryCatchInput() {
        try {
            int num = Integer.parseInt("abc");
            int res = 10 / num;
        } catch (NumberFormatException e) {
            System.out.println("Error de tipo de dato");
        } catch (ArithmeticException e) {
            System.out.println("Error aritmetico");
        }
    }

    public static void ejemploBloqueFinally() {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Cierre ejecutado");
        }
    }

    public static void evitarCierrePrograma() {
        try {
            int resultado = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error controlado");
        }
    }
}