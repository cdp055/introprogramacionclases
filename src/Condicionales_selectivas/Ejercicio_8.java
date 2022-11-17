package Condicionales_selectivas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introdusca tolerancia");
        double tol= teclado.nextDouble();
        if (tol < 0.1){
            System.out.println("EXPLORACION ESPACIAL");
        } else if ((tol >= 0.1) && (tol < 1)) {
            System.out.println("GRADO MILITAR");
        } else if ((tol >= 1) && (tol < 10)) {
            System.out.println("GRADO COMERCIAL");
        } else if (tol >= 10) {
            System.out.println("GRADO JUEGETE");
        }
    }
}







