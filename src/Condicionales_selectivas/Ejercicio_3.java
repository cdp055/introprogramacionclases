package Condicionales_selectivas;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Primer numero");
        int num1= teclado.nextInt();
        System.out.println("Segundo numero");
        int num2= teclado.nextInt();
        if (num1 % num2 == 0){
            System.out.println("Primer termino divisible para el segundo termino");
        }else
            System.out.println("Primer termino no divisible para el segundo termino");
    }

}
