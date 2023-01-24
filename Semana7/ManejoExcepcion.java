package Bimestre2.Semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa [ara  ealixar la divicion entre dos numeros
 */
public class ManejoExcepcion {
    // creacion de valores globales
    double n1;
    double n2;
    public static void main(String[] args) {
        ManejoExcepcion mivar = new ManejoExcepcion();
        mivar.ejecutar();
    }
    public void ejecutar(){
        ingresar_datos();
        System.out.println("Resultado = " + dividir() );
    }
    public void ingresar_datos(){
        /// el bloque try nos ayuda a captar o detectar si ocurre la excepcion
        try {// este codigo tiene la posivilidad de presentar una excepcion
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese primer numerador : ");
            n1 = teclado.nextDouble();
            System.out.println("Ingrese denominador: ");
            n2 = teclado.nextDouble();
        }catch (Exception error_de_teclado) {
            System.out.println("Manejo de la excepcion de tipo aritmetico");
            System.out.println(error_de_teclado.getMessage());
        }
    }
    public double dividir(){
        double resultado = 0;
        try { // codigo en elmque  posiblemente puede ocurrir una excepcion
             resultado = n1 / n2;
            return resultado;
        }catch (Exception error){
            // este codigo se ejecuta solo si ocurre una excepcion
            System.out.println("Error de tipo aritmetico");
            System.out.println(error.getMessage());
        }finally {
            // este codigo se ejecuta soslo si ocurre una excepcion
            System.out.println("ingreso a finally");
        }
        System.out.println("resultado = " + resultado);
            return resultado;
    }
}

