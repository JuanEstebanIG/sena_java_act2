package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        // TODO

        short edad = 15;
        
        if(edad >= 18){
            System.out.println("Puede votar.");
        }
    }
    
    public static void ejemploIfElse() {
        // TODO
        short edad = 21;
        
        if(edad >= 18){
            System.out.println("Puede votar.");
        }else{
            
            System.out.println("No puede votar.");
        }
    }
    
    public static void ejemploIfElseIfElse() {
        // TODO
        short edad = 21;
        boolean cedulaValida = false;
        
        if(edad >= 18){
            if(cedulaValida){
                System.out.println("Puede votar.");
            }else{
                System.out.println("Cédula no válida.");
            }
        }else{
            
            System.out.println("No puede votar.");
        }
    }

    public static void ejemploSwitch() {
        // TODO

        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El valor no es valido");
                break;
        }
    }

    public static void ejemploSwitchExpression() {
        // TODO
        int mes = 6;

        String estacion = switch(mes) {
            case 1, 2, 3 -> "Primavera";
            case 4, 5, 6 -> "Verano";
            case 7, 8, 9 -> "Otoño";
            case 10, 11, 12 -> "Invierno";
            default -> "Valor inválido";
        };
        System.out.println("La estación es: " + estacion);

    }
}