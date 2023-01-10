package Bimestre2.semana5;

import java.util.Scanner;

public class ClaseConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para sumar dos numeros");
        System.out.println("Ingrese el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        int resultado = sumar(num1,num2); // Lamamos al metodo y recivumos el valor
        System.out.println("La suma es :c"+resultado);
       // suma_dos_numeros(num1, num2);
        // obtener el promedio de los numeros ingresados
        double promedio = obtener_promedio(resultado,2);
        System.out.println("El promedio de los numeros es: "+promedio);
    }

    /**
     * Este metodi realiza la suma de sos numeros enteros
     * @param n1
     * @param n2
     * @return resultado
     */
    public static int sumar(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;

    }
    public static void suma_dos_numeros(int n1, int n2){
        int resultado = n1 + n2;
        System.out.println("La suma de los numerso es: "+resultado);
    }

    /**l
     * Metodo para obtener el promedio de una suma de valores
     * @param suma_total
     * @param cantidad_num
     * @return promedio
     */
    public static double obtener_promedio(int suma_total, int cantidad_num){
        double promedio = (double) suma_total/(double) cantidad_num;
        return promedio;
    }
}
