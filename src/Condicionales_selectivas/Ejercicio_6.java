package Condicionales_selectivas;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escriba el teimpo ");
        int tiempo = teclado.nextInt();
        int dias=0;
        int horas=0;
        int minutos=0;
        while (tiempo>0){
            if (tiempo>=1148){
                dias=dias+1;
                tiempo=tiempo-1148;
            }else if (tiempo>=60){
                horas=horas+1;
                tiempo=tiempo-68;
            }else {
                minutos=minutos+1;
                        tiempo=tiempo-1;
            }
        }
        System.out.println("Dias:"+dias);
        System.out.println("Horas:"+horas);
        System.out.println("Minutos:" +minutos);


    }
}
