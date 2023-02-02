package Bimestre2.Semana4;
/**
 * Progrsms para calcular el promedio de los elemaentos de una matriz dada
 */
public class PromedioMatriz {
    public static void main(String[] args) {
        int numeros [][] = {
                {5,6},
                {2,7},
                {7,1},
                {3,4}
        };//dimencion de 4x2
        int suma_total = 0; // int o poner double en vez de int y eliminar los doubles de la linea 21
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
                suma_total = suma_total + numeros[fila][col];
            }
        }
        int numeros_elementos = numeros.length * numeros[0].length;//8
        double promedio = (double)suma_total / (double) numeros_elementos;
        System.out.println("suma: "+ suma_total);
        System.out.println("promedio: "+ promedio);
    }
}
