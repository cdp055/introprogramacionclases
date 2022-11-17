package repeticion_while;

import javax.swing.*;

/**
 * Generar la tabla de multiplicar  hasta el 10 de un numero ingresado por el teclado
 */
public class TablaMultiplicacion {
    public static void main(String[] args) {
        //System.out.println("PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        JOptionPane.showMessageDialog(null, "PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICACION");
        //System.out.println("INGRESE UN NUMERO: ");
        String num = JOptionPane.showInputDialog("INGRESE UN NUMERO");
        int contador = 1;
        String acumulador = "";
        while (contador <= 10) {
            int mult = Integer.parseInt(num)  * contador;// convertimos valor string a
            String salida = num + "x" + String.valueOf(contador) + "=" + String.valueOf(mult) + "\n" ;
            acumulador = acumulador + salida;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null, acumulador);

    }
}
