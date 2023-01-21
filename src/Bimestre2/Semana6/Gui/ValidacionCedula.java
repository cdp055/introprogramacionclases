package Bimestre2.Semana6.Gui;

import javax.swing.*;

public class ValidacionCedula {
    private JPanel PanelPrincipal;
    private JTextField textField1;
    private JButton validarButton;
    private JLabel validacion;

    Validación públicaCedula() {
        btn_validar. addActionListener(nuevo ActionListener() {
            @Invalidar
            public void actionPerformed(ActionEvent e) {
                Si (txt_ced. getText(). longitud() == 10) {
                    int cedula[] = new int[10];
                    Cadena ced = txt_ced. getText();
                    sistema. fuera. println(ced);
                    for (int indice = 0; Índice < cédula. longitud; Índice++) {
                        cedula[índice] = Carácter. getNumericValue(ced. charAt(índice)));
                        System.out.println(ced.charAt(indice));
                        sistema. fuera. println(cedula[índice]] + " ");
                    }

                    ValidacionCedula asd = new ValidacionCedula ();
                    for (int indice = 0; índice < 9; índice = índice + 2) {
                        cédula[índice] = cédula[índice] * 2;
                    }
                    for (int indice = 0; índice < 9; Índice++) {
                        si (cédula[índice] >= 10) {
                            Cédula[índice] = cédula[índice] - 9;
                        }
                    }
                    int acumulador = 0;
                    for (int indice = 0; índice < 9; Índice++) {
                        acumulador = cédula[índice] + acumulador;
                    }
                    int decena = 0;
                    mientras (acumulador < 99 || acumulador < 1000) {
                        decena = acumulador / 10;
                        quebrar;
                    }
                    sistema. fuera. println(decena);
                    decena = (decena * 10) + 10;
                    sistema. fuera. println(decena);
                    int resultadoresta = 0;
                    resultadoresta = decena - acumulador;

                    if (resultadoresta == cédula[9]) {
                        String mensaje1 = "Cedula Valida";
                        lbl_result. setText(mensaje1);
                    } más {
                        String mensaje2 = "Cedula invalidad";
                        lbl_result. setText(mensaje2);
                    }
                }más{
                    String mensaje4= "Cedula incorrecta";
                    lbl_result. setText(mensaje4);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("Validacion");
        inicio. setContentPane(new ValidacionCedula(). panelPrincipal);
        inicio. empaquetar();
        inicio. setVisible(true);
    }
}


