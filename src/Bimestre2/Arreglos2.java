package Bimestre2;

public class Arreglos2 {
    public static void main(String[] args) {
        //creacion de arreglos , sin valores predifinidos
        String univercidades [] = new String[5] ;
        System.out.println("arreglo univercidades: ");
        for (int indice = 0; indice < univercidades.length ; indice++) {
            System.out.println(univercidades[indice] + "\t");
        }
        int notas [] = new int [4];
        System.out.println("arreglo notas: ");
        for (int indice = 0; indice < notas.length ; indice++) {
            System.out.println(notas[indice] + "\t");

        }
        boolean valores[] = new boolean[10];
        System.out.println("arreglo valores: ");
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.println(valores[indice] + "\t");
            //creacion de un arreglo cuado en un inicio no conocemos su tamaño
            String nombres[]; // declaracion de un arreglo llamado nombre
            nombres = new String[10];  // Estamos creando un arreglo nombre

        }
    }
}
