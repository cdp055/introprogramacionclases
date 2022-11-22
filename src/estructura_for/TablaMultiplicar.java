package estructura_for;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        boolean interructor = true;
        for (int contador = 10; contador >= 0 && interructor==true; contador--) {
            int mult = numero * contador;
            System.out.println(numero + "*"+ contador +"="+ mult);
            if(contador == 5)
                interructor = false;
        }
    }
}