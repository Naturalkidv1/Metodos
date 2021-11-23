/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class CalculadoraAvanzada {

    // Método monstrarMenu. Sólo se utiliza en la clase Calculadora
    // método privado. No recibe parámetros y no devuelve valor (void)
    // 
    private static void mostrarMenu() {
        System.out.println("Opciones del programa");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        
        
    }

    private static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    // Método resta. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la resta de los parámetros
    private static int restar(int n1, int n2) {
        int suma = n1 - n2;
        return suma;
    }
    // Método suma. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la suma de los parámetros
    
    private static int multiplicar(int n1, int n2) {
        int cocienteMult = n1 * n2;
        return cocienteMult;
    }
    // Método multiplicacion. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el cociente de la multiplicacion de ambos
    
    private static int dividir(int n1, int n2) {
        int cocienteDiv = n1 / n2;
        return cocienteDiv;
    }
    // Método dividir. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la división de ambos
    
    private static int comprobarInt(int n1) {
        boolean continuar = true;
        int numero = 0;
        Scanner entradaTeclado = new Scanner(System.in);
        
        do{
            try {
            System.out.println("Introduce un número entero");
            numero = entradaTeclado.nextInt();
            continuar = false;
            } catch (InputMismatchException ime){
                System.out.println("Introduce un número entero.");
                entradaTeclado.nextLine();
            }
            } while ( continuar);
        return numero;
    }
    // Método dividir. Sólo se utiliza en la clase Calculadora
    // método privado. Recibe dos parámetros y devuelve un valor entero
    // con el resultado de la división de ambos

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operando1 = 1, operando2 = 1;
        boolean solicitarDatos = true;

        System.out.println("Bienvenido al calculator");

//        do {
//            System.out.println("Introduce dos operandos (entre -100 y 100)");
//
//            do {
//                solicitarDatos = true;
//                try {
//
//                    // Bloque de código candidato a lanzar la excepción
//                    System.out.println("Introduce operando 1: ");
//                    operando1 = sc.nextInt();
//                    System.out.println("Introduce operando 2: ");
//                    operando2 = sc.nextInt();
//                    solicitarDatos = false;
//                } catch (InputMismatchException ime) {
//                    // Código para tratar el error
//                    System.out.println("Se ha introducido texto en lugar de números. "
//                            + "Vuelva a introducir los datos");
//                    sc.nextLine();
//                }
//            } while (solicitarDatos); // Bucle que controla la excepción
//        } while (!((operando1 > -100 && operando1 < 100)
//                && (operando2 > -100 && operando2 < 100)));
        do {

            try {

                // Bloque de código candidato a lanzar la excepción
                System.out.println("Introduce operando 1: ");
                operando1 = sc.nextInt();
                System.out.println("Introduce operando 2: ");
                operando2 = sc.nextInt();
                if ((operando1 > -100 && operando1 < 100) && (operando2 > -100 && operando2 < 100)) {
                    solicitarDatos = false;
                } else {
                    System.out.println("Los datos están fuera de rango");
                }

            } catch (InputMismatchException ime) {
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }
        } while (solicitarDatos);

        sc.nextLine();
        String opcion = "";
        int resultado = 0;
        do {
            mostrarMenu();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    resultado = sumar(operando1, operando2);

                    break;
                case "2":
                    resultado = restar(operando1, operando2);

                    break;
                case "5":
                    break;
                case "3":
                    resultado = multiplicar(operando1, operando2);
                    break; 
                case "4":
                    resultado = dividir(operando1, operando2);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println("El resultado es " + resultado);
        } while (!opcion.equals("3"));

    }

}
