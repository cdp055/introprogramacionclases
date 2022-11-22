package estructura_for;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        int factorial=1;
        for(int contador =1;contador<=numero;contador++){
            factorial=factorial*contador;
        }
        System.out.println(" El factorial es: "+factorial);

    }
}
