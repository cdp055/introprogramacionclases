package estructura_for;

import java.util.Scanner;

public class DivicionNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = teclado.nextInt();
        int divisores  = 0;
        for(int contador =1; contador <= numero; contador++){
            if (numero % contador==0)
                System.out.println("Los divisores son: "+ contador);
        }


    }
}
