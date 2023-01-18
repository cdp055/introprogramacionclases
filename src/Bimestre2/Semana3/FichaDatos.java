package Bimestre2.Semana3;
/**
 * Almacenar ficha de datos Generales de personas.
 */

import java.util.Scanner;

public class FichaDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[] = new String[100];
        int edad[] = new int[100];
        String univ[] = new String[100];
        Boolean interruptor = true;
        int indice = 0;
        while (interruptor) {
            System.out.println("Ingrese datos del estudiante");
            System.out.println("Ingrese nombre");
            nombre[indice] = teclado.nextLine();
            System.out.println("Ingrese edad");
            edad[indice] = teclado.nextInt();
            teclado.nextLine();//Para leer el neter despues de ingresar edad
            System.out.println("Ingrese univercidad");
            univ[indice] = teclado.nextLine();
            indice++;
            System.out.println("Desae ingresar un nuevo integrante si/no?");
            String resp = teclado.nextLine().toLowerCase(); // sirve solo para mayusculas
            if (resp.equals("no"))
                interruptor = false; // Filalizamos ciclo while
        }
        //Proceso para ordenar por edad
        for (int indice2 = 1 ; indice2 < edad.length; indice2++) {
            for (int elemento = 0 ; elemento <= edad.length - 2; elemento ++) {
                //Verificar si realizamos un intercambio
                if (edad[elemento] > edad[elemento + 1]) {
                    int aux = edad[elemento];
                    edad[elemento] = edad[elemento + 1];
                    edad[elemento + 1] = aux;
                    //Proceso de intercambio en arreglo nombre.
                    String aux_n = nombre[elemento];
                    nombre[elemento] = nombre[elemento + 1];
                    nombre[elemento + 1] = aux_n;
                    //Proceso de intercambio en arreglo univ.
                    String aux_u = univ[elemento];
                    univ[elemento] = univ[elemento + 1];
                    univ[elemento + 1] = aux_u;

                }

            }
        }
        // Presentar datos de los estudiantes
        for (int pos = 0; pos <= nombre.length; pos++) {
            if(nombre[pos]!= null){
                System.out.println("Nombre: " + nombre[pos]);
                System.out.println("Edad: " + edad[pos]);
                System.out.println("Univercidad: " + univ[pos]);
            }

        }
    }
}
