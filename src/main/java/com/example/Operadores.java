package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        // TODO
        float nota1 = 4.5f ; 
        float nota2 = 3.7f ; 
        float nota3 = 5.0f ;
        
        double promedio =( nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de las notas es: " + promedio);
    }

    public static void demostrarIncrementoDecremento() {
        // TODO

        int var = 0;

        System.out.println("Si usamos var++ el incremento se hará despues de mostrar la variable: " + var++);
        System.out.println("Valor posterior de var: " + var);
        System.out.println("Si usamos var++ el incremento se hará antes de mostrar la variable: " + ++var);
        System.out.println("Valor posterior de var: " + var);
    }

    public static void demostrarRelacionales() {
        // TODO
        int num1 = 10;
        int num2 = 20;
        System.out.println("¿num1 es mayor que num2? " + (num1 > num2));
        System.out.println("¿num1 es menor que num2? " + (num1 < num2));
        System.out.println("¿num1 es igual a num2? " + (num1 == num2));
        System.out.println("¿num1 es diferente de num2? " + (num1 != num2));
    }
    
    public static void demostrarLogicos() {
        // TODO
        int num2 = 15;
        boolean comparacion = num2 > 10 && num2 < 50;
        
        System.out.println("El Resultado de la comparacion es: " + comparacion);
    }

    public static void demostrarAsignacionCompuesta() {
        // TODO

        int x = 10;

        x += 5;   // 15
        System.out.println("Valor de x después de x += 5: " + x);
        x -= 3;   // 12
        System.out.println("Valor de x después de x -= 3: " + x);
        x *= 2;   // 24
        System.out.println("Valor de x después de x *= 2: " + x);
        x /= 4;   // 6
        System.out.println("Valor de x después de x /= 4: " + x);
        x %= 4;   // 2
        System.out.println("Valor de x después de x %= 4: " + x);
    }

    public static void demostrarOperadorTernario() {
        // TODO

        int num = -50;
        
        System.out.println(num > 0 ? "El numero es positivo" : "El numero es negativo." );
    }
}