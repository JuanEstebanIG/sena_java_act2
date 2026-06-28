package com.example;

public class ManipulacionCadenas {
    public static void demostrarConcatenacion() {
        String a = "Hola";
        String b = "Mundo";
        System.out.println(a + " " + b);
    }

    public static void demostrarMetodosUtiles() {
        String frase = "  Hola Mundo Java  ";
        System.out.println(frase.trim());
        System.out.println(frase.replace("a", "4"));
        String[] palabras = frase.trim().split(" ");
        for (String p : palabras) {
            System.out.println(p);
        }
    }

    public static void demostrarInmutabilidad() {
        String original = "hola";
        String mayusculas = original.toUpperCase();
        System.out.println(original);
        System.out.println(mayusculas);
        System.out.println(original == mayusculas);
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append("Mundo");
        sb.append(" ");
        sb.append("Java");
        System.out.println(sb.toString());
    }
}