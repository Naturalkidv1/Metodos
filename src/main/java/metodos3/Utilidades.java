package metodos3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ajbazan01
 */
public class Utilidades {

    public int generarAleatorio(int numMax, int numMin) {

        Random numeroAleatorio = new Random();

        int numeroAleatorio1;

        numeroAleatorio1 = numeroAleatorio.nextInt(numMax - numMin + 1) + numMin;
        return numeroAleatorio1;
    }

    
    public int leerEntero() {

        boolean continuar = true;
        int numero = 0;
        Scanner entradaTeclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce un número entero");
                numero = entradaTeclado.nextInt();
                continuar = false;
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un número entero.");
                entradaTeclado.nextLine();
            }
        } while (continuar);
        return numero;
    }

}
