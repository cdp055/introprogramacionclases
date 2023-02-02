package Bimestre2.Semana2;
/**
 * Programa que solicite el nombre de n marcas de vehiculos y las
 * almacenamos en un arreglo. Finalmente el programa debe mostrar el
 * nombre de las marcas almacenadas en el arreglo.
 */

import java.util.Scanner;

public class ArregloMarca {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("Cuantas marcas de vehiculo va a ingresar?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();// para esperar un enter
        marcas = new String[n];//Creamos el arreglo con n elementos
        //operacion escritura del arreglo
        for (int indice = 0; indice < n; indice++) {
            System.out.println("infrese el nombre de la marca" + (indice+1));
            String marca = teclado.nextLine();
            marcas[indice] = marca.toLowerCase();
        }
        System.out.println("lista de marcas ingresadas: ");
        //operacion lectura de un arraglo
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice]+ "\t1");
        }
        // operscion de busquedad
        System.out.println("que nombre de marca desea buscar: ");
        // toUpperCase() es una funcion que convierte un texto en mayusculas
        String marca_busqueda = teclado.nextLine().toUpperCase();
        System.out.println("marca_busqueda: "+ marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if(marca_busqueda.equals (marcas[indice].toUpperCase() )){ // equals para cunado es texto
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra en el indice: "+ indice);
                break;
            }

        }
    }
}
