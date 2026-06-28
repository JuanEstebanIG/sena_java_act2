package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void ejemploDoWhile() {
        int[] numeros = {5, 3, 8, 0};
        int i = 0;
        int numero;
        do {
            numero = numeros[i];
            i++;
        } while (numero != 0);
    }

    public static void ejemploForClasico() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void ejemploEtiquetas() {
        externo:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break externo;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}