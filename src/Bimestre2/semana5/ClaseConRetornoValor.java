package Bimestre2.semana5;

import java.util.Scanner;

public class ClaseConRetornoValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA PARA SUMAR DOS NUMEROS");
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        int resultado= sumar(num1,num2,3); //llamamos al metodo y recibimos el valor
        System.out.println("La suma es igual: "+ resultado);
        //sumar_dos_numeros(num1,num2);
        //obtener el promedio de los numeros ingresados
        double promedio = obtener_promedio(resultado,2);
        System.out.println("El promedio de los numeros es: "+promedio);
    }

    /**
     * Este metod realiza la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return resultado
     */
    public static int sumar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }
    public static int sumar(int n1, int n2, int n3){
        int resultado= n1+n2+n3;
        System.out.println("La suma de los numeros es: "+ resultado);
        return resultado;
    }

    /**
     * Metodo para obtener el promedio de una suma de valores
     * @param suma_total
     * @param cantidad_numeros
     * @return promedio
     */
    public static double obtener_promedio(int suma_total, int cantidad_numeros){
        double promedio= (double) suma_total/ (double) cantidad_numeros;
        return promedio;
    }
}
