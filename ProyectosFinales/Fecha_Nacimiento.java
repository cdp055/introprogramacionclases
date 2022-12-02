package ProyectosFinales;
/**
 * Realizar un programa que solicite una fecha de nacimiento (años,meses y dias)
 */

import java.util.Calendar;
import java.util.Scanner;

public class Fecha_Nacimiento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (en numeros)");
        System.out.println("Año");
        int ano = sc.nextInt();
        System.out.println("Mes");
        int mes = sc.nextInt();
        System.out.println("Dia");
        int dia = sc.nextInt();
        int bis = 0;
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            bis = 1;
        }
        Calendar calendario = Calendar.getInstance();
        int hora;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        if (ano >= 1900 && ano <= 2022 ) {
            if (mes >= 01 && mes <= 12) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >= 01 && dia <= 31) {
                        int dias31 = 29 - dia;
                        int meses1 = 11 - mes;
                        int anos1 = 2022 - ano;
                        System.out.println("Tienes " + anos1 + " años " + " con " + meses1 + " meses " + " y " + dias31 + " dias " + hora + "horas");
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 01 && dia <= 30) {
                        int dias30 = 30 - dia;
                        int meses1 = 11 - mes;
                        int anos1 = 2022 - ano;
                        System.out.println("Tienes " + anos1 + " años " +" con " + meses1 + " meses " + " y " + dias30 +  " dias " + hora + "horas");
                    }
                } else if (mes == 2 && bis == 0) {
                    if (dia >= 01 && dia <= 28) {
                        int dias28 = 30 - dia;
                        int meses1 = 11 - mes;
                        int anos1 = 2022 - ano;
                        System.out.println("Tienes " + anos1 + " años " + " con " + meses1 + " meses " + " y " + dias28 + " dias " + hora +"horas");
                    }
                } else if (mes == 2 && bis == 1) {
                    if (dia >= 01 && dia <= 29) {
                        int dias29 = 30 - dia;
                        int meses1 = 11 - mes;
                        int anos1 = 2022 - ano;
                        System.out.println("Tienes " + anos1 + " años " + " con " + meses1 + " meses " + " y " + dias29 + " dias " + +hora + "horas");
                    }

                } else {
                    System.out.println("Mes invalido");
                }
            } else {
                System.out.println("Año invalido");
            }
        }
    }
}
