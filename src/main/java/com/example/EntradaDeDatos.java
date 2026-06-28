package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void leerVariosTipos() {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        double decimal = scanner.nextDouble();
        System.out.println(texto);
        System.out.println(decimal);
        scanner.close();
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.nextLine();
        String texto = scanner.nextLine();
        System.out.println(numero);
        System.out.println(texto);
        scanner.close();
    }
}