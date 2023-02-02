package Bimestre2.Semana2;

public class Arreglo {
    public static void main(String[] args) {
        //Creacion de arreglos con valores predefinidos
        String univercidades [] = {"utpl" , "unl" , "espol" , "cuenca" ,"ufsq"};
        int tam= univercidades.length; //obtenemos el tamaño del arreglo
        System.out.println("tamaño del arreglo: " + tam);
        for (int Indice = 1; Indice < tam ; Indice++) {
            System.out.println( univercidades [Indice] +"\t" );
        }
        System.out.println("\n");
        //creando de un arreglo de tipo entero
        int notas [] = {7,8,5,4,10};
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.println(notas[indice]);

        }
        //creacion de un arreglo de tipo char
        char vocales [] = {'a', 'e', 'i', 'o', 'u'};
        for (int indice = 0; indice < vocales.length; indice++) {
            System.out.println(vocales[indice]);
        }
        //creacion de un arreglo de tipo boolean
        boolean valores[] = {true, false, false, true, true};
        for (int indice = 0; indice < valores.length ; indice++) {
            System.out.println(valores[indice]);
        }
        //creacion de un arreglo de tipo decimal
        double numeros[]={1.0, 2.5, 3.1};
    }
}
