package Condicionales_selectivas;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Primer numero");
        int num1= teclado.nextInt();
        System.out.println("segundo numero");
        int num2= teclado.nextInt();
        if (num1>num2) {
            System.out.println("Primer numero es el mayor");
        }else{
            System.out.println("Primer numero es menor");
        }

    }
}
