package Bimestre2_Semana4;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/**
 * programa para crear una matriz con valores recibidos desde el teclado, y
 * luego poder realizar operaciones de >
 * 1. Busqueda
 * 2. Modificacion
 * 3. Eliminacion
 * 4. Visualizacion
 * 5. Salida
 */
public class MatrizMarcaVehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int cols = teclado.nextInt();
        teclado.nextLine();
        String marcas[][] = new String[filas][cols];// establecemos dimension de la matriz
        // llenado de la matriz: operacion escritura
        for (int fila = 0; fila < filas; fila++) {// filas o marca.length
            for (int col = 0; col < cols; col++) {
                System.out.println("Ingrese valor para posicon ["+fila+"]["+col+"]");
                marcas[fila][col] = teclado.nextLine().toLowerCase();// lee todo lo que vamos a escribir antes de colocar un enter
            }
        }
        boolean salir = false;
        while (!salir){// salir == false
            System.out.println("Digite 1 para realizar una busquedad: ");
            System.out.println("Digite 2 para modifiar un valor: ");
            System.out.println("Digite 3 para eliminar un vslor: ");
            System.out.println("Digite 4 para visualizar la matriz: ");
            System.out.println("Digite 5 para aslir: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                System.out.println("Has ingresado la operacion busquedad");
                    System.out.println("Que marca busca: ?");
                    String marca_buscada = teclado.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if( marcas[fila][col].equals(marca_buscada)); {
                                System.out.println("Si se encontro la marca: "+ marca_buscada);
                                System.out.println("en la posicion:["+fila+"]["+col+"]");
                                encontrado = true;
                                break;
                            }

                        }

                    }
                    if(encontrado == false)
                        System.out.println("Marca no encontada");
                break;
                case 2:
                    System.out.println("has seleccionado la operacion de modificacion");
                    System.out.println("Ingrese que fila desea modificar: ");
                    int fila1 = teclado.nextInt();
                    System.out.println("Ingrear en columna desea modificar: ");
                    int col1 = teclado.nextInt();
                    System.out.println("cual es la nueva marca a ingresar");
                    String nueva_marca = teclado.nextLine();
                    marcas[fila1][col1] = nueva_marca;
                    break;
                case 3:
                    System.out.println("Has seleccionado la operacion de eliminacion");
                    System.out.println("que marca va a eliminar: ");
                    String marca_a_eliminar = teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if(marcas[fila][col].equals(marca_a_eliminar)){
                                marcas[fila][col] = " ";
                            }

                        }

                    }
                    break;
                case 4:
                    System.out.println("Has seleccionado la operacion de lectura");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.println(marcas[fila][col] +"\t");

                        }

                    }
                    break;
                case 5:
                    System.out.println("Hasta proto gracias por preferirnos");
                    salir = true;
                    break;
                default:// cuando ingresen cosas que no le pedi
                    System.out.println("opcion invalida");

            }
        }
    }
}
