package Bimestre2.Semana6.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumeros {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JLabel lbl_result;
    private JPanel panelPrincipal;
    private JButton restaButton;
    private JButton divisionButton;
    private JButton multiplicacionButton;
    private JPanel result;

    public SumaNumeros() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt( textField1. getText()) + Integer. parseInt(textField2. getText());
                lbl_result.setText(String.valueOf(suma));
            }
        });
        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta= Integer.parseInt( textField1. getText()) - Integer. parseInt(textField2.getText());
                lbl_result.setText(String. valueOf(resta));
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 =0;
                double n2 =0;
                double div =0;
                try{
                    n1 = Double.parseDouble(textField1.getText());
                    n2 = Double.parseDouble(textField2.getText());

                }catch (Exception error){
                    String mensaje = "Invalido";
                    lbl_result.setText(String.valueOf(mensaje));


                }
                double divi= Integer.parseInt(textField1.getText()) / Integer.parseInt(textField2.getText());
                lbl_result.setText(String.valueOf(divi));


            }
        });
        multiplicacionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mult = Integer.parseInt(textField1.getText())*Integer.parseInt(textField2.getText());
                lbl_result.setText(String.valueOf(mult));
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("Suma Numero");
        inicio.setContentPane(new SumaNumeros().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);

    }
}
