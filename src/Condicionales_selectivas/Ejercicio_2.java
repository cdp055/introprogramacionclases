package Condicionales_selectivas;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("Programa Para Determinar Si Una Fecha Es Correcta o Incorrecta");

        System.out.println("Ingrese el día");
        Scanner teclado = new Scanner (System.in);
        int dia = teclado.nextInt();

        System.out.println("Ingrese el mes");
        int mes = teclado.nextInt();

        System.out.println("Ingrese el año");
        int año = teclado.nextInt();


        if ( (mes >= 1 && mes <= 12) && (año>=1990 && año<=2010));

        switch ( mes ) {
            case  1 :
                if ( dia >= 1 && dia <= 31 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;
            case  3 :
                if ( dia >= 1 && dia <= 31 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;
            case  5 :
                if ( dia >= 1 && dia <= 31 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;
            case  7 :
                if ( dia >= 1 && dia <= 31 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;
            case  8 :
                if ( dia >= 1 && dia <= 31 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;
            case 10 :
                if ( dia >= 1 && dia <= 31 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;
            case 12 :
                if ( dia >= 1 && dia <= 31 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;

            case 4 :
                if ( dia >= 1 && dia <= 30 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;

            case 6 :
                if ( dia >= 1 && dia <= 30 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;

            case 9 :
                if ( dia >= 1 && dia <= 30 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;

            case 11 :
                if ( dia >= 1 && dia <= 30 )
                    System.out.println("Fecha Correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;

            case 2 :
                if ( dia >= 1 && dia <= 28 )
                    System.out.println("Fecha Correcta");
                else if ((dia >= 1 && dia <= 29) && (año%4==0))
                    System.out.println("Fecha correcta");
                else
                    System.out.println("Fecha incorrecta");
                break;
        }
    }
}