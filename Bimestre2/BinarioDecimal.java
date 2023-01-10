package Bimestre2;
/**
 * Algoritmo convertidor de sistema binario a sistema decimal
 * Existen varios sistemas de numeración, entre ellos podemos mencionar al sistema binario que
 * trabaja únicamente con los dígitos (0 y 1), y al sistema decimal, que trabaja con los dígitos (0 al
 * 10).
 */

import java.util.Scanner;

public class BinarioDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin[] = new int[6];
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        System.out.println("Ingrese el numero binario");
        for (int indice = 0; indice < bin.length; indice++) {
            System.out.println(" ");
            int n = sc.nextInt();
            if (n == 1 || n == 0) {
                bin[indice] = n;
            } else {
                System.out.println("Numero binario equivocado");
            }
        }
        for (int indice = 0; indice < bin.length; indice++) {

            if (bin[0] == 1 || bin[0]==0) {
                a= bin[0]*32;
            }
            if (bin[1] == 1 || bin[1]==0) {
                b= bin[1]*16;
            }
            if (bin[2] == 1 || bin[2]==0) {
                c= bin[2]*8;
            }if (bin[3] == 1 || bin[3]==0){
                d= bin[3]*4;
            }if (bin[4] == 1 || bin[4]==0){
                e= bin[4]*2;
            }if (bin[5] == 1 || bin[5]==0){
                f= bin[5]*1;
            }
        }
        int sumatotal= a+b+c+d+e+f;
        System.out.println(sumatotal);
    }
}
