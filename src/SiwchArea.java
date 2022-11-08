import java.util.Scanner;

public class SiwchArea {
    public static void main(String[] args) {
        System.out.println("PPrograma para encontra el area de un triangulo un cuadrado y una circunferencia");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Determinar el area de un triangulo");
                System.out.println("ingrese el valor de base");
                double base = teclado.nextDouble();
                System.out.println("Ingresar el valor de altura");
                double altura = teclado.nextDouble();
                double area_triangulo = (base * altura) / 2;
                System.out.println("el area del triangulo es:" + area_triangulo);
                break;
            case 2:
                System.out.println("Determinar el area de un cuadrado");
                System.out.println("ingrese el valor del lado");
                double lado = teclado.nextDouble();
                System.out.println("Ingresar el valor del lado");
                double lado = teclado.nextDouble();
                double area_cuadrado = (lado * lado);
                System.out.println("el area del cuadrado es:" + area_cuadrado);
                break;
            case 3:
                System.out.println("Encontra el are de una circunferencia");
                double area, radio;
                System.out.println("Ingresar el valor del radio: ");
                Object entrada;
                radio = entrada.nexTDouble();
                area = Math.PI * Math.pow(radio,2);
                System.out.println("El area es:"+area);
                break;
            default:
                System.out.println("Valores incorrectos");

        }
        System.out.println("fin del sieth");
    }
}
