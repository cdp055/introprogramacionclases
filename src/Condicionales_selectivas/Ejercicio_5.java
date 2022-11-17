package Condicionales_selectivas;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introdusca tres numeros");
        int num_1 = teclado.nextInt();
        int num_2 = teclado.nextInt();
        int num_3 = teclado.nextInt();
        if (num_1*num_1 + (num_2*num_2) == num_3*num_3){
            System.out.println("Las medidas puede que sean los lados del triangulo rectangulo");
        }else
            System.out.println("Las medidas puede que no sean los lados de un triangulo rectangulo");
    }

    }

