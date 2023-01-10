package Bimestre2.semana5;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        System.out.println("Programa para obtener el area de figuras geometricas");
        System.out.println("Digite 1 para obtener el area de una circunferencia");
        System.out.println("Digite 2 para obtener el area de un cuadrado");
        System.out.println("Digite 3 para obtener el area de un cilindro");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
    }
    public static void seleccionar_figura(int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor el radio: ");
                double radio = teclado.nextIn(System.in);
                double area = obtener_area_circunferencia(radio);
                System.out.println("El area es: "+area);
                break;
        }
    }

    /**
     * Metodo para obtener el area de una circunferencia
     * @param radio
     * @return
     */
    public double obtener_area_circunferencia(double radio){
        double area =  Math.PI *Math.pow(radio, 2);
        return area;

    }

    /**
     * Metodo para obtener el area de un  cuadrado
     * @param lado
     * @return
     */
    public double obtener_area_cuadrado(double lado){
        double area = lado * lado;
        return area;
    }
}
