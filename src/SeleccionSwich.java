import java.util.Scanner;

/**
 * Programa para devolver el dia de la semana en palabras dado un numero del 1 al 7
 * programa creado por Carlos David Pedra Guachizaca
 */
public class SeleccionSwich {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Lunes");
                break;// dalta al fin de la  estructura siwch
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println(" Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opcion incorrecta");

        }
        System.out.println("Fin del swich");

    }
}
